import java.util.Scanner;

public class Repeat {
 // gets some number of inputs, n
  public static String[] get_n_inputs(int n){
    // setup phase
    Scanner s = new Scanner(System.in);
    String[] inputs = new String[n]; // make array to store inputs in

    // doing stuff
    for(int i=0; i<n; i++){
      System.out.print("Enter some text: ");
      inputs[i] = s.nextLine(); // saving user input to a cell in the array
    }
    return inputs;
  }

  public static void repeat_n_times(int n){
    String[] inps = get_n_inputs(n);
    for(int i=0; i<n; i++){
      System.out.println(inps[i]);
    }
  }




  public static String get_user_input(){
    Scanner s = new Scanner(System.in); // Make scanner object
    System.out.print("Enter some text: "); // Tell user to type
    String input = s.nextLine(); // waiting for user to type
                                 // then get their text when they press enter
                                 // then its saved to a string
    return input; // returning the string
  }

// Keep getting user input until they type "exit"
// repeat their input
  public static void repeat(){
    boolean program_running = true;
    while(program_running){ //set up a loop
      String inp = get_user_input(); // get their input
      System.out.println(inp);       // print it back out
      if(inp.equals("exit")){
        program_running = false;
      }
    }
  }

  public static int[] get_n_nums(int n ){
    Scanner s = new Scanner(System.in);
    int[] numbers = new int[n];
    for(int i=0; i<n; i++){
      System.out.print("Enter some numbers: ");
      numbers[i] = s.nextInt();
    }
    return numbers;

  }
  public static int sum(int[] nums){
    int total = 0;
    for(int i=0; i<nums.length-1;i++){
      total += nums[i];
    }
    return total;
  }



  public static void main(String[] args){
    repeat();
    repeat_n_times(3);
    int[] input_nums = get_n_nums(5);
    int the_sum = sum(input_nums);
    System.out.println(the_sum);
  }
}
