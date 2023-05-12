public class Game {
  public static void main(String[] args){

    Warrior warrior = new Warrior();
    Mage mage = new Mage();
    Rogue rogue = new Rogue();
    
    warrior.move(); 
    warrior.attack(); 
    
    mage.move(); 
    mage.attack(); 
    
    rogue.move(); 
    rogue.attack(); 

    /* As you can see, each subclass has its own unique implementation 
     * of the move() and attack() methods, but they all share a common 
     * template defined by the Character abstract class. I can reliably group
     * up these different characters under the Character superclass, and know
     * with certainty that I'll be able to call move() and attack() for all of them
     */

    Character[] characters = {warrior, mage, rogue};
    for(Character c : characters){
      c.move();
      c.attack();
    }


  }
}
