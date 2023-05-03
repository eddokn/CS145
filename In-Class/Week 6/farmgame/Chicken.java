public class Chicken extends Animal{

  private String name;

  Chicken(String name){
    this.name = name;
  }

  public void makeSound(){
    System.out.println("cluck");
  }

  public void sleep(){
    System.out.println("zzz");
  }

  public String getName(){ return this.name; }
  public void setName(String name){ this.name = name; }

}
