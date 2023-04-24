public class Overloading { 

  public static int divide(int a, int b){
    System.out.println("1: int divide(int, int) was called");
    return a/b;
  }

  public static double divide(double a, double b){
    System.out.println("2: double divide(double, double) was called");
    return a/b;
  }

  public static double divide(int a, double b){
    System.out.println("3: double divide(int, double) was called");
    return a/b;
  }


  public static void main(String[] args){
    divide(1, 2);
    divide(1.0, 2.0);
    divide(1, 2.0);
  }

}


