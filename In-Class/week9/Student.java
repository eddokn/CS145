import java.io.*;

public class Student implements Serializable, Comparable<Student>{
  String name;
  int age;

  public Student(String name) {
    this.name = name;
    this.age = 0;
  }

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public int compareTo(Student st){
    return (this.age-st.age); 

    // instead of writing 3 cases and returning -1, 0 or 1,
    // perhaps we could do this in 1 line?
  }
}
