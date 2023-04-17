public class Adventure{
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
}
