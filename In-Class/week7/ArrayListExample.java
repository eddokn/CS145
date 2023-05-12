import java.util.ArrayList;

public class ArrayListExample {
  public static void main(String[] args) {
      ArrayList<String> cars = new ArrayList<String>();
      cars.add("volvo:");
      cars.add("bmw");
      cars.add("ford");
      cars.get(0); // volvo
      for(int i = 0; i<cars.size();i++){
        System.out.println(cars.get(i));
      }
      for(String s : cars){
        System.out.println(s);
      }
      cars.set(2, "mazda");
      cars.get(2); // mazda

      ArrayList<Integer> numbers = new ArrayList<Integer>();
      numbers.add(10);
      numbers.add(20);
      for(int i : numbers){
        System.out.println(i);
      }
    }
}
