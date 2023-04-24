public class Egg {
  
    private String color;
    private String mother;

    public Egg(String color, String mother) {
        this.color = color;
        this.mother = mother;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMother() {
        return mother;
    }
    public void setMother(String mother) {
        this.mother = mother;
    }

    public void crack() {
        System.out.println("The " + color + " egg has been cracked!");
    }
}

