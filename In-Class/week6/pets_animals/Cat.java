public class Cat implements Animal, Pet {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override // from Animal interface
    public void eat() {
        System.out.println(name + " is eating all cat-like.");
    }

    @Override // from Animal interface
    public void sleep() {
        System.out.println(name + " is sleeping and purring.");
    }

    @Override // from Pet interface
    public void play() {
        System.out.println(name + " is playing with string.");
    }
    
}
