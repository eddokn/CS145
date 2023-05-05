/**
 * A recursive method to determine whether one can buy the given number
 * of chicken wings
 */
public class ChickenShack {
    public static boolean canBuy(int n) {
      //the first two methods check if the integer is equal to the
      //available chicken packets
        if(n-4==0){
          return true;
        }
        if(n-13==0){
          return true;
        }
        //checks to see if 0 nuggets are being bought
        if(n==0){
          return false;
        }
        //recursion statements return the number of nuggets minus the size
        //of the packet that can be applied to them
        if(n>=13){
          return canBuy(n-13);
        }
        if(n>=4){
          return canBuy(n-4);
        }
        else{
        return false;
      }
    }

    public static void main(String[] args) {
        System.out.println(canBuy(2));      // false
        System.out.println(canBuy(4));      // true
        System.out.println(canBuy(13));     // true
        System.out.println(canBuy(21));     // true
        System.out.println(canBuy(14));     // false
    }
}
