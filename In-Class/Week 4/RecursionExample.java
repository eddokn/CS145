public class RecursionExample {

  // recursion is another way we can loop in a clever way
  // for loop, foreach, while, recursion
  // do something forever until some condition is met
  //

  // recursion is used to break problems down into smaller subproblems
  // which is defined in terms of itself
  //
  // 5! = 5 * 4!
  // 4! = 4 * 3!
  // 3! = 3 * 2!
  // 2! = 2 * 1!
  // 1! = 1 

  // n! = 1           if n=1
  // n! = n * (n-1)!  if n>1


  public static int factorial(int n){
    if(n == 1){
      return 1;
    } else {
      int the_answer = n * factorial(n-1);
      return the_answer;
    }
  }


  public static void recursiveMethod(){
    System.out.println("recursion is cool!");
    recursiveMethod();
  }

  public static void main(String[] args){
    int fact_five = factorial(5);
    System.out.println(fact_five);
    //recursiveMethod();

  }
}
