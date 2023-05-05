public abstract class Animal{

  protected String name;

  public abstract void makeSound();
  public abstract void sleep();

  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name = name;
  }
}
