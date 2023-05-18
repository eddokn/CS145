import java.util.*;

public class StackExample{
  public static void main(String[] args){
    /*
     * push - add element to top of stack
     * pop - removing the topmost element
     * peek - return the topmost element, but don't remove
     * size - check number of elements
     * isEmpty - check if empty or not
     */

     Stack<Integer> mystack = new Stack<Integer>();
     mystack.push(1); // 1
     mystack.push(2); // 1, 2
     mystack.push(3); // 1,2,3
     int someInt = mystack.pop(); // 1,2 someInt = 3
     mystack.push(4); // 1,2,4
     int anotherInt = mystack.peek(); // 1,2,4 anotherInt = 4
     int sizeOfStack = mystack.size();
     boolean isempty = mystack.isEmpty();
  }
}
