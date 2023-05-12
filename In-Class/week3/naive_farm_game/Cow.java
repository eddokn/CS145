public class Cow extends Animal{
  // attributes
  private String name;
  private String sound;
  private int milkLevel;

  // constructor
  Cow(String name){
    super(name, "mooo","black&white"); // call's animals constructor
    //this.name = name;
    //this.sound = "mooo";
    this.milkLevel = 10;
  }

  public void produceMilk(){
    System.out.println("producing milk");
    this.milkLevel--;
  }


}
