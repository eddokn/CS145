public class Chicken extends Animal{
  // attributes
  private String name;
  private String sound;
  private int peckingOrder;

  // constructor
  Chicken(String name, int peckingOrder){
    super(name,"cluck","white");
    this.peckingOrder = peckingOrder;
  }

  public Egg layEgg(){
    System.out.println("laying an egg");
    Egg egg = new Egg("brown", this.name);
    return egg;
  }


}
