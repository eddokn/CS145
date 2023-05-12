public class Cow extends Animal{

  private String name;
  private int milkLevel;

  Cow(String name){
    this.name = name;
    this.milkLevel = 10;
  }

  public void makeSound(){
    System.out.println("mooo");
  }

  public void sleep(){
    System.out.println("zzz");
  }

  public void produceMilk(){
    System.out.println("producing milk");
    this.milkLevel--;
  }

  public String getName(){ return this.name; }
  public void setName(String name){ this.name = name; }

}
