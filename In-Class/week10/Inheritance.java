// Inheritance is a fundamental concept in object-oriented programming, 
// It allows you to create new classes based on existing classes, 
// inheriting their properties and behaviors. The existing class is 
// called the "parent" or "superclass," and the new class is called 
// the "child" or "subclass." In Java, inheritance is implemented 
// using the extends keyword. Here's a general syntax for declaring a 
// subclass that inherits from a superclass:

class Superclass {
    // superclass members
}

class Subclass extends Superclass {
    // subclass members
}

//The subclass inherits all the non-private members (attributes and methods) 
//of the superclass. This includes instance variables, static variables, and 
//methods. Private members are not inherited and are accessible only within the 
//class where they are declared.
//By inheriting from a superclass, the subclass gains access to its 
//public and protected members. It can also override methods from the 
//superclass to provide its own implementation.

class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name); // invoking the superclass constructor
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.eat(); // inherited from Animal class
        dog.bark(); // defined in Dog class
    }
}

// In this example, the Animal class is the superclass, and the 
// Dog class is the subclass. The Dog class inherits the name 
// field and eat() method from the Animal class and adds its own 
// method bark(). The super(name) call in the Dog constructor invokes 
// the superclass constructor to set the name field. The main() 
// method creates a Dog object and calls both inherited and 
// subclass-specific methods.

//Inheritance provides code reusability, promotes a hierarchical structure
//and supports the concept of polymorphism, where objects of 
//different subclasses can be treated as objects of the superclass.
