/**
 * This class cleans up text with a combination of lowercasing,
 * non-alpha removal, stop word removal and stemming.
 */
package Lib; 
import Lib.PorterStemmer;
import java.util.*;
import java.util.regex.*;
import java.io.*;


public class TextCleaner {
  // reads stop words file and creates an array list
  ArrayList stopWords = new ArrayList();
  public void readStopWords(){
    stopWords = new ArrayList<String>();
    try{
    FileInputStream fis = new FileInputStream("Lib/stopwords.txt");
    Scanner s = new Scanner(fis);
    while(s.hasNextLine()){
      String word = s.nextLine();
      stopWords.add(word);
      }
      this.stopWords = stopWords;
    }
    catch(Exception e){
      //do nothing
    }
  }
    /**
     * Create a TextCleaner object
     */
    public TextCleaner() {
      readStopWords();
    }
    /**
     * Clean a word. Return the cleaned word, or "" if it was a stop word
     *
     * @param word The word to clean
     * @return The cleaned word
     */
    public String clean(String word) {
        word = word.toLowerCase();
        word = word.replaceAll("[^\\p{L}\\p{Z}0-9]","");
        if(this.stopWords.contains(word)){
          return "";
        }
        PorterStemmer stem = new PorterStemmer();
        return stem.stem(word);
      }


    /**
     * Clean an array of words by applying clean to each word.
     *
     * @param words An array of words to clean
     * @return A new array of words which are all cleaned.
     */
    public String[] clean(String[] words) {
      for(int i=0;i<words.length;i++){
        String word = words[i];
        word = clean(word);
        words[i] = word;
      }
        return words;
    }
    // main program to test TextCleaner
    public static void main(String[] args){
      TextCleaner cleaner = new TextCleaner();
      System.out.println(cleaner.clean("covid-19")); //should print covid19
      System.out.println(cleaner.clean("Western")); //should print western
      System.out.println(cleaner.clean("The")); //should print blank

    }
}
