
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import javax.swing.JOptionPane;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\051\000\002\002\004\000\002\025\003\000\002\025" +
    "\003\000\002\026\003\000\002\026\003\000\002\027\003" +
    "\000\002\027\003\000\002\030\003\000\002\002\005\000" +
    "\002\005\005\000\002\006\005\000\002\006\005\000\002" +
    "\004\004\000\002\004\005\000\002\004\005\000\002\004" +
    "\005\000\002\007\003\000\002\007\003\000\002\007\003" +
    "\000\002\007\006\000\002\010\005\000\002\011\005\000" +
    "\002\011\002\000\002\012\004\000\002\012\004\000\002" +
    "\013\004\000\002\013\006\000\002\014\004\000\002\015" +
    "\005\000\002\015\002\000\002\016\007\000\002\017\004" +
    "\000\002\020\005\000\002\020\002\000\002\021\005\000" +
    "\002\022\004\000\002\023\005\000\002\023\002\000\002" +
    "\024\003\000\002\024\003\000\002\024\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\114\000\010\034\017\035\015\036\010\001\002\000" +
    "\004\002\116\001\002\000\004\002\ufffe\001\002\000\004" +
    "\002\000\001\002\000\004\002\ufffb\001\002\000\020\002" +
    "\uffd9\014\uffd9\015\uffd9\024\uffd9\026\uffd9\027\uffd9\030\uffd9" +
    "\001\002\000\004\002\ufffa\001\002\000\004\030\020\001" +
    "\002\000\004\002\ufffc\001\002\000\004\002\uffff\001\002" +
    "\000\020\002\uffda\014\uffda\015\uffda\024\uffda\026\uffda\027" +
    "\uffda\030\uffda\001\002\000\004\002\ufffd\001\002\000\020" +
    "\002\uffdb\014\uffdb\015\uffdb\024\uffdb\026\uffdb\027\uffdb\030" +
    "\uffdb\001\002\000\022\002\uffeb\014\021\025\024\032\023" +
    "\033\031\034\017\035\015\036\010\001\002\000\004\023" +
    "\064\001\002\000\004\002\uffed\001\002\000\006\004\032" +
    "\016\033\001\002\000\010\034\017\035\015\036\010\001" +
    "\002\000\004\030\052\001\002\000\004\002\ufff9\001\002" +
    "\000\006\002\uffdc\015\047\001\002\000\004\002\uffdf\001" +
    "\002\000\006\004\032\016\033\001\002\000\010\034\017" +
    "\035\015\036\010\001\002\000\004\023\035\001\002\000" +
    "\004\030\uffe9\001\002\000\010\034\017\035\015\036\010" +
    "\001\002\000\004\024\044\001\002\000\006\015\041\024" +
    "\uffe4\001\002\000\004\024\uffe6\001\002\000\010\034\017" +
    "\035\015\036\010\001\002\000\006\015\041\024\uffe4\001" +
    "\002\000\004\024\uffe5\001\002\000\004\030\uffe7\001\002" +
    "\000\004\030\uffe8\001\002\000\004\002\uffde\001\002\000" +
    "\010\034\017\035\015\036\010\001\002\000\006\002\uffdc" +
    "\015\047\001\002\000\004\002\uffdd\001\002\000\010\002" +
    "\uffeb\032\023\033\031\001\002\000\004\002\uffec\001\002" +
    "\000\006\026\uffe0\027\060\001\002\000\004\026\056\001" +
    "\002\000\004\002\uffe3\001\002\000\004\026\uffe2\001\002" +
    "\000\010\034\017\035\015\036\010\001\002\000\006\026" +
    "\uffe0\027\060\001\002\000\004\026\uffe1\001\002\000\004" +
    "\030\uffea\001\002\000\006\032\065\033\067\001\002\000" +
    "\012\004\073\007\072\010\074\011\071\001\002\000\006" +
    "\002\ufff8\024\ufff8\001\002\000\012\004\073\007\072\010" +
    "\074\011\071\001\002\000\004\024\113\001\002\000\004" +
    "\031\111\001\002\000\004\031\107\001\002\000\016\023" +
    "\101\034\017\035\015\036\010\037\102\040\100\001\002" +
    "\000\004\031\075\001\002\000\016\023\101\034\017\035" +
    "\015\036\010\037\102\040\100\001\002\000\004\024\ufff1" +
    "\001\002\000\004\024\ufff3\001\002\000\004\024\uffef\001" +
    "\002\000\010\034\017\035\015\036\010\001\002\000\004" +
    "\024\ufff0\001\002\000\004\014\021\001\002\000\004\024" +
    "\105\001\002\000\004\024\uffee\001\002\000\004\024\ufff5" +
    "\001\002\000\016\023\101\034\017\035\015\036\010\037" +
    "\102\040\100\001\002\000\004\024\ufff4\001\002\000\016" +
    "\023\101\034\017\035\015\036\010\037\102\040\100\001" +
    "\002\000\004\024\ufff2\001\002\000\006\002\ufff6\024\ufff6" +
    "\001\002\000\004\024\115\001\002\000\006\002\ufff7\024" +
    "\ufff7\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\114\000\024\002\005\010\012\016\010\021\004\024" +
    "\011\025\003\026\013\027\015\030\006\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\014\005\025\011\021" +
    "\012\024\022\027\024\026\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\013\062\001\001\000\006\017\054" +
    "\024\053\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\023\045\001\001\000\002\001\001\000\004\013\033" +
    "\001\001\000\004\024\044\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\014\035\024\036\001\001\000\002" +
    "\001\001\000\004\015\037\001\001\000\002\001\001\000" +
    "\004\024\041\001\001\000\004\015\042\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\024\047\001\001\000\004\023\050\001\001" +
    "\000\002\001\001\000\006\011\052\012\024\001\001\000" +
    "\002\001\001\000\004\020\056\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\024\060\001" +
    "\001\000\004\020\061\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\006\065\001\001\000\004\004\113\001" +
    "\001\000\002\001\001\000\004\004\067\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\007" +
    "\105\024\075\001\001\000\002\001\001\000\006\007\076" +
    "\024\075\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\024\102\001\001\000\002\001\001" +
    "\000\004\005\103\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\007\107\024\075\001\001" +
    "\000\002\001\001\000\006\007\111\024\075\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public parser (java.io.Reader input) {
        super(new AnalisadorLexico(input));
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicial EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // inicial ::= definida 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicial",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // inicial ::= segunda 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicial",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // segunda ::= coberta 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("segunda",20, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // segunda ::= terceira 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("segunda",20, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // terceira ::= primitiva 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("terceira",21, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // terceira ::= quarta 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("terceira",21, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // quarta ::= enumerada 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("quarta",22, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // definida ::= nome_classe NOVALINHA linha_def 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("definida",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // linha_def ::= AND ABREPAR fat_def 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("linha_def",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // fat_def ::= HAS desc_def FECHAPAR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("fat_def",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // fat_def ::= IS desc_def FECHAPAR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("fat_def",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // desc_def ::= SOME final_def 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("desc_def",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // desc_def ::= MIN NUMERO final_def 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("desc_def",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // desc_def ::= MAX NUMERO final_def 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("desc_def",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // desc_def ::= EXACTLY NUMERO final_def 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("desc_def",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // final_def ::= nome_classe 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("final_def",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // final_def ::= INT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("final_def",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // final_def ::= FLOAT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("final_def",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // final_def ::= ABREPAR nome_classe linha_def FECHAPAR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("final_def",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // primitiva ::= nome_classe NOVALINHA cl_pri 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("primitiva",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // cl_pri ::= linha_pri NOVALINHA cl_pri 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("cl_pri",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // cl_pri ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("cl_pri",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // linha_pri ::= HAS desc_pri 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("linha_pri",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // linha_pri ::= IS desc_pri 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("linha_pri",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // desc_pri ::= SOME nome_classe 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("desc_pri",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // desc_pri ::= ONLY ABREPAR final_pri FECHAPAR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("desc_pri",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // final_pri ::= nome_classe r_pri 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("final_pri",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // r_pri ::= OR nome_classe r_pri 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("r_pri",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // r_pri ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("r_pri",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // enumerada ::= nome_classe NOVALINHA ABRECHAVE linha_enu FECHACHAVE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("enumerada",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // linha_enu ::= nome_classe r_enu 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("linha_enu",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // r_enu ::= VIRGULA nome_classe r_enu 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("r_enu",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // r_enu ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("r_enu",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // coberta ::= nome_classe NOVALINHA linha_cob 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("coberta",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // linha_cob ::= nome_classe r_cob 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("linha_cob",16, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // r_cob ::= OR nome_classe r_cob 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("r_cob",17, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // r_cob ::= 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("r_cob",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // nome_classe ::= CLASSE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("nome_classe",18, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // nome_classe ::= CLASSECOMP 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("nome_classe",18, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // nome_classe ::= CLASSEUNDER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("nome_classe",18, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
