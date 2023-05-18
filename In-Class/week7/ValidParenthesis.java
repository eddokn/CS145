/*Given a string containing ust the characters '(' and ')'. Determine if the input string is valid. For a string to be valid, there must be the same amount of opening parenthesis to closing parenthesis and they have to be in correct order.
 * "()" and "()()()" are valid
 * "((())())" is also valid
 * ")(" and "(()" are not valid
 */

// your task: find the bug

import java.util.*;

public class ValidParenthesis {

  public static boolean isValid(String s) {
      Stack<Character> st = new Stack<Character>();
      for (char c: s.toCharArray()) {
          if (c == '(') {
              st.push(c);
          } else if (c == ')' && !st.isEmpty() && st.peek() == '(') {
              st.pop();
          } else if( c==')'){
              return false;
          }
      }

      if (st.isEmpty()) return true;
      else return false;
  }

  public static void main(String[] args){
    boolean result = isValid("( ( () ) () )"); // true
    boolean result1 = isValid("((())"); // false
    boolean result2 = isValid("sum(power(multiply(7, 6),2),5)"); // true
    boolean result3 = isValid("(sum(power(multiply(7, 6),2),5)"); // false
    System.out.println(result);
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
  }
  // step
  // next (not step over)
  // step up (not step out)
}
