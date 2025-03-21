package org.howietkl;

public class MyVisitor extends SQLoBaseVisitor<String> {
  @Override
  public String visitTable(SQLoParser.TableContext ctx) {
    System.out.println(ctx.getText());
    return super.visitTable(ctx);
  }
}
