// In Java, an abstract class is a class that cannot be instantiated directly 
// but can be used as a base for other classes. It serves as a blueprint for 
// its subclasses, providing common attributes and behaviors that can be shared 
// among them. Abstract classes are declared using the abstract keyword.

// Here are some key points to understand about abstract classes:

//1. Cannot be instantiated: Abstract classes cannot be directly instantiated using 
//the new keyword. They are designed to be extended by subclasses. However, you 
//can create reference variables of the abstract class type.

//2. May contain abstract and non-abstract members: Abstract classes can have both 
//abstract and non-abstract members. Abstract methods are declared without an 
//implementation, whereas non-abstract methods provide an implementation. 
//Abstract classes can also have fields, constructors, and any other elements of a regular class.

//3. Abstract methods: Abstract classes may contain one or more abstract methods. These 
//methods are declared without a body, using the abstract keyword. Subclasses that 
//extend an abstract class must provide implementations for all the inherited abstract methods. 
//Abstract methods serve as placeholders, defining the method signature (inputs and outputs) and 
//contract that must be fulfilled by the subclasses.

//4. Can have concrete methods: Abstract classes can also have concrete (non-abstract) 
//methods with an implementation. These methods can be directly used by the abstract class 
//itself or inherited by the subclasses. Concrete methods provide default behavior 
//that can be reused or overridden by the subclasses.

//5. Used for code reuse and common behavior: Abstract classes are often used to define 
//common behavior and attributes shared among related classes. They allow you to avoid code 
//duplication by providing a central place for common functionality that can 
//be inherited by multiple subclasses.
//

// Here's a typical example of when you would see the use of an abstract class

abstract class GameCharacter {
    protected String name;
    protected int health;

    public GameCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract void attack();

    public abstract void takeDamage(int damage);

    public void displayStatus() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
    }
}

class PlayerCharacter extends GameCharacter {
    private int experience;

    public PlayerCharacter(String name, int health) {
        super(name, health);
        experience = 0;
    }

    public void attack() {
        System.out.println(name + " attacks with a sword!");
        // Code for player character's attack
    }

    public void takeDamage(int damage) {
        System.out.println(name + " takes " + damage + " damage!");
        health -= damage;
    }

    public void gainExperience(int exp) {
        System.out.println(name + " gains " + exp + " experience!");
        experience += exp;
    }
}

class EnemyCharacter extends GameCharacter {
    private int level;

    public EnemyCharacter(String name, int health, int level) {
        super(name, health);
        this.level = level;
    }

    public void attack() {
        System.out.println(name + " attacks with claws!");
        // Code for enemy character's attack
    }

    public void takeDamage(int damage) {
        System.out.println(name + " takes " + damage + " damage!");
        health -= damage;
    }

    public void increaseLevel() {
        System.out.println(name + " levels up!");
        level++;
    }
}

public class Main {
    public static void main(String[] args) {
        GameCharacter player = new PlayerCharacter("Hero", 100);
        player.displayStatus();
        player.attack();
        player.takeDamage(20);
        player.gainExperience(50);

        System.out.println();

        GameCharacter enemy = new EnemyCharacter("Goblin", 50, 1);
        enemy.displayStatus();
        enemy.attack();
        enemy.takeDamage(30);
        enemy.increaseLevel();
    }
}


