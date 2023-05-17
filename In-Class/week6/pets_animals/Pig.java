public class Pig implements Animal { 

    private String name;

    public Pig(String name) {
        this.name = name;
    }

    @Override // from Animal interface
    public void eat() {
        System.out.println(name + " is eating grain.");
    }

    @Override // from Animal interface
    public void sleep() {
        System.out.println(name + " is sleeping all pig-like and stuff.");
    }
    
}
