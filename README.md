Simple use of Antlr with a short grammar specification. Primarily to demonstrate to myself an Antlr deployment, as well as after generating its code, how to integrate with it. The following grammar just implements a line of SQL to `SELECT column FROM table`. The grammar file combines both parser and lexer: lower case declarations for the parser, while upper case for the lexer.

```
grammar SQLo;

program
    : 'SELECT' column 'FROM' table EOF
    ;

column
    : ID
    ;

table
    : ID
    ;

ID
    : [a-zA-Z_] [a-zA-Z_0-9]*
    ;

WS
    : [ \r\n] -> skip
    ;
```

Along with a sample query test.sql file...

```
SELECT name FROM juice
```

We then have code that extends the visitor for the "table" callback, which will print out,

```
juice
```

Screenshot of the sample parse in IntelliJ's Antlr plugin:

<img width="574" alt="antlr simple" src="https://github.com/user-attachments/assets/6c4a6b8a-2ffe-4d46-817e-26b637f0afc9" />
