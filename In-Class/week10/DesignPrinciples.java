// When designing a class structure in Java, it's important to follow good practices 
// to create a well-organized, maintainable, and extensible codebase. Here are some 
// advice and guidelines to consider:
//
// 1. Single Responsibility Principle: Each class should have a single responsibility or purpose. 
// This promotes encapsulation and makes the code easier to understand, test, and maintain.


class Customer {
    private String name;
    private String email;
    // ...constructor, getters, and setters

    public void sendEmail(String message) {
        // Code to send email
    }
}

// Bad (violating single responsibility principle)
class Customer {
    private String name;
    private String email;
    // ...constructor, getters, and setters

    public void sendEmail(String message) {
        // Code to send email
    }

    public void calculateInvoice() { // not really the job of a Customer to do this
        // Code to calculate invoice
    }

    public void findNPrimeNumbers() { // not even related to Customer
        // Code to find n prime numbers 
    }
}


// 2. Inheritance and Composition: Use inheritance when there is an "is-a" relationship 
// between classes, and use composition when there is a "has-a" relationship. 
// Favor composition over inheritance to achieve better code flexibility and avoid tight coupling.

// Inheritance (is-a relationship)
class Animal {
    // ...
}
class Dog extends Animal {
    // ...
}

// Composition (has-a relationship)
class Car {
    private Engine engine;
    // ...
}

// 3. Encapsulation: Hide internal implementation details and expose a clean interface for 
// interacting with the class. Use access modifiers (private, protected, public) 
// to control access to fields and methods.

class Employee {
    private String name;
    private int age;
    // ...

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ...
}

// 4. Interfaces and Abstract Classes: Use interfaces to define contracts and provide a 
// common interface for unrelated classes. Use abstract classes when you want to define 
// common behavior and provide partial implementation.

interface paperCopyingSystem {
  Paper print(Paper toCopy);
}
class PrinterMachine implements paperCopyingSystem { ... }
class PrintingPress implements paperCopyingSystem { ... }
class MedievalMonk implements paperCopyingSystem { ... }

// as long as these 3 classes implement a method called print, which takes as input 
// a piece of paper, copies it, and returns a piece of paper, anyone can can use any of these 
// paperCopyingSystems without needing to know HOW any particular one was implemented. Sure, 
// the monk might take months to return the paper and the printing machine only a few seconds, but
// the inputs and outputs are exactly the same. Someone can make an educated decision about which 
// type of paperCopyingSystem they'd like to use. Otherwise, they can just trust that they do the same thing
// and not really worry about it.

// A more relevant example is the Queue interface. A Queue can be implemented with a LinkedList, Array, 
// specialized data structures, or even a Stack! Despite their differences in implementation, each Queue method
// has the exact same inputs and outputs and performs the same operations. 
// HOW they do it is different. WHAT they do it the same. That's why we like interfaces.
//
// 
// 5. Avoid Deep Inheritance Hierarchies: Limit the depth of inheritance hierarchies to maintain code readability and prevent complex dependencies. 
// Favor composition or interface implementation over deep inheritance.

// 6. Code to Interfaces: Program to interfaces rather than concrete implementations. 
// This promotes flexibility, easier testing, and allows for easy substitution of implementations.
// For example, instead of:
 ArrayList<String> names = new ArrayList<String>();
// instead, try this:
 List<String> names = new ArrayList<String>();

// 7. Follow Naming Conventions: Use meaningful and descriptive names for classes, methods, and variables. 
// Follow Java naming conventions, such as using camel case for methods and variables (myMethod, myVariable) 
// and Pascal case for class names (MyClass). I prefer snake_case for non-object-oriented languages.

// 8. Keep Classes Cohesive: Group related fields and methods together within a class. 
// This improves code readability and makes the class easier to understand and maintain.


//Remember that these guidelines are not strict rules

