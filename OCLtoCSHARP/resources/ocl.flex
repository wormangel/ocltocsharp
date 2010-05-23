import java_cup.runtime.*;


/**
 * This class is a simple example lexer.
 */
%%

%class Lexer
%unicode
%cup
%line
%column


%{
  StringBuffer string = new StringBuffer();

  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }
%}

delim	= [ \t\r]
ws		= {delim}+
letter	= [A-Za-z]
digit	= [0-9]
id		= [_]*{letter}({letter}|{digit})*
real	= {digit}+(\.{digit}+)?(E[+-]?{digit}+)?
integer = ([\-]({digit})* | ({digit})*)
string	= [\"]({letter}|{digit})*[\"]
comment = [\-][\-]({letter}|{digit})*

%%

"pre"		{System.out.print("( PRE )"); return symbol(sym.PRE); }
"pos"		{System.out.print("( POS )"); return symbol(sym.POS); }
"inv"		{System.out.print("( INV )"); return symbol(sym.INV); }
"select"	{System.out.print("( SELECT )"); return symbol(sym.SELECT); }
"exists"	{System.out.print("( EXISTS )"); return symbol(sym.EXISTS); }
"forAll"	{System.out.print("( FORALL )"); return symbol(sym.FORALL); }
"if"		{System.out.print("( IF )"); return symbol(sym.IF); }
"then"		{System.out.print("( THEN )"); return symbol(sym.THEN); }
"else"		{System.out.print("( ELSE )"); return symbol(sym.ELSE); }
"endif"		{System.out.print("( ENDIF )"); return symbol(sym.ENDIF); }
"implies"	{System.out.print("( IMPLIES )"); return symbol(sym.IMPLIES); }
"including"	{System.out.print("( INCLUDING )"); return symbol(sym.INCLUDING); }
"excluding"	{System.out.print("( EXCLUDING )"); return symbol(sym.EXCLUDING); }
"oclIsNew"	{System.out.print("( OCLISNEW )"); return symbol(sym.OCLISNEW); }
"@pre"		{System.out.print("( ARROBAPRE )"); return symbol(sym.ATPRE); }
"result"	{System.out.print("( RESULT )"); return symbol(sym.RESULT); }
"size"		{System.out.print("( SIZE )"); return symbol(sym.SIZE); }
"context"	{System.out.print("( CONTEXT )"); return symbol(sym.CONTEXT); }
"set"		{System.out.print("( SET )"); return symbol(sym.SET); }
"bag"		{System.out.print("( BAG )"); return symbol(sym.BAG); }
"collection" {System.out.print("( COLLECTION )"); return symbol(sym.COLLECTION); }
"sequence"	{System.out.print("( SEQUENCE )"); return symbol(sym.SEQUENCE); }
"and"		{System.out.print("( AND )"); return symbol(sym.AND); }
"or"		{System.out.print("( OR )"); return symbol(sym.OR); }
"xor"		{System.out.print("( XOR )"); return symbol(sym.XOR); }
"not"		{System.out.print("( NOT )"); return symbol(sym.NOT); }
"("			{System.out.print("( LPAREN )"); return symbol(sym.LPAREN); }
")"			{System.out.print("( RPAREN )"); return symbol(sym.RPAREN); }
"["			{System.out.print("( LCOLCH )"); return symbol(sym.LCOLCH); }
"]"			{System.out.print("( RCOLCH )"); return symbol(sym.RCOLCH); }
"{"			{System.out.print("( LCHAVE )"); return symbol(sym.LCHAVE); }
"}"			{System.out.print("( RCHAVE )"); return symbol(sym.RCHAVE); }	
":"			{System.out.print("( 2PONTOS )"); return symbol(sym.DOISPONTOS); }
"::"		{System.out.print("( 22PONTOS )"); return symbol(sym.QUATROPONTOS); }
","			{System.out.print("( VIRGULA )"); return symbol(sym.VIRGULA); }
"="			{System.out.print("( IGUAL )"); return symbol(sym.IGUAL); }
"<>"		{System.out.print("( DIFF )"); return symbol(sym.DIFF); }
"<"			{System.out.print("( MENORQ )"); return symbol(sym.MENORQ); }
">"			{System.out.print("( MAIORQ )"); return symbol(sym.MAIORQ); }
"<="		{System.out.print("( MENORIGUAL )"); return symbol(sym.MENORIGUAL); }
">="		{System.out.print("( MAIORIGUAL )"); return symbol(sym.MAIORIGUAL); }
"->"		{System.out.print("( SETA )"); return symbol(sym.SETA); }
".."		{System.out.print("( PONTOPONTO )"); return symbol(sym.PONTOPONTO); }
"."			{System.out.print("( PONTO )"); return symbol(sym.PONTO); }
"#"			{System.out.print("( SUST )"); return symbol(sym.SHARP); }
";"			{System.out.print("( PONTOVIRGULA )"); return symbol(sym.PONTOVIRGULA); }
"|"			{System.out.print("( BARRA )"); return symbol(sym.BARRA); }
"+"			{System.out.print("( MAIS )"); return symbol(sym.MAIS); }
"-"			{System.out.print("( MENOS )"); return symbol(sym.MENOS); }
"*"			{System.out.print("( VEZES )"); return symbol(sym.VEZES); }
"/"			{System.out.print("( DIVIDIR )"); return symbol(sym.DIVIDIR); }
"true"		{System.out.print("( TRUE )"); return symbol(sym.TRUE, new Boolean(true)); }
"false"		{System.out.print("( FALSE )"); return symbol(sym.FALSE, new Boolean(false)); }
"void"		{System.out.print("( VOID )"); return symbol(sym.VOID); }
"boolean"	{System.out.print("( BOOLEAN )"); return symbol(sym.BOOLEAN); }
{ws}		{}
"\n"		{System.out.println();}
{id}		{System.out.print("( ID , "+ yytext() + " )" ); return symbol(sym.ID, yytext()); }
{string}	{System.out.print("( STR , "+yytext()+" )"  ); return symbol(sym.STRING, yytext()); }
{real}		{System.out.print("( REAL , " +yytext()+" )"); return symbol(sym.REAL, new Double(yytext())); }
{integer}	{System.out.print("( INT , " +yytext()+" )"); return symbol(sym.INTEGER, new Integer(yytext())); }
{comment}	{}