package org.howietkl;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
  public static void main(String[] args) throws Exception {
    CharStream codePointCharStream = CharStreams.fromFileName(args[0]);
    SQLoLexer lexer = new SQLoLexer(codePointCharStream);
    SQLoParser parser = new SQLoParser(new CommonTokenStream(lexer));
    ParseTree tree = parser.program();
    MyVisitor visitor = new MyVisitor();
    visitor.visit(tree);
  }
}
