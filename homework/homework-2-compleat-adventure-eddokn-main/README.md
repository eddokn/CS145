[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/hgHfwI0i)
# 10 points

This homework models an adventure game, with players, potions, treasures and weapons. You'll be writing several different classes to represent all these objects.

Make sure to download all the code in this repo to your local machine. It contains tests you can use to check that your implementation is correct.


You will write and submit multiple Java files, one for each class. Control-click to select multiple files to submit. Every class that you create is a separate file, e.g. if you write a Player class, create Player.java.

# Superclasses
## Task 1

Create a Player class, that represents a player. Put this in **Player.java**.

- Every Player has a name (String), and a health level (integer) and a manna level (integer). The health affects if you stay alive in the game, and the manna level affects how much you can wield a weapon to attack other players.
- Create a constructor for Player that takes a String for the name, and initializes the health and manna to 100.
- Create getters for the name (getName()) and health (getHealth()) and manna (getManna())

## Task 2

Create a Potion class that represents a potion. Drinking a potion restores a Player's health. Put this in **Potion.java**.

- Every Potion has a name, and a benefit level (int), representing how many points it restores to a Player if the potion is drunk.
- Create a constructor for Potion that takes a String name, and initializes the name of the potion, and initializes the benefit level to 10.
- Create a getter (getName()) that returns the name of the Potion.
- Create a getter (getBenefit()) that returns the benefit level of the potion. 
- Create a drink() method that returns the value of the benefit level of the potion, and reduces the benefit value of the potion to 0 (after you drink a potion, it loses all potency).


## Task 3

Create a Weapon class that represents a weapon. Getting hit by a weapon causes a reduction in the Player's health. Using a weapon reduces the Player's manna. 
Put this in **Weapon.java**.

- Every Weapon has a name, and a damage level (int), representing how many points it reduces a Player's health if the Player is hit by it, and a cost to using it (int).
- Create a constructor for Weapon that takes a String name of the weapon, and initializes the damage level to 0.
- Create a getter (getDamage()) that returns the damage level of the weapon.
- Create a getter (getName()) that returns the name of the weapon.
- Create a getter (getCost()) that returns the cost of using the weapon.

Every weapon has a special ultimate level move that inflicts lots of damage, but costs all the player's manna to use.

- Create a method ultimateDamage() that returns the amount of damage the weapon would cause if the ultimate move was used. This should just return 0 for the Weapon superclass.

# Subclasses
## Task 4

Create an MagicElixir class that is a subclass of Potion. MagicalElixirs are powerful and have twice the benefit of standard Potions. Put this in **MagicElixir.java**.

- Create a constructor for MagicElixir that takes no arguments, and sets the name of the Potion to "MagicElixir", and initializes the benefit to 20.

## Task 5

Create a Sword subclass of Weapon. Put this in **Sword.java**.

- Swords inflict 5 damage points.
Swords inflict 5 damage points and cost 5 points in manna.
- Create a constructor for Sword that takes no arguments, and initializes the damage level to 5, the cost to 5, and the name to "Sword".
- The ultimate move for a Sword causes 50 points of damage. Write the ultimateDamage function for Sword to return the amount of ultimate damage.

Create a Blaster subclass of Weapon. Put this in **Blaster.java**.

- Blasters inflict 10 damage points and cost 2 points to use.
- Create a constructor for Blaster that takes no arguments, and intializes the damage level to 10, the cost to 2, and the name to "Blaster".
- The ultimate move for Blaster causes 15 points of damage. Write the ultimateDamage function for Blaster to return the amount of ultimate damage.

## Task 6

Players can attack each other with weapons. When a Player is attacked, the player suffers damage.

- Write a void method sufferDamage(int damage) in the Player class. When this method is called on a player, the player's health points are reduced by the given amount of damage. Damage never goes below 0.
```
public void sufferDamage(int damage) {
    // the player's health is reduced by damage points
    ....
}
```

Attack takes three arguments:
- an opponent to attack,
- a weapon to attack the opponent with,
- a boolean isUltimate, specifying whether this is an ultimate attack. 
The attack method should reduce the opponent's health level by the weapon's damage amount. This method should use the sufferDamage method you wrote earlier.
Make sure you have enough manna to attack. You must have at least the weapon's cost in manna to do any damage. Without sufficient manna, the attack produces no damage in your opponent. The Player's manna is reduced by the cost of using the weapon. If it is an ultimate move, the Player's manna is reduced to 0.
```
public void attack(Player opponent, Weapon weapon) {
  ..
}
```

## Task 7

Players can restore their health by drinking potions.

Write a void method drink() that takes a Potion as an argument. It should increase the Player's health points by the potion's benefit. However, the maximum health of a Player is 100 and cannot increase beyond that.
```
public void drink(Potion potion) {
  ...
}
```

## Task 8

Write a main program in the file **Adventure.java**  that has gameplay that exactly goes like this. Copy this main program.
```
    public static void main(String[] args) {
        // create two players
        Player frodo = new Player("Frodo");
        Player sauron = new Player("Sauron");

        // Create a magical elixir
        Potion elixir = new MagicElixir();

        // Create some weapons
        Weapon sting = new Sword();
        Weapon blaster = new Blaster();

        // Play the game! -- the players take turns attacking each other
        sauron.attack(frodo, blaster, false);   // Sauron attacks Frodo with a blaster
        frodo.attack(sauron, sting, false);    // Frodo attacks Sauron with his sword Sting
        sauron.attack(frodo, blaster, false);  // Sauron blasts Frodo again
        sauron.attack(frodo, blaster, true);    // Sauron ultimates
        sauron.attack(frodo, blaster, false);   // desperation move

        // Frodo drinks a potion
        frodo.drink(elixir);

        // Let's examine who's healthier
        System.out.println("Frodo's health: " + frodo.getHealth());
        System.out.println("Frodo's manna: " + frodo.getManna());
        System.out.println("Sauron's health: " + sauron.getHealth());
        System.out.println("Sauron's manna: " + sauron.getManna());
    }
```

 
# Testing
You can run automated tests with
```
make test
```
`make` is a program that is used to build and test programs. 

 # Downloading ("cloning") the code
 You should download the code in this assignment to your computer in order to copy the test code to your computer.
 Otherwise you won't have the aforementioned test code you can run.
 
 ## Method 1
 The simplest way is to click on the *Code* button (the one with the downward arrow), download the zip file, then unzip on your computer.
 ![image](https://user-images.githubusercontent.com/15932762/123204440-f7918e00-d46c-11eb-88bc-ad87d2d99f66.png)

 To unzip a file on Linux, the command is
 ```
 unzip filename-you-want-to-unzip.zip
 ```
 
 On WSL on Windows, you may need to install unzip with
 ```
 sudo apt install zip unzip
 ```
 
 MacOS already has unzip installed.
 
 ## Method 2
 Method 2 uses git. 
 
 WSL users will need to install git with
 ```
 sudo apt install git
 ```
 
 MacOS users will need to install git with
 ```
 brew install git
 ```
 
 Then click on the *Code* button, and copy the URL you're presented with under "Clone". The URL should look like
 `https://github.com/...`.
 Type this command:
 ```
 git clone the-url-you-copied.git
 ```
 
 # Submitting
 Submit as usual all the files you wrote. Make sure you check that the autograder is successful.
