[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/s4gljQPq)
# 10 points

In mathematics, a rational number is any number that can be expressed as the quotient or fraction `p/q` of two integers, a numerator `p` and a non-zero denominator `q`. For example, `1/2` is a rational number, as is `31/42`.  You can think of `7` as a rational number with an implicit `1` in the denominator.


Write a program **Rational.java**. The purpose of this exercise is to write a class definition that includes a variety of methods, including constructors, instance methods, and modifiers.


Download the code in this repo to your local machine. It contains tests you can use to check that your implementation is correct.
 
## Constructors, getters
Define a class called ```Rational```. A Rational object should have two integer instance variables that store the numerator and denominator.
- Write a constructor that takes no arguments and that sets the numerator to 0 and denominator to 1.
- Write a function getNumerator() that returns the numerator for the rational number.
- Write a function getDenominator() that returns the denominator for the rational number.
- Write a second constructor that takes two arguments p and q, and uses them to initialize the instance variables for the numerator and denominator.
```
Rational r = new Rational(10, 15);     // initializes the number 10/15​
Rational s = new Rational();           // initializes the number 0/1
```

## toString
- Write a `toString` method for Rational. This method takes no arguments, and returns the string representation of the rational. For example, the rational number 4/3 should be represented as the string "4/3" (no spaces).
- Write a `main` function. Create some rationals and testing that it works with println is a good idea at this stage. When you call println on an object, the object is converted to a string using its toString method, and the result is what is printed.

## Reduce
Write an instance method named `reduce` that reduces a rational number to its lowest terms by finding the greatest common divisor (GCD) of the numerator and denominator and dividing through. This method should be a pure method; it should not modify the instance variables of the object on which it is invoked. It should return a new Rational number that has been reduced.
You can use this function to return the GCD of two numbers.
```
    public static int findGcd(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; ++i) {
            // Checks if i is factor of both integers
            if (n1 % i==0 && n2 % i==0) {
                gcd = i;
            }
        }

        return gcd;
    }
```

For example:
```
Rational r = new Rational(2, 10);      // This is 2/10
Rational s = r.reduce();               // ​Reduce to lowest terms
System.out.println(s);                 // This should print 1/5
```

## Add
Write an instance method called `add` that takes a Rational number as an argument, adds it to this, and returns a new Rational object. This is a pure method and should not modify itself.
To add fractions, think back to elementary school.
You should make sure that the result of the operation is reduced (by calling the reduce function above) so that the numerator and denominator have no common divisor (other than 1).
For example:
```
Rational r = new Rational(1, 4);     // This is 1/4
Rational s = new Rational(1, 4);     // This is 1/4
Rational t = r.add(s);               // add r and s:  1/4 + 1/4 = 2/4
System.out.println(t);               // This should print 1/2
```
 
# Harmonic
In mathematics, the nth Harmonic number is defined as
```
H(n) = 1 + 1/2 + 1/3 + ... + 1/n
```
 
So
```
H(1) = 1,
H(2) = 1 + 1/2,
H(3) = 1 + 1/2 + 1/3,
```
and so on.

Write the following functions in **Harmonic.java**.

## harmonicDouble
Write a recursive function `harmonicDouble` that takes an integer n and returns (as a double) the nth Harmonic number.
```
// Return the nth harmonic number as a double using recursion
public static double harmonicDouble(int n) {
    ...
}
```

### Hints
- Figure out what the first Harmonic number is. This is the base case.
- Figure out what the recurrence relationship is.
- Write the code.

## harmonicRational
Using the `Rational` number class we built earlier, write the **recursive** function `harmonicRational` that return as a Rational number the nth Harmonic number, again using *recursion*. Note: `harmonicRational` calls itself -- it does not call `harmonicDouble`.
```
// Return the nth harmonic number as an object of the Rational class using recursion
public static Rational harmonicRational(int n) {
    ...
}
```


# Testing

Write a main function to test your iterative and recursive functions.

You can run automated tests with
```
make test
```

# Submitting
Submit both the **Rational.java** and **Harmonic.java** files.

 
