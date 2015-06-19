/**
 * Define a gramática L linha
 */
grammar LLinha;

programa  
: ENDLINE* comandos 'fim' ENDLINE* EOF
| ENDLINE* comandos ENDLINE* EOF {notifyErrorListeners("'fim' Nao encontrado."); System.exit(1);}
;

comandos  :  comando ENDLINE+ (comandos)* ;

comando 
: se
| 'enquanto' condicao 'faca' ENDLINE* comandos 'fim-enquanto'
| 'para' ID 'de' NUMERO 'ate' NUMERO 'faca' ENDLINE* comandos 'fim-para'
| ID '=' condicao
| vetor '=' condicao 
| 'funcao' ID'('params')' comandos 'fim-funcao'
| ID '('params')' {notifyErrorListeners("A gramatica nao aceita chamada de funcoes."); System.exit(1);}
| dclvetor
//ERROS mais especificos
| 'e' '=' condicao {notifyErrorListeners("Caracter reservado: 'e'"); System.exit(1);}
| 'x' '=' condicao {notifyErrorListeners("Caracter reservado: 'x'"); System.exit(1);}
;

se
: 'se' condicao 'entao' ENDLINE* comandos ('senao' ENDLINE* comandos)? 'fim-se'
//ERROS mais especificos
| 'se' condicao ENDLINE* comandos ('senao' ENDLINE* comandos)? 'fim-se' {notifyErrorListeners("O 'entao' do 'se' nao foi encontrado. "); System.exit(1);}
| 'se' condicao 'entao' ENDLINE* comandos ('senao' ENDLINE* comandos)? {notifyErrorListeners("O 'fim-se' do 'se' nao foi encontrado. "); System.exit(1);}
;

condicao 
: condicao 'e' expressao 
| condicao 'ou' expressao
| condicao '==' expressao
| condicao dif expressao
| condicao '<' expressao
| condicao menori expressao
| condicao '>' expressao
| condicao maiori expressao
| expressao
;

expressao 
: expressao '+' expressaoprec 
| expressao '-' expressaoprec 
| expressaoprec;


expressaoprec 
: '('expressao')'
| expressaoprec div expressaoprec
| expressaoprec mult expressaoprec
| termo
// ERROS
;


termo 
: '(' condicao ')'
| ID
| vetor
| NUMERO
| DECIMAL
| 'verdadeiro'
| 'falso'
| ID'('params')'
| STRING
;


vetor 
: ID ('['condicao']')+;

dclvetor: 'vetor' ID ('['NUMERO']')+ ;

params: condicao (',' params)* ;

DECIMAL: NUMERO [,.] NUMERO+;
NUMERO : ('0'..'9')+;


STRING
: '\"' (~["])* '\"' 
;


ID 
: [a-zA-Z] [a-zA-Z0-9_]*
;

ENDLINE: [\r\n] ;//-> skip ;
DEVOURER: [\r\n] -> skip;
WS : [ \t\f]+  -> skip ; // skip spaces, tabs, newlines
COMMENTS : '#' ~[#]* '#' -> skip ; // comentários


dif: '!=' | '=!';
menori: '<=' | '=<';
maiori: '>=' | '=>';
mult: '*'|'x';
div: ':'|'/';

//ErrorCharacter : . ;
//OTHER : . -> skip ;
//handle characters which failed to match any other token
