public class Game {
  public static void main(String[] args){

    Cow betsy = new Cow("betsy");
    Chicken ralph = new Chicken("ralph");
    Pig irene = new Pig("irene");

    Animal[] animals = {betsy, ralph, irene};
    
    for(Animal a : animals){
      a.makeSound();
    }

  }
}
