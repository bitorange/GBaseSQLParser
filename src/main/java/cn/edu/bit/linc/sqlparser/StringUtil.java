package cn.edu.bit.linc.sqlparser;

/**
 * 字符串相关工具类
 */
public class StringUtil {
    /**
     * 随机字符串生成类
     */
    public static class RandomStringGenerator {
        public enum Mode {
            ALPHA, ALPHANUMERIC, NUMERIC
        }

        /**
         * 生成指定长度的随机字符串
         *
         * @param length 字符串长度
         * @param mode   字符类型
         * @return 随机生成的字符串
         */
        public static String generateRandomString(int length, Mode mode) {
            StringBuffer buffer = new StringBuffer();
            String characters = "";
            switch (mode) {
                case ALPHA:
                    characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
                    break;
                case ALPHANUMERIC:
                    characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
                    break;
                case NUMERIC:
                    characters = "1234567890";
                    break;
            }

            int charactersLength = characters.length();
            for (int i = 0; i < length; ++i) {
                double index = Math.random() * charactersLength;
                buffer.append(characters.charAt((int) index));
            }

            return buffer.toString();
        }
    }

    public static class RegexStringTool {
        public static String removeNumberSignAndDoubleDashComment(String sqlLine){
            return sqlLine.replaceAll("-- .*$", "").replaceAll("#.*$", "");

        }

        public static String removeComments(String sqlCommand) {
            return sqlCommand.replaceAll("(?://.*)|(/\\*(?:.|[\\n\\r])*?\\*/)", "");
        }
    }

    public static void main(String[] args) {
        // System.out.println(RegexStringTool.removeComments("SELECT * FROM /* comment*/ user -- comment"));
        System.out.println(RegexStringTool.removeNumberSignAndDoubleDashComment("SELECT * FROM user # comment\n"));
        System.out.println(RegexStringTool.removeComments("SELECT * FROM user/* comment */ WHERE"));

    }
}