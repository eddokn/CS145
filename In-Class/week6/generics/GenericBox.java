import java.util.*;
// container for 1 piece of data (datum)
// T is a "type parameter"
public class GenericBox<T>{
  // attributes
  T obj;

  GenericBox(){
    this.obj = null;
  }
  GenericBox(T obj){
    this.obj = obj;
  }
  public T getObj(){
    return this.obj;
  }
  public void setObj(T obj){
    this.obj = obj;
  }
  // unrelated to GenericBox
  public static void displayClassName(T genericArg){
    System.out.println("This datum is of type" + genericArg.getClass().getName());
  }

  public static void main(String[] args){
/*
  Arraylist<String>  List_of_strings = new Arraylist<String>(); // no primitives: char, int, double, etc Integer, Double, Character, etc
  Arraylist<Integer> List_of_ints  = new Arraylist<Integer>();
  List_of_ints.add(5);
  List_of_ints.get(0);
*/

  GenericBox<String> item = new GenericBox<String>();
  item.setObj("hello world");
  String the_obj = item.getObj();
  System.out.println(the_obj);
  }
}
