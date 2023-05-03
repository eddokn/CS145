public class Pig extends Animal{

  private String name;

  Pig(String name){
    this.name = name;
  }

  public void makeSound(){
    System.out.println("oink");
  }

  public void sleep(){
    System.out.println("zzz");
  }

  public String getName(){ return this.name; }
  public void setName(String name){ this.name = name; }


}
