// the nitty gritty of things you should forget without thinking about it

import java.lang.StringBuilder;
import java.util.Scanner;
import java.time.LocalDate;

public class Syntax{

  public static void main(String[] args){

    int awesomenumber = 5;
    System.out.println(awesomenumber);

    //datatypes:
    //primitives:
    char c = 'g';
    float f = 1.01;
    boolean b = false;

    //reference datatypes:
    String s = "this is a string";
    Array a;
    // any class

    /* block comment Syntax
    */

    if(condition1){
      //do something
    }
    else if(condition2){
      // other thing
    }
    else(condition3){
    }

    // conditions
    // == < <= > >=
    // || means or
    // && means and
    // ! means negate (!=)

  while(something_is_true){
    //do a thing
    }

  for(int loop_counter = 0; loop_counter < 10; loop_counter+=1;){
      System.out.println(loop_counter);
    }

    // classes are blueprints used to create an object
    String s = new String("This is a string");
    StringBuilder sb = new StringBuilder();
    sb.append("*");
    String s = sb.toString();

  //get user input
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter something:");
    String input = scan.nextLine();

  //get the current date
    LocalDate todays_date = new LocalDate();
    String currentdate = todays_date.toString();

    String greeting1 = "Hello";
    String greeting2 = "World";
    String fullgreeting = greeting1 + " " + greeting2;
    .length() and .equals()
    String alphabet = "qwertyuiop";
    int length_of_alphabet = alphabet.length();
    String name1 = "John";
    String name2 = "John";
    if(name1.equals(name2)){
      //they're equal
    }
    "\n" is newline character

    //keep track of 5 numbers
    int[] fav_nums = new int[5];
    fav_nums[0] = 14;
    fav_nums[1] = 7;
    fav_nums[2] = 21;
    fav_nums[3] = 413;
    fav_nums[4] = 11;

    int[] fav_nums = {14,7,21,413,11};
    fav_nums.length;

    for(int i=0; i<fav_nums.length-1; i++){
      System.out.println(fav_nums[i]);
    }

    //METHODS

    public static int my_add_function(int x, int y){
      int result = x + y;
      return result;
    }
    public static void main(String[] args){
      System.out.println("doing stuff");
    }

  }
}
