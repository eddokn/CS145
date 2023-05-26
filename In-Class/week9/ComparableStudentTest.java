import java.util.*;  
class ComparableStudentTest { 
  public static void main(String[] args){
    ArrayList<Student> stu_list = new ArrayList<Student>();  
    stu_list.add(new Student("John",23));  
    stu_list.add(new Student("Sstu_listly",27));  
    stu_list.add(new Student("Perry",21));  

    System.out.println("Before sorting");  
    for(Student st:stu_list){  
      System.out.println(st.name+" "+st.age);  
    }  
  
    Collections.sort(stu_list);  

    System.out.println("After sorting");  
    for(Student st:stu_list){  
      System.out.println(st.name+" "+st.age);  
    }  
  }
}

