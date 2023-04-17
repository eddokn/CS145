public class Blaster extends Weapon{
  //constructor for the Blaster
  public Blaster(){
    super("Blaster");
    this.damage = 10;
    this.manacost = 2;
  }
  public int ultimateDamage(){
    int ultimateDamage = 15;
    return ultimateDamage;
  }
}
