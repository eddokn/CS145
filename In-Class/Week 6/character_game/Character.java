// this class cannot be instantiated. its purpose is to be a template for subclasses
public abstract class Character {

  protected String name;

  /*
   * In this example, Character is an abstract class with two 
   * abstract methods: move() and attack(). This means that any class 
   * that inherits from Character must implement these methods in their own way.
   */
  public abstract void move();
  public abstract void attack();


  // these methods are inherited like normal
  public String getName(){ return this.name; }
  public void setName(String name){ this.name = name; }

}
