public class Potion{
  // potion attributes
  protected String name = new String();
  protected int benefit_level;
  protected int hpRestore;

  //constructor for the Potion
  public Potion(String name){
    this.name = name;
    this.benefit_level = 10;
  }

  //getters for potion name and B.F.
  public String getName(){
    return this.name;
  }
  public int getBenefit(){
    return this.benefit_level;
  }
  // drink method so the player can heal!
  public int drink(){
    hpRestore = benefit_level;
    benefit_level = 0;
    return hpRestore;
  }
}
