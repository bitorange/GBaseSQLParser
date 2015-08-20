package cn.edu.bit.linc.sqlparser;


import cn.edu.bit.linc.sqlparser.antlr.uniformSQLLexer;
import cn.edu.bit.linc.sqlparser.antlr.uniformSQLParser;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 用户与系统连接和交互用的 Shell，可以读取外部文件，或者直接用户直接输入命令 <br>
 * Reference: https://github.com/stdunbar/jisql
 */
public class Shell {
    private String user, password, inputQuery, fileName;
    private final String commandTerminator = ";";

    public void doInputSQLCommand() {
        /* 确定输入源 */
        BufferedReader reader = null;
        StringBuffer query;
        if (fileName != null) {
            try {
                reader = new BufferedReader(new FileReader(fileName));
            } catch (FileNotFoundException e) {
                System.err.println("找不到指定 SQL 文件 " + fileName);
                System.exit(-1);
            }
        } else {
            reader = new BufferedReader(new InputStreamReader(System.in));
        }

        try {
            while (true) {
                int lineCount = 1;
                // 从 System.in 输入
                if (fileName == null && inputQuery == null) {
                    System.out.print("\nEnter a query:\n");
                }

                query = new StringBuffer();
                while (true) {
                    // 从 System.in 输入
                    if (fileName == null && inputQuery == null) {
                        System.out.print(lineCount++ + " > ");
                        System.out.flush();
                    }

                    String line;
                    if (inputQuery == null) {
                        line = reader.readLine();
                    } else {
                        line = inputQuery.toString();
                        if (!line.trim().endsWith(commandTerminator)) {
                            line = line.trim().concat(commandTerminator);
                        }
                    }

                    // 退出系统
                    if (line == null || line.equalsIgnoreCase("quit") || line.equalsIgnoreCase("exit"))
                        return;

                    // 重置
                    if (line.equals("reset")) {
                        query = new StringBuffer();
                        break;
                    }

                    // 结束
                    if (line.trim().equalsIgnoreCase(commandTerminator) || line.trim().endsWith(commandTerminator)) {
                        if (line.trim().endsWith(commandTerminator)) {
                            line = line.substring(0, line.length() - commandTerminator.length());
                            line = StringUtil.RegexStringTool.removeNumberSignAndDoubleDashComment(line);
                            query.append("\n");
                            query.append(line);
                        }
                        break;
                    }
                    line = StringUtil.RegexStringTool.removeNumberSignAndDoubleDashComment(line);
                    query.append("\n");
                    query.append(line);
                }

                // 删除注释
                String queryStr = StringUtil.RegexStringTool.removeComments(query.toString().replaceAll("\n", " "));
                if (queryStr.length() == 0) continue;
                System.out.println(queryStr);

                /* 执行 SQL 语句 */
                InputStream is = new ByteArrayInputStream(queryStr.getBytes(StandardCharsets.UTF_8));
                try {
                    // 词语、语法解析，生成抽象语法树
                    ANTLRInputStream input = new ANTLRInputStream(is);
                    uniformSQLLexer lexer = new uniformSQLLexer(input);
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    uniformSQLParser parser = new uniformSQLParser(tokens);
                    ParseTree tree = parser.root_statement();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                if (inputQuery != null)
                    return;
            }
        } catch (Exception e) {
            System.err.println("读取 SQL 命令失败");
            System.exit(0);
        }
    }

    /**
     * 解析程序参数
     *
     * @param args 程序参数
     */
    private void parseArgs(String[] args) {
        /* 构建解析器 */
        OptionParser parser = new OptionParser();
        parser.posixlyCorrect(false);

        parser.accepts("u").withRequiredArg().ofType(String.class);
        parser.accepts("p").withRequiredArg().ofType(String.class);
        parser.accepts("f").withRequiredArg().ofType(String.class);
        parser.accepts("q").withRequiredArg().ofType(String.class);
        parser.accepts("help");

        /* 解析与提取参数 */
        OptionSet options = parser.parse(args);
        if (options.has("help")) {
            printUsage();
            System.exit(0);
        }

        if (options.has("u")) {
            user = (String) options.valueOf("u");
        }

        if (options.has("p")) {
            password = (String) options.valueOf("p");
        }

        if (options.has("f")) {
            fileName = (String) options.valueOf("f");
        }

        if (options.has("q")) {
            inputQuery = (String) options.valueOf("q");
            fileName = null;
        }
    }

    /**
     * 输出程序用法
     */
    private static void printUsage() {
        System.err.println();
        System.err.println("Usage: java " + Shell.class.getName() + " -u username -p password [-f file_name] " +
                " [-q query_command]");
        System.err.println("Where:");
        System.err.println("\t-u Specifies a user name to log into a database server with.");
        System.err.println("\t-p Password specifies the user name to log into a database server with.");
        System.err.println("\t-f Specifies a file name to read commands from.");
        System.err.println("\t-q specifies an optional signal query to run instead of interacting with the command line or a file.");
    }

    public static void main(String[] args) throws IOException {
        Shell shell = new Shell();
        shell.parseArgs(args);

        shell.doInputSQLCommand();
    }
}
