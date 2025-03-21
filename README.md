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
Screenshot of the sample parse in IntelliJ's Antlr plugin:

<img width="574" alt="antlr simple" src="https://github.com/user-attachments/assets/6c4a6b8a-2ffe-4d46-817e-26b637f0afc9" />
