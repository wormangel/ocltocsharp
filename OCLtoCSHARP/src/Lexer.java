/* The following code was generated by JFlex 1.4.3 on 6/30/10 4:41 PM */

import java_cup.runtime.*;


/**
 * This class is a simple example lexer.
 */

class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\64\2\0\1\12\22\0\1\1\2\0\1\57\3\0"+
    "\1\11\1\44\1\45\1\62\1\7\1\53\1\10\1\5\1\63\12\3"+
    "\1\52\1\60\1\55\1\54\1\56\1\0\1\35\1\30\3\2\1\6"+
    "\14\2\1\65\10\2\1\46\1\0\1\47\1\0\1\4\1\0\1\40"+
    "\1\37\1\25\1\32\1\15\1\27\1\41\1\31\1\21\1\2\1\43"+
    "\1\24\1\33\1\22\1\16\1\13\1\42\1\14\1\17\1\20\1\34"+
    "\1\23\1\2\1\26\1\2\1\36\1\50\1\61\1\51\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\1\4\1\0\1\5\1\6\1\7"+
    "\1\0\14\3\1\0\2\3\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\2\30\2\0\1\31\1\1"+
    "\1\0\1\32\1\33\7\3\1\34\5\3\1\35\7\3"+
    "\1\0\3\3\1\36\1\37\1\40\1\41\2\4\1\0"+
    "\1\2\1\42\10\3\1\43\6\3\1\44\2\3\1\45"+
    "\3\3\1\46\2\3\1\0\1\3\1\47\1\50\1\51"+
    "\2\3\1\52\2\3\1\53\4\3\1\54\1\55\1\56"+
    "\3\3\1\57\4\3\1\60\4\3\1\61\12\3\1\62"+
    "\2\3\1\63\1\3\1\64\1\3\1\65\6\3\1\66"+
    "\1\3\1\67\3\3\1\70\1\3\1\71\1\72\1\3"+
    "\1\73\1\3\1\74\1\75\1\76\3\3\1\77\1\100";

  private static int [] zzUnpackAction() {
    int [] result = new int[185];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\66\0\154\0\242\0\330\0\u010e\0\u0144\0\u017a"+
    "\0\u01b0\0\u01e6\0\u021c\0\u0252\0\u0288\0\u02be\0\u02f4\0\u032a"+
    "\0\u0360\0\u0396\0\u03cc\0\u0402\0\u0438\0\u046e\0\u04a4\0\u04da"+
    "\0\u0144\0\u0144\0\u0144\0\u0144\0\u0144\0\u0144\0\u0510\0\u0144"+
    "\0\u0144\0\u0546\0\u057c\0\u0144\0\u0144\0\u0144\0\u0144\0\u0144"+
    "\0\u0144\0\154\0\u05b2\0\u05e8\0\u0144\0\u061e\0\u0654\0\u0144"+
    "\0\u0144\0\u068a\0\u06c0\0\u06f6\0\u072c\0\u0762\0\u0798\0\u07ce"+
    "\0\154\0\u0804\0\u083a\0\u0870\0\u08a6\0\u08dc\0\154\0\u0912"+
    "\0\u0948\0\u097e\0\u09b4\0\u09ea\0\u0a20\0\u0a56\0\u0a8c\0\u0ac2"+
    "\0\u0af8\0\u0b2e\0\u0144\0\u0144\0\u0144\0\u0144\0\u0b64\0\u0b9a"+
    "\0\u0b9a\0\u0144\0\154\0\u0bd0\0\u0c06\0\u0c3c\0\u0c72\0\u0ca8"+
    "\0\u0cde\0\u0d14\0\u0d4a\0\154\0\u0d80\0\u0db6\0\u0dec\0\u0e22"+
    "\0\u0e58\0\u0e8e\0\154\0\u0ec4\0\u0efa\0\154\0\u0f30\0\u0f66"+
    "\0\u0f9c\0\154\0\u0fd2\0\u1008\0\u103e\0\u1074\0\154\0\154"+
    "\0\154\0\u10aa\0\u10e0\0\154\0\u1116\0\u114c\0\154\0\u1182"+
    "\0\u11b8\0\u11ee\0\u1224\0\154\0\154\0\154\0\u125a\0\u1290"+
    "\0\u12c6\0\154\0\u12fc\0\u1332\0\u1368\0\u139e\0\u0144\0\u13d4"+
    "\0\u140a\0\u1440\0\u1476\0\154\0\u14ac\0\u14e2\0\u1518\0\u154e"+
    "\0\u1584\0\u15ba\0\u15f0\0\u1626\0\u165c\0\u1692\0\154\0\u16c8"+
    "\0\u16fe\0\154\0\u1734\0\154\0\u176a\0\154\0\u17a0\0\u17d6"+
    "\0\u180c\0\u1842\0\u1878\0\u18ae\0\154\0\u18e4\0\154\0\u191a"+
    "\0\u1950\0\u1986\0\154\0\u19bc\0\154\0\154\0\u19f2\0\154"+
    "\0\u1a28\0\154\0\154\0\154\0\u1a5e\0\u1a94\0\u1aca\0\154"+
    "\0\154";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[185];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\0\1\2\1\3\1\4\1\5\1\6\1\3\1\7"+
    "\1\10\1\11\1\2\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\3\1\23\1\24\1\25"+
    "\5\3\1\26\1\3\1\27\1\30\3\3\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
    "\1\0\1\2\10\0\1\2\55\0\2\3\2\0\1\3"+
    "\4\0\22\3\1\0\6\3\21\0\1\3\3\0\1\4"+
    "\1\0\1\53\1\54\61\0\1\3\1\0\1\5\1\0"+
    "\1\3\4\0\22\3\1\0\6\3\21\0\1\3\5\0"+
    "\1\55\151\0\1\56\4\0\1\57\45\0\1\60\7\0"+
    "\11\11\1\61\54\11\2\0\2\3\2\0\1\3\4\0"+
    "\1\3\1\62\1\3\1\63\16\3\1\0\2\3\1\64"+
    "\3\3\21\0\1\3\2\0\2\3\2\0\1\3\4\0"+
    "\2\3\1\65\17\3\1\0\6\3\21\0\1\3\2\0"+
    "\2\3\2\0\1\3\4\0\7\3\1\66\1\3\1\67"+
    "\1\3\1\70\6\3\1\0\6\3\21\0\1\3\2\0"+
    "\2\3\2\0\1\3\4\0\1\3\1\71\20\3\1\0"+
    "\6\3\21\0\1\3\2\0\2\3\2\0\1\3\4\0"+
    "\2\3\1\72\3\3\1\73\13\3\1\0\6\3\21\0"+
    "\1\3\2\0\2\3\2\0\1\3\4\0\1\3\1\74"+
    "\14\3\1\75\3\3\1\0\6\3\21\0\1\3\2\0"+
    "\2\3\2\0\1\3\4\0\7\3\1\76\4\3\1\77"+
    "\3\3\1\100\1\3\1\0\6\3\21\0\1\3\2\0"+
    "\2\3\2\0\1\3\4\0\3\3\1\101\16\3\1\0"+
    "\6\3\21\0\1\3\2\0\2\3\2\0\1\3\4\0"+
    "\3\3\1\102\16\3\1\0\6\3\21\0\1\3\2\0"+
    "\2\3\2\0\1\3\4\0\3\3\1\103\16\3\1\0"+
    "\6\3\21\0\1\3\2\0\2\3\2\0\1\3\4\0"+
    "\3\3\1\104\16\3\1\0\6\3\21\0\1\3\2\0"+
    "\2\3\2\0\1\3\4\0\3\3\1\105\16\3\1\0"+
    "\2\3\1\106\3\3\21\0\1\3\13\0\1\107\54\0"+
    "\2\3\2\0\1\3\4\0\3\3\1\110\16\3\1\0"+
    "\2\3\1\111\3\3\21\0\1\3\2\0\2\3\2\0"+
    "\1\3\4\0\7\3\1\112\12\3\1\0\6\3\21\0"+
    "\1\3\52\0\1\113\67\0\1\114\1\0\1\115\63\0"+
    "\1\116\14\0\1\117\65\0\1\120\3\0\2\121\60\0"+
    "\1\56\62\0\12\57\1\122\53\57\2\0\2\3\2\0"+
    "\1\3\4\0\2\3\1\123\17\3\1\0\6\3\21\0"+
    "\1\3\2\0\2\3\2\0\1\3\4\0\4\3\1\124"+
    "\15\3\1\0\6\3\21\0\1\3\2\0\2\3\2\0"+
    "\1\3\4\0\12\3\1\125\7\3\1\0\6\3\21\0"+
    "\1\3\2\0\2\3\2\0\1\3\4\0\4\3\1\126"+
    "\15\3\1\0\2\3\1\127\3\3\21\0\1\3\2\0"+
    "\2\3\2\0\1\3\4\0\17\3\1\130\2\3\1\0"+
    "\6\3\21\0\1\3\2\0\2\3\2\0\1\3\4\0"+
    "\4\3\1\131\15\3\1\0\6\3\21\0\1\3\2\0"+
    "\2\3\2\0\1\3\4\0\6\3\1\132\3\3\1\133"+
    "\7\3\1\0\6\3\21\0\1\3\2\0\2\3\2\0"+
    "\1\3\4\0\5\3\1\134\3\3\1\135\10\3\1\0"+
    "\4\3\1\136\1\3\21\0\1\3\2\0\2\3\2\0"+
    "\1\3\4\0\22\3\1\0\1\137\5\3\21\0\1\3"+
    "\2\0\2\3\2\0\1\3\4\0\21\3\1\140\1\0"+
    "\6\3\21\0\1\3\2\0\2\3\2\0\1\3\4\0"+
    "\2\3\1\141\17\3\1\0\6\3\21\0\1\3\2\0"+
    "\2\3\2\0\1\3\4\0\5\3\1\142\2\3\1\143"+
    "\1\3\1\144\7\3\1\0\6\3\21\0\1\3\2\0"+
    "\2\3\2\0\1\3\4\0\1\145\21\3\1\0\6\3"+
    "\21\0\1\3\2\0\2\3\2\0\1\3\4\0\5\3"+
    "\1\146\14\3\1\0\6\3\21\0\1\3\2\0\2\3"+
    "\2\0\1\3\4\0\6\3\1\147\13\3\1\0\6\3"+
    "\21\0\1\3\2\0\2\3\2\0\1\3\4\0\7\3"+
    "\1\150\1\3\1\151\10\3\1\0\6\3\21\0\1\3"+
    "\2\0\2\3\2\0\1\3\4\0\1\3\1\152\20\3"+
    "\1\0\6\3\21\0\1\3\2\0\2\3\2\0\1\3"+
    "\4\0\1\3\1\153\20\3\1\0\6\3\21\0\1\3"+
    "\2\0\2\3\2\0\1\3\4\0\11\3\1\154\10\3"+
    "\1\0\6\3\21\0\1\3\14\0\1\155\53\0\2\3"+
    "\2\0\1\3\4\0\3\3\1\156\16\3\1\0\6\3"+
    "\21\0\1\3\2\0\2\3\2\0\1\3\4\0\22\3"+
    "\1\0\3\3\1\157\2\3\21\0\1\3\2\0\2\3"+
    "\2\0\1\3\4\0\17\3\1\160\2\3\1\0\6\3"+
    "\21\0\1\3\3\0\1\117\2\0\1\54\62\0\1\120"+
    "\64\0\2\3\2\0\1\3\4\0\5\3\1\161\14\3"+
    "\1\0\6\3\21\0\1\3\2\0\2\3\2\0\1\3"+
    "\4\0\22\3\1\0\5\3\1\162\21\0\1\3\2\0"+
    "\2\3\2\0\1\3\4\0\21\3\1\163\1\0\6\3"+
    "\21\0\1\3\2\0\2\3\2\0\1\3\4\0\11\3"+
    "\1\164\10\3\1\0\6\3\21\0\1\3\2\0\2\3"+
    "\2\0\1\3\4\0\1\165\5\3\1\166\13\3\1\0"+
    "\6\3\21\0\1\3\2\0\2\3\2\0\1\3\4\0"+
    "\2\3\1\167\17\3\1\0\6\3\21\0\1\3\2\0"+
    "\2\3\2\0\1\3\4\0\4\3\1\170\15\3\1\0"+
    "\6\3\21\0\1\3\2\0\2\3\2\0\1\3\4\0"+
    "\11\3\1\171\10\3\1\0\6\3\21\0\1\3\2\0"+
    "\2\3\2\0\1\3\4\0\2\3\1\172\17\3\1\0"+
    "\6\3\21\0\1\3\2\0\2\3\2\0\1\3\4\0"+
    "\21\3\1\173\1\0\6\3\21\0\1\3\2\0\2\3"+
    "\2\0\1\3\4\0\2\3\1\174\17\3\1\0\6\3"+
    "\21\0\1\3\2\0\2\3\2\0\1\3\4\0\2\3"+
    "\1\175\17\3\1\0\6\3\21\0\1\3\2\0\2\3"+
    "\2\0\1\3\4\0\7\3\1\176\12\3\1\0\6\3"+
    "\21\0\1\3\2\0\2\3\2\0\1\3\4\0\2\3"+
    "\1\177\17\3\1\0\6\3\21\0\1\3\2\0\2\3"+
    "\2\0\1\3\4\0\11\3\1\200\10\3\1\0\6\3"+
    "\21\0\1\3\2\0\2\3\2\0\1\3\4\0\11\3"+
    "\1\201\10\3\1\0\6\3\21\0\1\3\2\0\2\3"+
    "\2\0\1\3\4\0\17\3\1\202\2\3\1\0\6\3"+
    "\21\0\1\3\2\0\2\3\2\0\1\3\4\0\5\3"+
    "\1\203\14\3\1\0\6\3\21\0\1\3\2\0\2\3"+
    "\2\0\1\3\4\0\11\3\1\204\10\3\1\0\6\3"+
    "\21\0\1\3\2\0\2\3\2\0\1\3\4\0\15\3"+
    "\1\205\4\3\1\0\6\3\21\0\1\3\2\0\2\3"+
    "\2\0\1\3\4\0\4\3\1\206\15\3\1\0\6\3"+
    "\21\0\1\3\15\0\1\207\52\0\2\3\2\0\1\3"+
    "\4\0\11\3\1\210\10\3\1\0\6\3\21\0\1\3"+
    "\2\0\2\3\2\0\1\3\4\0\22\3\1\0\2\3"+
    "\1\211\3\3\21\0\1\3\2\0\2\3\2\0\1\3"+
    "\4\0\11\3\1\212\10\3\1\0\6\3\21\0\1\3"+
    "\2\0\2\3\2\0\1\3\4\0\22\3\1\0\2\3"+
    "\1\213\3\3\21\0\1\3\2\0\2\3\2\0\1\3"+
    "\4\0\14\3\1\214\5\3\1\0\6\3\21\0\1\3"+
    "\2\0\2\3\2\0\1\3\4\0\5\3\1\215\14\3"+
    "\1\0\6\3\21\0\1\3\2\0\2\3\2\0\1\3"+
    "\4\0\21\3\1\216\1\0\6\3\21\0\1\3\2\0"+
    "\2\3\2\0\1\3\4\0\12\3\1\217\7\3\1\0"+
    "\6\3\21\0\1\3\2\0\2\3\2\0\1\3\4\0"+
    "\2\3\1\220\17\3\1\0\6\3\21\0\1\3\2\0"+
    "\2\3\2\0\1\3\4\0\22\3\1\0\3\3\1\221"+
    "\2\3\21\0\1\3\2\0\2\3\2\0\1\3\4\0"+
    "\21\3\1\222\1\0\6\3\21\0\1\3\2\0\2\3"+
    "\2\0\1\3\4\0\6\3\1\223\13\3\1\0\6\3"+
    "\21\0\1\3\2\0\2\3\2\0\1\3\4\0\2\3"+
    "\1\224\17\3\1\0\6\3\21\0\1\3\2\0\2\3"+
    "\2\0\1\3\4\0\2\3\1\225\17\3\1\0\6\3"+
    "\21\0\1\3\2\0\2\3\2\0\1\3\4\0\11\3"+
    "\1\226\10\3\1\0\6\3\21\0\1\3\2\0\2\3"+
    "\2\0\1\3\4\0\2\3\1\227\17\3\1\0\6\3"+
    "\21\0\1\3\2\0\2\3\2\0\1\3\4\0\2\3"+
    "\1\230\17\3\1\0\6\3\21\0\1\3\2\0\2\3"+
    "\2\0\1\3\4\0\22\3\1\0\3\3\1\231\2\3"+
    "\21\0\1\3\2\0\2\3\2\0\1\3\4\0\5\3"+
    "\1\232\14\3\1\0\6\3\21\0\1\3\2\0\2\3"+
    "\2\0\1\3\4\0\12\3\1\233\7\3\1\0\6\3"+
    "\21\0\1\3\2\0\2\3\2\0\1\3\4\0\4\3"+
    "\1\234\15\3\1\0\6\3\21\0\1\3\2\0\2\3"+
    "\2\0\1\3\4\0\17\3\1\235\2\3\1\0\6\3"+
    "\21\0\1\3\2\0\2\3\2\0\1\3\4\0\5\3"+
    "\1\236\14\3\1\0\6\3\21\0\1\3\2\0\2\3"+
    "\2\0\1\3\4\0\7\3\1\237\12\3\1\0\6\3"+
    "\21\0\1\3\2\0\2\3\2\0\1\3\4\0\2\3"+
    "\1\240\17\3\1\0\6\3\21\0\1\3\2\0\2\3"+
    "\2\0\1\3\4\0\17\3\1\241\2\3\1\0\6\3"+
    "\21\0\1\3\2\0\2\3\2\0\1\3\4\0\2\3"+
    "\1\242\17\3\1\0\6\3\21\0\1\3\2\0\2\3"+
    "\2\0\1\3\4\0\13\3\1\243\6\3\1\0\6\3"+
    "\21\0\1\3\2\0\2\3\2\0\1\3\4\0\12\3"+
    "\1\244\7\3\1\0\6\3\21\0\1\3\2\0\2\3"+
    "\2\0\1\3\4\0\11\3\1\245\10\3\1\0\6\3"+
    "\21\0\1\3\2\0\2\3\2\0\1\3\4\0\22\3"+
    "\1\0\2\3\1\246\3\3\21\0\1\3\2\0\2\3"+
    "\2\0\1\3\4\0\2\3\1\247\17\3\1\0\6\3"+
    "\21\0\1\3\2\0\2\3\2\0\1\3\4\0\22\3"+
    "\1\0\5\3\1\250\21\0\1\3\2\0\2\3\2\0"+
    "\1\3\4\0\2\3\1\251\17\3\1\0\6\3\21\0"+
    "\1\3\2\0\2\3\2\0\1\3\4\0\12\3\1\252"+
    "\7\3\1\0\6\3\21\0\1\3\2\0\2\3\2\0"+
    "\1\3\4\0\1\3\1\253\20\3\1\0\6\3\21\0"+
    "\1\3\2\0\2\3\2\0\1\3\4\0\2\3\1\254"+
    "\17\3\1\0\6\3\21\0\1\3\2\0\2\3\2\0"+
    "\1\3\4\0\4\3\1\255\15\3\1\0\6\3\21\0"+
    "\1\3\2\0\2\3\2\0\1\3\4\0\5\3\1\256"+
    "\14\3\1\0\6\3\21\0\1\3\2\0\2\3\2\0"+
    "\1\3\4\0\5\3\1\257\14\3\1\0\6\3\21\0"+
    "\1\3\2\0\2\3\2\0\1\3\4\0\7\3\1\260"+
    "\12\3\1\0\6\3\21\0\1\3\2\0\2\3\2\0"+
    "\1\3\4\0\22\3\1\0\2\3\1\261\3\3\21\0"+
    "\1\3\2\0\2\3\2\0\1\3\4\0\4\3\1\262"+
    "\15\3\1\0\6\3\21\0\1\3\2\0\2\3\2\0"+
    "\1\3\4\0\2\3\1\263\17\3\1\0\6\3\21\0"+
    "\1\3\2\0\2\3\2\0\1\3\4\0\4\3\1\264"+
    "\15\3\1\0\6\3\21\0\1\3\2\0\2\3\2\0"+
    "\1\3\4\0\6\3\1\265\13\3\1\0\6\3\21\0"+
    "\1\3\2\0\2\3\2\0\1\3\4\0\22\3\1\0"+
    "\3\3\1\266\2\3\21\0\1\3\2\0\2\3\2\0"+
    "\1\3\4\0\3\3\1\267\16\3\1\0\6\3\21\0"+
    "\1\3\2\0\2\3\2\0\1\3\4\0\2\3\1\270"+
    "\17\3\1\0\6\3\21\0\1\3\2\0\2\3\2\0"+
    "\1\3\4\0\7\3\1\271\12\3\1\0\6\3\21\0"+
    "\1\3";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6912];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\1\1\0\1\1\1\11\1\1\1\0\14\1\1\0"+
    "\2\1\6\11\1\1\2\11\2\1\6\11\1\1\2\0"+
    "\1\11\1\1\1\0\2\11\25\1\1\0\3\1\4\11"+
    "\2\1\1\0\1\11\32\1\1\0\31\1\1\11\62\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[185];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  StringBuffer string = new StringBuffer();

  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }
  
  private int linha = 1;
  private boolean debug = false;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 138) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 49: 
          { if(debug) System.out.print("( ENDIF )"); return symbol(sym.ENDIF);
          }
        case 65: break;
        case 30: 
          { if(debug) System.out.print("( 22PONTOS )"); return symbol(sym.QUATROPONTOS);
          }
        case 66: break;
        case 53: 
          { if(debug) System.out.print("( SELECT )"); return symbol(sym.SELECT);
          }
        case 67: break;
        case 59: 
          { if(debug) System.out.print("( BOOLEAN )"); return symbol(sym.BOOLEAN);
          }
        case 68: break;
        case 50: 
          { if(debug) System.out.print("( FALSE )"); return symbol(sym.FALSE, new Atributos(Boolean.class, false, ""));
          }
        case 69: break;
        case 17: 
          { if(debug) System.out.print("( MENORQ )"); return symbol(sym.MENORQ);
          }
        case 70: break;
        case 46: 
          { if(debug) System.out.print("( THEN )"); return symbol(sym.THEN);
          }
        case 71: break;
        case 7: 
          { if(debug) System.out.print("( MENOS )"); return symbol(sym.MENOS, "-");
          }
        case 72: break;
        case 47: 
          { if(debug) System.out.print("( VOID )"); return symbol(sym.VOID);
          }
        case 73: break;
        case 3: 
          { if(debug) System.out.print("( ID , "+ yytext() + " )" ); return symbol(sym.ID, new Atributos(String.class, yytext(),""));
          }
        case 74: break;
        case 16: 
          { if(debug) System.out.print("( IGUAL )"); return symbol(sym.IGUAL);
          }
        case 75: break;
        case 35: 
          { if(debug) System.out.print("( SET )"); return symbol(sym.SET);
          }
        case 76: break;
        case 27: 
          { if(debug) System.out.print("( STR , "+yytext()+" )"  ); return symbol(sym.STRING, new Atributos(String.class, yytext(),""));
          }
        case 77: break;
        case 36: 
          { if(debug) System.out.print("( INV )"); return symbol(sym.INV);
          }
        case 78: break;
        case 29: 
          { if(debug) System.out.print("( IF )"); return symbol(sym.IF);
          }
        case 79: break;
        case 60: 
          { if(debug) System.out.print("( EXCLUDES )"); return symbol(sym.EXCLUDING);
          }
        case 80: break;
        case 57: 
          { if(debug) System.out.print("( IMPLIES )"); return symbol(sym.IMPLIES, new Atributos(String.class, "implies", ""));
          }
        case 81: break;
        case 4: 
          { if(debug) System.out.print("( REAL , " +yytext()+" )"); return symbol(sym.REAL, new Atributos(Double.class, yytext(),""));
          }
        case 82: break;
        case 58: 
          { if(debug) System.out.print("( CONTEXT )"); return symbol(sym.CONTEXT);
          }
        case 83: break;
        case 19: 
          { if(debug) System.out.print("( SUST )"); return symbol(sym.SHARP);
          }
        case 84: break;
        case 18: 
          { if(debug) System.out.print("( MAIORQ )"); return symbol(sym.MAIORQ);
          }
        case 85: break;
        case 40: 
          { if(debug) System.out.print("( AND )"); return symbol(sym.AND, new Atributos(String.class, "and", ""));
          }
        case 86: break;
        case 63: 
          { if(debug) System.out.print("( ENDPACKAGE )"); return symbol(sym.ENDPACKAGE);
          }
        case 87: break;
        case 12: 
          { if(debug) System.out.print("( LCHAVE )"); return symbol(sym.LCHAVE);
          }
        case 88: break;
        case 52: 
          { if(debug) System.out.print("( EXISTS )"); return symbol(sym.EXISTS);
          }
        case 89: break;
        case 1: 
          { if(debug) System.out.print("( INT , " +yytext()+" )"); return symbol(sym.INTEGER, new Atributos(Integer.class, yytext(),""));
          }
        case 90: break;
        case 5: 
          { if(debug) System.out.print("( PONTO )"); return symbol(sym.PONTO);
          }
        case 91: break;
        case 24: 
          { linha++;if(debug) System.out.println(); if(debug) System.out.println(linha+ "  ");
          }
        case 92: break;
        case 26: 
          { if(debug) System.out.print("( SETA )"); return symbol(sym.SETA);
          }
        case 93: break;
        case 8: 
          { if(debug) System.out.print("( LPAREN )"); return symbol(sym.LPAREN);
          }
        case 94: break;
        case 11: 
          { if(debug) System.out.print("( RCOLCH )"); return symbol(sym.RCOLCH);
          }
        case 95: break;
        case 6: 
          { if(debug) System.out.print("( MAIS )"); return symbol(sym.MAIS, "+");
          }
        case 96: break;
        case 54: 
          { if(debug) System.out.print("( FORALL )"); return symbol(sym.FORALL);
          }
        case 97: break;
        case 32: 
          { if(debug) System.out.print("( DIFF )"); return symbol(sym.DIFF);
          }
        case 98: break;
        case 56: 
          { if(debug) System.out.print("( INTTYPE)"); return symbol(sym.INTTYPE);
          }
        case 99: break;
        case 62: 
          { if(debug) System.out.print("( INCLUDING )"); return symbol(sym.INCLUDING);
          }
        case 100: break;
        case 55: 
          { if(debug) System.out.print("( PACKAGE )"); return symbol(sym.PACKAGE);
          }
        case 101: break;
        case 21: 
          { if(debug) System.out.print("( BARRA )"); return symbol(sym.BARRA);
          }
        case 102: break;
        case 48: 
          { if(debug) System.out.print("( ARROBAPRE )"); return symbol(sym.ATPRE);
          }
        case 103: break;
        case 42: 
          { if(debug) System.out.print("( REALTYPE )"); return symbol(sym.REALTYPE);
          }
        case 104: break;
        case 25: 
          { if(debug) System.out.print("( PONTOPONTO )"); return symbol(sym.PONTOPONTO);
          }
        case 105: break;
        case 43: 
          { if(debug) System.out.print("( ELSE )"); return symbol(sym.ELSE);
          }
        case 106: break;
        case 15: 
          { if(debug) System.out.print("( VIRGULA )"); return symbol(sym.VIRGULA);
          }
        case 107: break;
        case 22: 
          { if(debug) System.out.print("( VEZES )"); return symbol(sym.VEZES, "*");
          }
        case 108: break;
        case 61: 
          { if(debug) System.out.print("( SEQUENCE )"); return symbol(sym.SEQUENCE);
          }
        case 109: break;
        case 14: 
          { if(debug) System.out.print("( 2PONTOS )"); return symbol(sym.DOISPONTOS);
          }
        case 110: break;
        case 37: 
          { if(debug) System.out.print("( NOT )"); return symbol(sym.NOT);
          }
        case 111: break;
        case 23: 
          { if(debug) System.out.print("( DIVIDIR )"); return symbol(sym.DIVIDIR, "/");
          }
        case 112: break;
        case 20: 
          { if(debug) System.out.print("( PONTOVIRGULA )"); return symbol(sym.PONTOVIRGULA);
          }
        case 113: break;
        case 64: 
          { if(debug) System.out.print("( COLLECTION )"); return symbol(sym.COLLECTION);
          }
        case 114: break;
        case 44: 
          { if(debug) System.out.print("( SIZE )"); return symbol(sym.SIZE);
          }
        case 115: break;
        case 34: 
          { if(debug) System.out.print("( PRE )"); return symbol(sym.PRE);
          }
        case 116: break;
        case 13: 
          { if(debug) System.out.print("( RCHAVE )"); return symbol(sym.RCHAVE);
          }
        case 117: break;
        case 28: 
          { if(debug) System.out.print("( OR )"); return symbol(sym.OR, new Atributos(String.class, "or", ""));
          }
        case 118: break;
        case 39: 
          { if(debug) System.out.print("( BAG )"); return symbol(sym.BAG);
          }
        case 119: break;
        case 45: 
          { if(debug) System.out.print("( TRUE )"); return symbol(sym.TRUE, new Atributos(Boolean.class, true, ""));
          }
        case 120: break;
        case 10: 
          { if(debug) System.out.print("( LCOLCH )"); return symbol(sym.LCOLCH);
          }
        case 121: break;
        case 9: 
          { if(debug) System.out.print("( RPAREN )"); return symbol(sym.RPAREN);
          }
        case 122: break;
        case 41: 
          { if(debug) System.out.print("( POS )"); return symbol(sym.POS);
          }
        case 123: break;
        case 33: 
          { if(debug) System.out.print("( MAIORIGUAL )"); return symbol(sym.MAIORIGUAL);
          }
        case 124: break;
        case 31: 
          { if(debug) System.out.print("( MENORIGUAL )"); return symbol(sym.MENORIGUAL);
          }
        case 125: break;
        case 51: 
          { if(debug) System.out.print("( RESULT )"); return symbol(sym.RESULT);
          }
        case 126: break;
        case 38: 
          { if(debug) System.out.print("( XOR )"); return symbol(sym.XOR, new Atributos(String.class, "xor", ""));
          }
        case 127: break;
        case 2: 
          { 
          }
        case 128: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
