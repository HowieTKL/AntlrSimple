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