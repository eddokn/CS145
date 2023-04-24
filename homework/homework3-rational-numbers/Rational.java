// Author: Grayson Koch
// Date: 4/24
// Methods for modifying rational numbers
public class Rational{
  protected int numerator;
  protected int denominator;
//creates Rational object with num and denom
  public Rational(){
    this.numerator = 0;
    this.denominator = 1;
  }
//returns the numerator of the object
  public int getNumerator(){
    return this.numerator;
  }
//returns the denominator of the object
  public int getDenominator(){
    return this.denominator;
  }
//creats Rational object with parameters of num and denom
  public Rational(int p, int q){
    this.numerator = p;
    this.denominator = q;
  }
//method to convert Rational object to String
 public String toString(){
   return (this.numerator+"/"+this.denominator);
 }
//method to find gcd
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
//method to reduce fraction by gcd
  public Rational reduce(){
    int gcd = findGcd(this.numerator,this.denominator);
    Rational reduced = new Rational(this.numerator/gcd,this.denominator/gcd);
    return reduced;
  }
//method to add fractions
  public Rational add(Rational other){
    Rational add = new Rational();
    //if the denominator is equal
    if(this.denominator == other.denominator){
      add = new Rational(this.numerator+other.numerator, this.denominator);
      return add;
    }
    //if the denominator is not equal
    else{
      add = new Rational((this.numerator*other.denominator)+(other.numerator*this.denominator),this.denominator*other.denominator);
      Rational added = add.reduce();
      return added;
    }
  }

 public static void main(String[] args){
   Rational first = new Rational();
   Rational second = new Rational(15,10);
   System.out.println(first);
   first = new Rational(1,1);
   System.out.println(second);
   System.out.println(first.reduce());
   System.out.println(first.add(second));
 }
}
