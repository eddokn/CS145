/*
* how to structure your code so it follows good inheritance practice
* find duplicated code in multiple classes
* make a superclass
* put the duplicated code into superclass, delete from subclass
* make superclass' attributes protected
* tell subclass to extend superclass
* modify subclass's constructor to call super() constructor
*/

// TASK 1: add a new attr and new method to animal superclass
// TASK 2: make a new animal subclass
// TASK 3: write some testing code into Animal.main
public class Animal{

  // attributes
  // in general, superclass attr's should be protected
  protected String name; // subclass can access
  protected String sound;
  protected String color;
  private String example; //only an Animal object could access
  // constructor
  Animal(String name, String sound, String color){
    this.name = name;
    this.sound = sound;
    this.color = color;
  }

  // getters and setters
  public String getName(){
    return this.name;
  }
  public String getSound(){
    return this.sound;
  }
  public String getColor(){
    return this.color;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setSound(String sound){
    this.sound = sound;
  }
  public void setColor(String color){
    this.color = color;
  }
  // methods
  public void makeSound(){
    System.out.println(sound);
  }
public static void main(String[] args){
  Cow betsy = new Cow("Betsy");
  Pig leo = new Pig("Leo");
  Chicken gustav = new Chicken("gustav",2);
  Cat coco = new Cat("Coco");

  // polymorphism
  Animal[] farm = new Animal[4];
  farm[0] = betsy;
  farm[1] = gustav;
  farm[2] = leo;
  farm[3] = coco;
  for(Animal a : farm){ // for each loop, handy for iterating over data strctures
    a.makeSound();
  }
}


}
