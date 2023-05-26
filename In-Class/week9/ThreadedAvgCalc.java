import java.util.*;

class Worker extends Thread { 

  // all the information the worker class needs to do its job should be
  // stored as a class attribute, and passed to the Worker in the constructor.
  // this is because run() cannot be given arguments, nor return anything
  int[] arr;
  int start;
  int end;
  int sum;

  Worker(int[] arr, int start, int end){
    this.arr = arr;
    this.start = start;
    this.end = end;
  }
  public int getSum(){ return this.sum; }

  public void run(){
    sumUpMySection();
  }

  private void sumUpMySection(){
    for(int i=this.start; i<this.end; i++){
      this.sum += arr[i];
    }
  }

}


public class ThreadedAvgCalc { // consider ThreadedAvgCalc the "leader" of the workers

  public static int calcAvg(int[] arr, int numThreads){
    Worker[] workers = new Worker[numThreads];
    int lenOneWorker = arr.length / numThreads;

    // create worker threads and start running them
    for(int i=0; i<numThreads; i++){
      int start = i*lenOneWorker;
      int end = (i+1)*lenOneWorker;
      if (i==numThreads-1) { // make the last worker take up all the excess
        end = arr.length;
      }

      Worker w = new Worker(arr, start, end);
      workers[i] = w;
      w.start(); 
    }

    try {
      // wait for all worker threads to finish
      for(int i=0; i<numThreads; i++){
        workers[i].join(); 
      }
    } catch (InterruptedException e) {
      System.out.println("Thread interrupted");
    }

    int sum = 0;
    for(int i=0; i<numThreads; i++){
      sum += workers[i].getSum();
    }

    return sum/arr.length;
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

    int avg = calcAvg(randNums, numThreads);
    System.out.println(avg);
  }
}

