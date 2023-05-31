// An interface is a programming construct that defines a contract of methods that a class must implement. 
// It specifies a set of methods that a class implementing the interface must provide, without specifying 
// how those methods are implemented. In other words, an interface defines what a class can do but not 
// how it does it. Interfaces allow for multiple inheritance of type, as a class can implement multiple interfaces.


// Declaration and Syntax: An interface is declared using the interface keyword followed by the interface name. 
// The methods defined within an interface are abstract by default and do not have method bodies. 
// Here's an example of interface declaration:

interface MyInterface {
    void method1();
    int method2(String parameter);
    Object method3(Object o);
    // ...
}

// Implementation: A class that wants to fulfill the contract defined by an interface must implement that 
// interface using the implements keyword. The class must provide an implementation for all the methods 
// declared in the interface. Multiple interfaces can be implemented by separating them with commas. 
// Here's an example:
class MyClass implements MyInterface {
    public void method1() {
        // Implementation of method1
    }
    
    public int method2(String parameter) {
        // Implementation of method2
        return 42;
    }
    // ...
    public Object method3(Object o){
      // IMplementation of method3
      return new Object();
    }
}

// Interface Inheritance: Interfaces can extend other interfaces using the extends keyword, 
// similar to class inheritance. This allows for the creation of more specialized interfaces that 
// inherit and expand upon the behavior of their parent interfaces. 
// Here's an example:
interface MyExtendedInterface extends MyInterface {
    void method4();
    // ...
}

// Usage: Interfaces are commonly used to define contracts and establish a common behavior that 
// multiple classes can adhere to. They provide a way to achieve polymorphism by allowing different 
// classes to be treated as instances of the same interface type. 

// Starting with java 8, they decided to make interfaces basically abstract classes. If you're interested, 
// lookup the "default" and "static" keywords as they relate to interfaces


// Here's an example that I hope sends home the use-case of interfaces

// i want to define a contract for a paper copying system. If you want to be considered a paper copying system,
// you must be able to take a piece of paper, copy it, and return it to the customer.
interface paperCopyingSystem {
  Paper print(Paper toCopy);
}
// there's lots of ways this kind of system could be done.
class Photocopier implements paperCopyingSystem { ... }
class PrintingCompany implements paperCopyingSystem { ... }
class MedievalMonk implements paperCopyingSystem { ... }

// as long as these 3 classes implement a method called print, which takes as input 
// a piece of paper, copies it, and returns a piece of paper, anyone can can use any of these 
// paperCopyingSystems without needing to know HOW any particular one was implemented. Sure, 
// the monk might take months to return the paper and the photocopier only a few seconds, but
// the inputs and outputs are exactly the same. Someone can make an educated decision about which 
// type of paperCopyingSystem they'd like to use. Otherwise, they can just trust that they do the same thing
// and not really worry about it.

// A more relevant example is the Queue interface. A Queue can be implemented with a LinkedList, Array, 
// specialized data structures, or even a Stack! Despite their differences in implementation, each Queue method
// has the exact same inputs and outputs and performs the same operations. 
// HOW they do it is different. WHAT they do it the same. That's why we like interfaces.

