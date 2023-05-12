
import java.io.*;     // for File
import java.util.*;   // for Scanner

public class FileCrawler {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Directory to crawl? ");
        String directoryName = console.nextLine();
        
        File f = new File(directoryName);
        crawl(f, "");
    }
    
   
    private static boolean search(File f, String filename) {

      System.out.println(indent + f.getName());
    	if (f.isDirectory()) {
        	// recursive case: directory
        	// print everything in the directory
        	File[] subFiles = f.listFiles();
    		indent += "    ";
        	for (int i = 0; i < subFiles.length; i++) {
              	crawl(subFiles[i], indent);
        	}
        }
    }


}
