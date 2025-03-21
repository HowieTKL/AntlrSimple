A relatively simple deployment of Antlr with a short grammar specification:

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

Along with a sample test.sql file

```
SELECT name FROM juice
```

We then have code that extends the visitor, detecting the "table" callback, then printing out:

```
juice
```
