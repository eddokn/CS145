public class Weapon{
  // attr for Weapons
  protected String name = new String();
  protected int damage;
  protected int manacost;
  //constructor for weapon
  public Weapon(String name){
    this.name = name;
    this.damage = 0;
  }
  //getters for each attribute
  public int getDamage(){
    return this.damage;
  }
  public String getName(){
    return this.name;
  }
  public int getCost(){
    return this.manacost;
  }
  //ultimate method
  public int ultimateDamage(){
    int ultimateDamage = 0;
    return ultimateDamage;
  }
}
