//Author: Grayson Koch
//Date: 4/24
//Program to do harmonics
public class Harmonic extends Rational{
  //attributes
  // Return the nth harmonic number as a double using recursion
  public static double harmonicDouble(int n) {
  double harmonic;
  double i = n;
  if(n==0){
    return harmonic;
  }
  else{
    harmonic += 1.0/i;
    harmonicDouble(n-1);
  }
}
// Return the nth harmonic number as an object of the Rational class using recursion
    public static Rational harmonicRational(int n) {
    //checks if n has been reached
    Rational harmonicrational = new Rational(1,1);
    int i = 2;
    while(i<=n){
      Rational addition = new Rational(1,i);
      harmonicrational = harmonicrational.add(addition);
      i ++;
    }
    return harmonicrational;
    }
}
