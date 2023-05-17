public class Game {
  public static void main(String[] args){
    Dog sparky = new Dog("sparky");
    Cat vim = new Cat("vim");
    Cow betsy = new Cow("betsy");
    Pig boris = new Pig("boris");

    Pet[] pets = {sparky, vim};
    for(Pet p : pets){
      p.play();
    }

    System.out.println();

    Animal[] animals = {sparky, vim, betsy, boris};
    for(Animal a : animals){
      a.eat();
      a.sleep();
      //a.play(); // does not work because the Animal interface does not have play()
    }

  }
}
