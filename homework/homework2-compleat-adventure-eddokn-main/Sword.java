public class Sword extends Weapon{
  //constructor for the Sword
  public Sword(){
    super("Sword");
    this.damage = 5;
    this.manacost = 5;
  }
  public int ultimateDamage(){
    int ultimateDamage = 50;
    return ultimateDamage;
  }
}
