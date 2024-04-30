grammar Brainfuck;

main : com EOF;

com  :    LT    com            # lt
     |    GT    com            # gt
     |    PLUS  com            # plus
     |    MINUS com            # minus
     |    DOT   com            # dot
     |    COMMA com            # comma
     |    LBRAK com RBRAK com  # loop
     |                         # nil
     ;

LT       : '<' ;
GT       : '>' ;
PLUS     : '+' ;
MINUS    : '-' ;
DOT      : '.' ;
COMMA    : ',' ;
LBRAK    : '[' ;
RBRAK    : ']' ;

WS    : [ \n\r\t]+ -> skip ;