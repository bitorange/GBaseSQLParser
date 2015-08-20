#!/bin/zsh
source ~/.zshrc
antlr4 -package cn.edu.bit.linc.sqlparser.antlr uniformSQL.g4
javac *.java
