// Author: Grayson Koch
// Lab 4 Recursion Cardio

public class RecursionCardio{

  //Exercise 1
  public static int sumIter(int n){
    int total = 0;
    for(int i=1;i<=n;i++){
      total += i;
    }
    return total;
  }

  public static int sumRecur(int n){
    int total = 0;
    if(n==1){
    return total + n;
    }
    else{
      total += n;
      return total + sumRecur(n-1);
    }
}

//Excercise 2:
  public static int bunnyEars(int n){
    return n * 2;
  }

//Excercise 3:
  public static int bunnyEars2(int n){
    int ears = 0;
    if(n==1){
      return ears + 3;
    }
    else if(n % 2 == 0){
      ears += 2;
      return ears + bunnyEars2(n-1);
    }
    else{
      ears += 3;
      return ears + bunnyEars2(n-1);
    }
  }

//Excercise 4:
  public static int sumDigits(int n){
    int sum = 0;
    if(n<10){
      return sum + n;
    }
    if(n>10);
      sum += n % 10;
      return sum + sumDigits(n/10);
  }

//Exercise 5:
  public static boolean isPalendrome(String s){
    if(s.length() <= 1){
      return true;
    }
    if(s.charAt(0)==s.charAt(s.length()-1)){
      return isPalendrome(s.substring(1,s.length()-1));
    }
    else{
      return false;
    }
  }
public static void main(String[] args){
  //Testing for Excercise 1:
  if(sumIter(3)!=6){System.out.println("sumIter");}
  if(sumRecur(3)!=6){System.out.println("sumRecur");}

  //Testing for Excercise 2:
  if(bunnyEars(5)!=10){System.out.println("bunnyEars");}
  //Testing for Exercise 3:
  if(bunnyEars2(5)!=13){System.out.println("bunnyEars2");}

  //Testing for Exercise 4;
  if(sumDigits(126)!=9){System.out.println(sumDigits(126));}
  if(sumDigits(49)!=13){System.out.println(sumDigits(49));}
  if(sumDigits(9)!=9){System.out.println(sumDigits(9));}

  //Testing for Excercise 5:
  if(isPalendrome("racecar")!=true){System.out.println("isPalendrome");}
}
}
