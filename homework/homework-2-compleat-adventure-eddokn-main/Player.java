public class Player{

  protected String name = new String();
  protected int health;
  protected int mana;
// constructor to create player object
  public Player(String name){
    this.name = name;
    this.health = 100;
    this.mana = 100;
  }
// getters for each attribute of player class
  public String getName(){
    return this.name;
    }

  public int getHealth(){
    return this.health;
    }

  public int getMana() {
    return this.mana;
    }
// method so that players can take damage
  public void sufferDamage(int damage){
    this.health -= damage;
  }
// method for players to attack
  public void attack(Player opponent, Weapon weapon, Boolean isultimate){
    if(this.mana > weapon.manacost){
      if(isultimate){
        opponent.sufferDamage(weapon.ultimateDamage());
        this.mana = 0;
      }
    else{
      opponent.sufferDamage(weapon.damage);
      this.mana -= weapon.manacost;
      }
    }
  }
// method for players to heal by drinking potions
  public void drink(Potion potion){
    this.health += potion.drink();
    if(this.health>100){
      this.health = 100;
    }
  }

}
