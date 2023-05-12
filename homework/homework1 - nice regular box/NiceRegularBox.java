// Program to create a nice regular box to surround some text
// Author: Grayson Koch
// Date: 4/5/23
  import java.util.Scanner;
  import java.lang.StringBuilder;

  public class NiceRegularBox{
    public static void main(String[] args){
      //create scanner object and variable for storage
      Scanner s = new Scanner(System.in);
      //collect the number of lines from the input and create
      //variable for string storage
      String numberoflines = s.nextLine();
      int number_of_lines = Integer.parseInt(numberoflines);
      String[] strings = new String[number_of_lines+2];
      //loop to get all the lines of text and get longest string
      String longeststring = "";
      int length = 0;
      for(int i=0; i<number_of_lines; i++){
        strings[i] = s.nextLine();
        if(strings[i].length()>longeststring.length()){
          length = strings[i].length();
          longeststring = strings[i];
        }
      }
      if(number_of_lines==0){
        length += 2;
      }
      //print the top banner
      //creates the banner variable to be used for the bottom latter
      StringBuilder banner = new StringBuilder();
      for(int i=0; i<length+4; i++){
        banner.append("+");
      }
      System.out.println(banner.toString());
      //loop to print the strings with surrounding +
      for(int i=0; i<number_of_lines; i++){
        //creates a string builder to create the + borders on text for each line
        StringBuilder currentline = new StringBuilder();
        currentline.append("+ ");
        currentline.append(strings[i]);
        // checks to see how many spaces are needed before max length
        int spaces = length - strings[i].length();
          for(int x=0;x<spaces;x++){
            currentline.append(" ");
          }
        currentline.append(" +");
        System.out.println(currentline.toString());
      }
      //Print the bottom banner to finish
      System.out.println(banner.toString());

    }
  }
