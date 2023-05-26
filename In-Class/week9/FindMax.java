import java.util.*;

class Worker extends Thread { 

  int[] arr;
  int start;
  int end;
  int max;

  Worker(int[] arr, int start, int end){
    this.arr = arr;
    this.start = start;
    this.end = end;
  }
  public int getMax(){ return this.max; }

  public void run(){
    findMaxOfMySection
  }

  private void findMaxOfMySection(){
  }

}


public class FindMax { 

  public static int findMax(int[] arr, int numThreads){
  }
  

  public static int[] makeRandArray(int length){
    Random rd = new Random(); // creating Random object
    int[] arr = new int[length];
    for (int i = 0; i < length; i++) {
      int rdInt = rd.nextInt()%100; // lets keep it within 0-99
      if(rdInt<0){ rdInt *= -1; }
      arr[i] = rdInt;
    }    
    return arr;
  }

  public static void main(String[] args) {
    // command line arguments: array length, number of threads
    int len = Integer.parseInt(args[0]);
    int numThreads = Integer.parseInt(args[1]);
    int[] randNums = makeRandArray(len);

    int max = findMax(randNums, numThreads);
    System.out.println(max);
  }
}

