//Author: Grayson Koch
//Date: 4/24
//Program to do harmonics
public class Harmonic extends Rational{
  //attributes
  // Return the nth harmonic number as a double using recursion
  public static double harmonicDouble(int n) {
  double harmonic = 0.0;
  double i = n;
  if(n==1){
    return harmonic + 1.0;
  }
  else{
    harmonic += 1.0/i;
    return harmonic + harmonicDouble(n-1);
  }
}
// Return the nth harmonic number as an object of the Rational class using recursion
    public static Rational harmonicRational(int n) {
    //checks if n has been reached
    Rational harmonic = new Rational(1,n);
    if(n==1){
      return harmonic;
    }
    else{
      return harmonic.add(harmonicRational(n-1));
    }
}
}
