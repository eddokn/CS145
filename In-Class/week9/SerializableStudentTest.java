import java.io.*;
import java.util.Scanner;

class SerializableStudentTest {

  public static Student makeStudent(){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter name");
    String name = s.nextLine();
    s.close();
    return new Student(name);
  }

  public static void saveStudent(Student s){
    String filename = s.name + ".ser";
    try {
      // hook up to a file and set up to write to it
      FileOutputStream file = new FileOutputStream(filename);
      ObjectOutputStream out = new ObjectOutputStream(file);

      // write object to that file
      out.writeObject(s);

      // always close this kinda stuff
      out.close();
      file.close();

    } catch (IOException e){
      System.out.println("Exception when serializing Student");
    }
  }

  public static Student loadStudent(String filename){
    Student s = null;
    try {  
      // hook up to file and prepare to read from it
      FileInputStream file = new FileInputStream(filename);
      ObjectInputStream in = new ObjectInputStream(file);

      // read binary data from file and interpret it as a Student object
      s = (Student) in.readObject();
       
      in.close();
      file.close();
    }
    catch(Exception e) {
      System.out.println("Exception loading student"); 
    }
    return s;
  }
    

  public static void main(String[] args){
    Student s = null;
    if(args.length == 1){
      String filename = args[0];
      System.out.println("Loading student... " + filename);
      s = loadStudent(filename);
      System.out.println(s.name);
    }
    else { 
      s = makeStudent();
      System.out.println("Saving student... " + s.name);
      saveStudent(s);
    }
  }

}


