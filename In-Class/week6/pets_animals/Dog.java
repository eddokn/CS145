public class Dog implements Animal, Pet {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override // from Animal interface
    public void eat() {
        System.out.println(name + " is eating a big hunk-o-steak.");
    }

    @Override // from Animal interface
    public void sleep() {
        System.out.println(name + " is sleeping all dog-like and stuff.");
    }

    @Override // from Pet interface
    public void play() {
        System.out.println(name + " is playing with a stick.");
    }
    
}
