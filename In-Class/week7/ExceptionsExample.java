import java.util.*;

public class ExceptionsExample{

  /*
  - in mario 64, the game crashes sometimes when mario collides with 
    an enemy at just the right speed and angle. 
  - when mario's hitbox collides with an enemy's hitbox, he is knocked back
  - mario's knockback-velocity increases as the distance between mario 
    and the enemy's centerpoint decreases
  - under what condition would this code crash?
  
  onEnemyCollision(enemy){
    ...
    mario.setVelocity(1/distanceBetween(mario, enemy))
    ...
  }
  */

  public static int A(){
    return B();
  }
  public static int B(){
    return C();
  }
  public static int C(){
    return naiveDivide1(1,0);
  }
  public static int naiveDivide1(int a, int b){
    return a/b;
  }

  public static int naiveDivide2(int a, int b){
    int result = 0;
    try {
      result = a/b;
    } catch (ArithmeticException exptn) {
      System.out.println("You tried to divide by 0 dummy");
      // e.printStackTrace();
      // System.exit(1);
    }
    return result;
  }

  public static double inputADouble() {
    Scanner input = new Scanner(System.in);
    while (true) {
      System.out.println("Insert amount:");
      //try {
        return input.nextDouble();
      /*}
      catch (java.util.InputMismatchException e) {
        System.out.println("that's not a number");
        input.nextLine(); // clears the line so nextDouble can try again
      }
      */
    }
  }

  // example 5
  public static boolean moreThan3Items(LinkedList ll) throws NullPointerException {
    if(ll == null){ 
      throw new NullPointerException();
    }
    else if(ll.size() > 3){
      return true;
    }
    return false;
  }

  public static int getItem(int[] arr, int index) throws IndexOutOfBoundsException {
    if(arr.length <= index){
      throw new IndexOutOfBoundsException();
    }
    return arr[index];
  }

  public static void main(String[] args){
    int result = 0;
    // example 1 - just letting it happen
    /*
    result = A();
    System.out.println("hurray, the result was: " + result);

    // example 2 - directly wrap risky code in try/catch
    result = naiveDivide2(1,0);
    System.out.println("hurray, the result was: " + result);

    // example 3 - wrap method call that eventually runs risky code in try/catch
    try {
      result = A();
    } catch (ArithmeticException exptn) {
      System.out.println("You tried to divide by 0 dummy");
    }
    System.out.println("hurray, the result was: " + result);

    // example 4 - more typical usage
    double amount = inputADouble();

    // example 5 - bad input (null)
    LinkedList ll = null;
    moreThan3Items(ll);
    */

    // example 6 - bad input (out of bounds)
    int[] threeItems = {1,2,3};
    result = getItem(threeItems, 4);


  }

}
