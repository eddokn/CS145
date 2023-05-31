// note: this file is not meant to be compiled. The .java extension is used
// for syntax highlighting only

    int x = 65; 

    // int->char has no hidden conversion
    // both of these are 01000001 in binary
    char c = (char) x; 
    System.out.println(c); 

    //int->double has a hidden conversion
    //the binary format of a double is fundamentally different than ints
    //so java does some binary legwork for you, so 65 is converted to 65.0
    double d = (double) x;
    System.out.println(d);


    // "upcasting" is safe is because a Dog is an Animal, 
    // and the Dog object will still retain all the behaviors 
    // and attributes defined in the Animal class. 
    // However, you will not be able to access any specific 
    // behaviors or attributes that are unique to the Dog class, 
    // as the variable is now of type Animal.
    //
    // there is a small amount of binary legwork done for you
    //
    // both of these are examples of upcasting
    
    Dog d = new Dog();
    Animal a = (Animal) d;

    Animal animal = new Dog();

    //
    //"downcasting" is the opposite of upcasting. 
    //It involves casting an object from a superclass to its subclass. 
    //This casting is potentially unsafe and requires explicit casting 
    //syntax, as it involves converting an object of the superclass to 
    //a more specific type.

    // if a given Animal is definitely a Dog, you can do this:

    Animal animal = new Dog();
    Dog dog = (Dog) animal;

    // However, it's important to note that downcasting can be risky 
    // because if the original object is not actually an instance of the 
    // subclass being cast to, a ClassCastException will occur at runtime. 
    // To mitigate the risk, you can use the instanceof operator 
    // to check if the downcast is valid before performing it.
    // --- Note: This is not good design practice ---
    if (animal instanceof Dog) {
      Dog dog = (Dog) animal;
    }     
