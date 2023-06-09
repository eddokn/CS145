// Pyramid.java: Create different pyramids given different inputs
// Author: Grayson Koch
// Date: 4/3/23

// The StringBuilder class lives at this location
import java.lang.StringBuilder;


public class Pyramid {

  // pyramid() is a method that takes 1 argument, n.
  // n represents the number of lines the pyramid should be
  // pyramid() returns a string
  public static String pyramid(int n){

    // create a new StringBuilder object named p. It contains a
    // blank string at first. Feel free to print p out as you work.
    StringBuilder p = new StringBuilder();

    // Build the pyramid string here. Feel free to rename p by the way.
    // Use the append method to add a string to the end of p.
    // eg: p.append("*");
    for(int i = 0; i < n; i+=1){
      for(int x = 0; x <= i; x+=1){
        p.append("*");
        }
      p.append("\n");
      }

    // p is a StringBuilder object, which is not the same as a
    // String object. Luckily, the StringBuilder class comes
    // with a method called toString, which generates
    // a String: p.toString() . However, just generating a String doesn't
    // do much for us. We must also capture that String to a variable, eg:

    String result = p.toString();
    return result;
  }

  public static String sidePyramid(int n){
    StringBuilder p = new StringBuilder();

    // work here
    for(int i = 0; i < n; i+=1){
      for(int x = 0; x <= i; x+=1){
        p.append("*");
        }
      p.append("\n");
      }
      for(int i = 0; i < n; i+=1){
        for(int x = n - 2; x >= i; x-=1){
          p.append("*");
          }
        p.append("\n");
        }
    String result = p.toString();
    return result;
  }

  public static String alternatingPyramid(int n){
    StringBuilder p = new StringBuilder();
    int m = (n / 2);
    if(n<4){
       m += 1;
    }
    for(int i = 0;i < n; i += 1){
      for(int x = n - i ;x >= m; x -= 1){
        p.append(" ");
      }
        for(int y = 0;y<=i;y+=1){
          p.append("*");
          if(y!=i){
            p.append("+");
      }
    }
    p.append("\n");
  }
    // work here
    // Out of these 3 pyramids, this will be the most difficult.
    // I highly recommend fully solving this on paper/whiteboard first.
    String result = p.toString();
    return result;
  }

  public static String camelKebab(String text){
    StringBuilder result = new StringBuilder();

    // work here
    // use these methods to convert a character to upper/lower-case
    // Character.toLowerCase(some_char)
    // Character.toUpperCase(some_char)
    text = text.replace(" ","-");
    text = text.toLowerCase();
    int length = text.length();
    result.append(text.substring(0,1));
    for(int i = 1; i < length; i += 1){
      if("-".equals(text.substring(i - 1,i))){
        result.append(text.substring(1,i));
        result.append(text.substring(i,i+1).toUpperCase());
        text = text.substring(i);
        i = 0;
        length = text.length();
      }
    }
    result.append(text.substring(1));
    return result.toString();
  }

  public static void main(String[] args){
    // To see your results, call the functions and print them out here.
    // eg: System.out.println(pyramid(5));
    System.out.println(sidePyramid(5));
    System.out.println("*\n**\n***\n****\n*****\n****\n***\n**\n*\n");
    run_tests();
  }

  public static void run_tests(){

    System.out.print("pyramid(2) - ");
    if("*\n**\n".equals(pyramid(2))){
      System.out.println("passed");
    }else{
      System.out.println("failed");
    }

    System.out.print("pyramid(5) - ");
    if("*\n**\n***\n****\n*****\n".equals(pyramid(5))){
      System.out.println("passed");
    }else{
      System.out.println("failed");
    }

    System.out.print("sidePyramid(2) - ");
    if("*\n**\n*\n".equals(sidePyramid(2))){
      System.out.println("passed");
    }else{
      System.out.println("failed");
    }

    System.out.print("sidePyramid(5) - ");
    if("*\n**\n***\n****\n*****\n****\n***\n**\n*\n".equals(sidePyramid(5))){
      System.out.println("passed");
    }else{
      System.out.println("failed");
    }

    System.out.print("alternatingPyramid(2) - ");
    if(" *\n*+*\n".equals(alternatingPyramid(2))){
      System.out.println("passed");
    }else{
      System.out.println("failed");
    }

    System.out.print("alternatingPyramid(5) - ");
    if("    *\n   *+*\n  *+*+*\n *+*+*+*\n*+*+*+*+*\n".equals(alternatingPyramid(5))){
      System.out.println("passed");
    }else{
      System.out.println("failed");
    }

    System.out.print("camelKebab(\"magnificent flying penguins\") - ");
    if("magnificent-Flying-Penguins".equals(camelKebab("magnificent flying penguins"))){
      System.out.println("passed");
    }else{
      System.out.println("failed");
    }

  }

}
