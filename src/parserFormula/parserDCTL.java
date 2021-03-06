
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Thu Oct 12 09:02:47 ART 2017
//----------------------------------------------------

package parserFormula;

import java_cup.runtime.*;
import formula.*;
import auxiliar.AuxiliarMethods;
import java.util.List;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Thu Oct 12 09:02:47 ART 2017
  */
public class parserDCTL extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parserDCTL() {super();}

  /** Constructor which sets the default scanner. */
  public parserDCTL(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parserDCTL(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\033\000\002\002\004\000\002\002\004\000\002\003" +
    "\004\000\002\003\005\000\002\003\005\000\002\004\003" +
    "\000\002\004\010\000\002\004\006\000\002\005\003\000" +
    "\002\005\005\000\002\006\003\000\002\006\005\000\002" +
    "\007\003\000\002\007\005\000\002\010\003\000\002\010" +
    "\005\000\002\011\003\000\002\011\004\000\002\012\003" +
    "\000\002\012\003\000\002\012\003\000\002\012\005\000" +
    "\002\013\003\000\002\013\003\000\002\013\003\000\002" +
    "\013\003\000\002\013\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\056\000\026\004\017\005\005\006\016\007\021\010" +
    "\011\011\014\016\012\017\023\020\006\024\015\001\002" +
    "\000\004\002\060\001\002\000\004\011\uffea\001\002\000" +
    "\014\011\014\016\012\017\023\020\006\024\015\001\002" +
    "\000\024\012\ufff3\014\ufff3\015\ufff3\021\ufff3\022\ufff3\023" +
    "\ufff3\025\ufff3\026\ufff3\027\055\001\002\000\020\012\ufff9" +
    "\014\ufff9\015\ufff9\022\ufff9\023\ufff9\025\031\026\ufff9\001" +
    "\002\000\004\011\uffe7\001\002\000\024\012\uffed\014\uffed" +
    "\015\uffed\021\uffed\022\uffed\023\uffed\025\uffed\026\uffed\027" +
    "\uffed\001\002\000\004\023\054\001\002\000\026\004\017" +
    "\005\005\006\016\007\021\010\011\011\014\016\012\017" +
    "\023\020\006\024\015\001\002\000\024\012\uffef\014\uffef" +
    "\015\uffef\021\uffef\022\uffef\023\uffef\025\uffef\026\uffef\027" +
    "\uffef\001\002\000\004\011\uffe9\001\002\000\004\011\uffeb" +
    "\001\002\000\022\012\ufff7\014\ufff7\015\ufff7\021\033\022" +
    "\ufff7\023\ufff7\025\ufff7\026\ufff7\001\002\000\004\011\uffe8" +
    "\001\002\000\004\011\035\001\002\000\024\012\uffee\014" +
    "\uffee\015\uffee\021\uffee\022\uffee\023\uffee\025\uffee\026\uffee" +
    "\027\uffee\001\002\000\024\012\ufff1\014\ufff1\015\ufff1\021" +
    "\ufff1\022\ufff1\023\ufff1\025\ufff1\026\ufff1\027\ufff1\001\002" +
    "\000\016\012\ufffc\014\ufffc\015\ufffc\022\ufffc\023\ufffc\026" +
    "\027\001\002\000\022\012\ufff5\014\ufff5\015\ufff5\021\ufff5" +
    "\022\ufff5\023\ufff5\025\ufff5\026\ufff5\001\002\000\014\011" +
    "\014\016\012\017\023\020\006\024\015\001\002\000\020" +
    "\012\ufff8\014\ufff8\015\ufff8\022\ufff8\023\ufff8\025\031\026" +
    "\ufff8\001\002\000\014\011\014\016\012\017\023\020\006" +
    "\024\015\001\002\000\022\012\ufff6\014\ufff6\015\ufff6\021" +
    "\033\022\ufff6\023\ufff6\025\ufff6\026\ufff6\001\002\000\014" +
    "\011\014\016\012\017\023\020\006\024\015\001\002\000" +
    "\022\012\ufff4\014\ufff4\015\ufff4\021\ufff4\022\ufff4\023\ufff4" +
    "\025\ufff4\026\ufff4\001\002\000\030\004\017\005\005\006" +
    "\016\007\021\010\011\011\014\013\040\016\012\017\023" +
    "\020\006\024\015\001\002\000\006\014\047\015\046\001" +
    "\002\000\006\012\042\022\043\001\002\000\026\004\017" +
    "\005\005\006\016\007\021\010\011\011\014\016\012\017" +
    "\023\020\006\024\015\001\002\000\006\012\uffff\022\uffff" +
    "\001\002\000\014\012\ufffa\014\ufffa\015\ufffa\022\ufffa\023" +
    "\ufffa\001\002\000\030\004\017\005\005\006\016\007\021" +
    "\010\011\011\014\013\040\016\012\017\023\020\006\024" +
    "\015\001\002\000\004\012\045\001\002\000\014\012\ufffb" +
    "\014\ufffb\015\ufffb\022\ufffb\023\ufffb\001\002\000\026\004" +
    "\017\005\005\006\016\007\021\010\011\011\014\016\012" +
    "\017\023\020\006\024\015\001\002\000\026\004\017\005" +
    "\005\006\016\007\021\010\011\011\014\016\012\017\023" +
    "\020\006\024\015\001\002\000\006\012\ufffe\022\ufffe\001" +
    "\002\000\006\012\ufffd\022\ufffd\001\002\000\004\012\053" +
    "\001\002\000\024\012\uffec\014\uffec\015\uffec\021\uffec\022" +
    "\uffec\023\uffec\025\uffec\026\uffec\027\uffec\001\002\000\004" +
    "\002\000\001\002\000\014\011\014\016\012\017\023\020" +
    "\006\024\015\001\002\000\022\012\ufff2\014\ufff2\015\ufff2" +
    "\021\ufff2\022\ufff2\023\ufff2\025\ufff2\026\ufff2\001\002\000" +
    "\024\012\ufff0\014\ufff0\015\ufff0\021\ufff0\022\ufff0\023\ufff0" +
    "\025\ufff0\026\ufff0\027\ufff0\001\002\000\004\002\001\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\056\000\024\002\003\004\012\005\024\006\007\007" +
    "\017\010\025\011\006\012\023\013\021\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\011\056\012\023\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\022\004\051\005" +
    "\024\006\007\007\017\010\025\011\006\012\023\013\021" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\014\006\027\007\017\010\025\011\006" +
    "\012\023\001\001\000\002\001\001\000\012\007\031\010" +
    "\025\011\006\012\023\001\001\000\002\001\001\000\010" +
    "\010\033\011\006\012\023\001\001\000\002\001\001\000" +
    "\024\003\036\004\035\005\024\006\007\007\017\010\025" +
    "\011\006\012\023\013\021\001\001\000\002\001\001\000" +
    "\002\001\001\000\022\004\040\005\024\006\007\007\017" +
    "\010\025\011\006\012\023\013\021\001\001\000\002\001" +
    "\001\000\002\001\001\000\024\003\043\004\035\005\024" +
    "\006\007\007\017\010\025\011\006\012\023\013\021\001" +
    "\001\000\002\001\001\000\002\001\001\000\022\004\050" +
    "\005\024\006\007\007\017\010\025\011\006\012\023\013" +
    "\021\001\001\000\022\004\047\005\024\006\007\007\017" +
    "\010\025\011\006\012\023\013\021\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\011\055\012\023\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parserDCTL$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parserDCTL$actions(this);
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
    return action_obj.CUP$parserDCTL$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



 
public void syntax_error(Symbol s){
        System.err.println("\n\nSyntax Error - line: " +  (s.left+1) +  " - value:" + s.value);
        
    }


    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception {    
         System.err.println("\n\nUnrecovered Syntax error line: " +  (s.left+1) +  " - value:" + s.value);
    }


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parserDCTL$actions {
  private final parserDCTL parser;

  /** Constructor */
  CUP$parserDCTL$actions(parserDCTL parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parserDCTL$do_action(
    int                        CUP$parserDCTL$act_num,
    java_cup.runtime.lr_parser CUP$parserDCTL$parser,
    java.util.Stack            CUP$parserDCTL$stack,
    int                        CUP$parserDCTL$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parserDCTL$result;

      /* select the action based on the action number */
      switch (CUP$parserDCTL$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // quantifier ::= RECOVERY 
            {
              String RESULT =null;
		int rleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).right;
		String r = (String)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.peek()).value;
		 RESULT = r ;  
              CUP$parserDCTL$result = parser.getSymbolFactory().newSymbol("quantifier",9, ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), RESULT);
            }
          return CUP$parserDCTL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // quantifier ::= OBLIGATION 
            {
              String RESULT =null;
		int oleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).left;
		int oright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).right;
		String o = (String)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.peek()).value;
		 RESULT = o ; 
              CUP$parserDCTL$result = parser.getSymbolFactory().newSymbol("quantifier",9, ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), RESULT);
            }
          return CUP$parserDCTL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // quantifier ::= PERMISSION 
            {
              String RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).right;
		String p = (String)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.peek()).value;
		 RESULT = p ; 
              CUP$parserDCTL$result = parser.getSymbolFactory().newSymbol("quantifier",9, ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), RESULT);
            }
          return CUP$parserDCTL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // quantifier ::= FORALL 
            {
              String RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).right;
		String f = (String)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.peek()).value;
		 RESULT = f ; 
              CUP$parserDCTL$result = parser.getSymbolFactory().newSymbol("quantifier",9, ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), RESULT);
            }
          return CUP$parserDCTL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // quantifier ::= EXIST 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.peek()).value;
		 RESULT = e ; 
              CUP$parserDCTL$result = parser.getSymbolFactory().newSymbol("quantifier",9, ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), RESULT);
            }
          return CUP$parserDCTL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // primary ::= LPAREN state_form RPAREN 
            {
              FormulaElement RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)).right;
		String d = (String)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).right;
		FormulaElement s = (FormulaElement)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.peek()).value;
		 RESULT = s; 
              CUP$parserDCTL$result = parser.getSymbolFactory().newSymbol("primary",8, ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)), ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), RESULT);
            }
          return CUP$parserDCTL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // primary ::= TRUE 
            {
              FormulaElement RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).right;
		String t = (String)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.peek()).value;
		 RESULT = new Constant(t,true);
              CUP$parserDCTL$result = parser.getSymbolFactory().newSymbol("primary",8, ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), RESULT);
            }
          return CUP$parserDCTL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // primary ::= FALSE 
            {
              FormulaElement RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).right;
		String t = (String)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.peek()).value;
		 RESULT = new Constant(t,false);
              CUP$parserDCTL$result = parser.getSymbolFactory().newSymbol("primary",8, ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), RESULT);
            }
          return CUP$parserDCTL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // primary ::= ID 
            {
              FormulaElement RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.peek()).value;
		 	
                    RESULT = new Variable(i);  
                 
              CUP$parserDCTL$result = parser.getSymbolFactory().newSymbol("primary",8, ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), RESULT);
            }
          return CUP$parserDCTL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // negation ::= NEG negation 
            {
              FormulaElement RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).right;
		FormulaElement p = (FormulaElement)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.peek()).value;
		 RESULT = new Negation( n , p);  
              CUP$parserDCTL$result = parser.getSymbolFactory().newSymbol("negation",7, ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)), ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), RESULT);
            }
          return CUP$parserDCTL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // negation ::= primary 
            {
              FormulaElement RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).right;
		FormulaElement p = (FormulaElement)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.peek()).value;
		 RESULT = p; 
              CUP$parserDCTL$result = parser.getSymbolFactory().newSymbol("negation",7, ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), RESULT);
            }
          return CUP$parserDCTL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // comparison ::= negation COMPARISON negation 
            {
              FormulaElement RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)).right;
		FormulaElement p = (FormulaElement)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).value;
		int qleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).left;
		int qright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).right;
		FormulaElement q = (FormulaElement)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.peek()).value;
		 RESULT = new EqComparison(c, p ,q);  
              CUP$parserDCTL$result = parser.getSymbolFactory().newSymbol("comparison",6, ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)), ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), RESULT);
            }
          return CUP$parserDCTL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // comparison ::= negation 
            {
              FormulaElement RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).right;
		FormulaElement n = (FormulaElement)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.peek()).value;
		 RESULT = n; 
              CUP$parserDCTL$result = parser.getSymbolFactory().newSymbol("comparison",6, ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), RESULT);
            }
          return CUP$parserDCTL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // implication ::= implication IMPLIES comparison 
            {
              FormulaElement RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)).right;
		FormulaElement p = (FormulaElement)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).value;
		int qleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).left;
		int qright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).right;
		FormulaElement q = (FormulaElement)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.peek()).value;
		 RESULT = new Implication(i, p, q);  
              CUP$parserDCTL$result = parser.getSymbolFactory().newSymbol("implication",5, ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)), ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), RESULT);
            }
          return CUP$parserDCTL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // implication ::= comparison 
            {
              FormulaElement RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).right;
		FormulaElement c = (FormulaElement)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.peek()).value;
		 RESULT = c; 
              CUP$parserDCTL$result = parser.getSymbolFactory().newSymbol("implication",5, ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), RESULT);
            }
          return CUP$parserDCTL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // conjunction ::= conjunction AND implication 
            {
              FormulaElement RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)).right;
		FormulaElement p = (FormulaElement)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).value;
		int qleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).left;
		int qright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).right;
		FormulaElement q = (FormulaElement)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.peek()).value;
		 RESULT = new Conjunction(a, p, q);  
              CUP$parserDCTL$result = parser.getSymbolFactory().newSymbol("conjunction",4, ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)), ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), RESULT);
            }
          return CUP$parserDCTL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // conjunction ::= implication 
            {
              FormulaElement RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).right;
		FormulaElement i = (FormulaElement)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.peek()).value;
		 RESULT = i; 
              CUP$parserDCTL$result = parser.getSymbolFactory().newSymbol("conjunction",4, ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), RESULT);
            }
          return CUP$parserDCTL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // log_operation ::= log_operation OR conjunction 
            {
              FormulaElement RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)).right;
		FormulaElement p = (FormulaElement)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).right;
		String o = (String)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).value;
		int qleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).left;
		int qright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).right;
		FormulaElement q = (FormulaElement)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.peek()).value;
		 RESULT = new Disjunction(o, p, q);  
              CUP$parserDCTL$result = parser.getSymbolFactory().newSymbol("log_operation",3, ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)), ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), RESULT);
            }
          return CUP$parserDCTL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // log_operation ::= conjunction 
            {
              FormulaElement RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).right;
		FormulaElement c = (FormulaElement)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.peek()).value;
		 RESULT = c; 
              CUP$parserDCTL$result = parser.getSymbolFactory().newSymbol("log_operation",3, ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), RESULT);
            }
          return CUP$parserDCTL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // state_form ::= quantifier LPAREN path_form RPAREN 
            {
              FormulaElement RESULT =null;
		int qleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-3)).left;
		int qright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-3)).right;
		String q = (String)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-3)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).right;
		FormulaElement p = (FormulaElement)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).value;
		 RESULT = AuxiliarMethods.rewriteFormula(q,p);  
              CUP$parserDCTL$result = parser.getSymbolFactory().newSymbol("state_form",2, ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-3)), ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), RESULT);
            }
          return CUP$parserDCTL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // state_form ::= quantifier LPAREN path_form IMPLIESTEMP path_form RPAREN 
            {
              FormulaElement RESULT =null;
		int qleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-5)).left;
		int qright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-5)).right;
		String q = (String)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-5)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-3)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-3)).right;
		FormulaElement p = (FormulaElement)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-3)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).right;
		FormulaElement r = (FormulaElement)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).value;
		 RESULT = AuxiliarMethods.rewriteFormula(q, p, r);  
              CUP$parserDCTL$result = parser.getSymbolFactory().newSymbol("state_form",2, ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-5)), ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), RESULT);
            }
          return CUP$parserDCTL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // state_form ::= log_operation 
            {
              FormulaElement RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).right;
		FormulaElement l = (FormulaElement)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.peek()).value;
		 RESULT = l; 
              CUP$parserDCTL$result = parser.getSymbolFactory().newSymbol("state_form",2, ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), RESULT);
            }
          return CUP$parserDCTL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // path_form ::= state_form WEAK state_form 
            {
              FormulaElement RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)).right;
		FormulaElement p = (FormulaElement)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)).value;
		int wleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).left;
		int wright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).right;
		String w = (String)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).value;
		int qleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).left;
		int qright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).right;
		FormulaElement q = (FormulaElement)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.peek()).value;
		 RESULT = new Weak(w, p, q); 
              CUP$parserDCTL$result = parser.getSymbolFactory().newSymbol("path_form",1, ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)), ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), RESULT);
            }
          return CUP$parserDCTL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // path_form ::= state_form UNTIL state_form 
            {
              FormulaElement RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)).right;
		FormulaElement p = (FormulaElement)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)).value;
		int uleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).left;
		int uright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).right;
		String u = (String)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).value;
		int qleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).left;
		int qright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).right;
		FormulaElement q = (FormulaElement)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.peek()).value;
		 RESULT = new Until(u, p, q); 
              CUP$parserDCTL$result = parser.getSymbolFactory().newSymbol("path_form",1, ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-2)), ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), RESULT);
            }
          return CUP$parserDCTL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // path_form ::= NEXT state_form 
            {
              FormulaElement RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()).right;
		FormulaElement s = (FormulaElement)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.peek()).value;
		 RESULT = new Next(n, s); 
              CUP$parserDCTL$result = parser.getSymbolFactory().newSymbol("path_form",1, ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)), ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), RESULT);
            }
          return CUP$parserDCTL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // formula ::= state_form SEMI 
            {
              FormulaElement RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).right;
		FormulaElement s = (FormulaElement)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).value;
		 RESULT = s; 
                              
              CUP$parserDCTL$result = parser.getSymbolFactory().newSymbol("formula",0, ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)), ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), RESULT);
            }
          return CUP$parserDCTL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= formula EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).right;
		FormulaElement start_val = (FormulaElement)((java_cup.runtime.Symbol) CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)).value;
		RESULT = start_val;
              CUP$parserDCTL$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.elementAt(CUP$parserDCTL$top-1)), ((java_cup.runtime.Symbol)CUP$parserDCTL$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parserDCTL$parser.done_parsing();
          return CUP$parserDCTL$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

