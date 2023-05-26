// regex is not a programming language or a tool in of itself
// it's a format that lots of computer scientists agreed upon.
// different programs implement regex differently
// some just do matching, some do matching and extraction


/*
final project help:
import java.net.URL
URL url = new URL(link)
String hostname = url.getHost();
if(Pattern.matches(hostname, hostpattern))
  // this is a valid page
}

Page.java...
public int compareTo(Page other){
  ... return the rank of whichever has a higher rank
}

Arrays.sort(an array of page objects)

represent PageSet with HashSet<Page>
HashSet<Page> mypageset = ...
Iterator i = mypageset.iterator();

public void readStopWords(){
  stopwords = new ArrayList<String>();
  try{
  FileInputStream fis = new FilesInputStream("Lib/stopwords.txt");
  Scanner s = new Scanner(fis);
  while(s.hasNextLine()){
    String word = s.nextLine();
    ... load into arraylist ...
    }
  }
  catch(Exception e){
    //do nothing
  }
}
*/


import java.util.regex.*;
import java.util.ArrayList;

public class RegexExample{

// Pattern class - compibles regex text into its own internal representation
// Matcher class - operates on text using the compiled regex

  public static boolean simpleMatch(){
    String regex = "wwu"; // step 1
    Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); // step 2
    String input = "Visit WWU today!";
    Matcher matcher = pattern.matcher(input); // step 3
    boolean matchFound = matcher.find(); // step 4
    //matchFound = matcher.find(); // note about Matcher.find()
    return matchFound;
  }


  public static String findAndReplace(String regex, String input, String replace){
      Pattern p = Pattern.compile(regex);
      Matcher m = p.matcher(input);
      String replacedString = m.replaceAll(replace);
      return replacedString;
   }


  public static int[] parseDateTime(String datetime){
    int[] data = new int[5];
    String regex = "(\\d{4})-(\\d{2})-(\\d{2}) (\\d{2}):(\\d{2})";
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(datetime);

    if(m.matches()) {
      // note: groups start at 1. group 0 is special
      data[0] = Integer.parseInt(m.group(1)); //year
      data[1] = Integer.parseInt(m.group(2)); //month
      data[2] = Integer.parseInt(m.group(3)); //day
      data[3] = Integer.parseInt(m.group(4)); //hour
      data[4] = Integer.parseInt(m.group(5)); //minute
    }

    return data;


  }


  // doubles are just floats with twice the size in memory btw
  public static ArrayList<Double> extractFloats(String input){

    // 3.1415
    // 720.99999
    // 5.0

    String regex="(\\d+\\.\\d*)"";
    Pattern pattern=Pattern.compile(regex);
    Matcher matcher=pattern.matcher(input);

    ArrayList<Double> floats = new ArrayList<Double>();
    while(matcher.find()){  // matcher.find() finds the 1st match,
                            // returns true. if called again, finds the 2nd match
                            // and returns true. repeat until no more matches
      String str_float = matcher.group(); // matcher.group() works the same as matcher.find()
      floats.add(Double.parseDouble(str_float));
    }

    return floats;
  }

  // scenario: you are a discord mod and hate cats and dogs, so speaking of them is not allowed
  // write a regular expression that checks for the words "dog" or "cat" in the message contents.
  // If so, capture the username associated with that message, then save it to an arraylist
  public static ArrayList<String> findViolators(String log){

    ArrayList<String> usernames = new ArrayList<String>();
    String pattern = "^(\\w+):.*(?:\\bdog\\b|\\bcat\\b)";
    Pattern regexPattern = Pattern.compile(pattern, Pattern.MULTILINE);
    Matcher matcher = regexPattern.matcher(log);

    while (matcher.find()) {
      String username = matcher.group(1);
      usernames.add(username);
    }
    return usernames;
  }


  public static void main(String[] args) {

    // example 1
    boolean did_find_match = simpleMatch();
    if(did_find_match) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }

    /*
    // example 2
    String incorrect = "The dog says meow. All pigs say meow.";
    String correct = findAndReplace("(dog|pig)", incorrect, "cat");
    System.out.println(correct);


    // example 3
    String datetime = "2023-03-03 14:30";
    int[] parsedDatetime = parseDateTime(datetime);
    System.out.println("year: " + parsedDatetime[0]);
    System.out.println("month: " + parsedDatetime[1]);
    System.out.println("day: " + parsedDatetime[2]);
    System.out.println("hour: " + parsedDatetime[3]);
    System.out.println("minute: " + parsedDatetime[4]);



    // example 4
    // this is a multi-line string
    String sciency_strings = """
      Speed of light in vacuum 299792458 m/s
      Standard atmosphere 101325 Pa
      Earth to sun distance 149600000 km
      Acceleration of gravity 9.80665 m/s^2
      Circumference to diameter ratio 3.141592
      Gas constant 8.3144621 J/mol*K
    """;
    ArrayList<Double> sciency_floats = extractFloats(sciency_strings);
    for(double d : sciency_floats){
      System.out.println(d);
    }
    */

    // example 5
    // this is another way to make multi-line strings
    String log = "CouchPotato99: I love sitting around and doing nothing tbh.\n" +
                "mangoman: Do you guys have a dog?\n" +
                "waterySoup: I hope you guys are staying cool in this heat, my cat is loving it.";
    ArrayList<String> violators = findViolators(log);
    for(String s : violators){
      System.out.println(s);
    }

  }

}
