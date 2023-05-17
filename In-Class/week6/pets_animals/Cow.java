public class Cow implements Animal { 

    private String name;

    public Cow(String name) {
        this.name = name;
    }

    @Override // from Animal interface
    public void eat() {
        System.out.println(name + " is eating grass.");
    }

    @Override // from Animal interface
    public void sleep() {
        System.out.println(name + " is sleeping all cow-like and stuff.");
    }
    
}
