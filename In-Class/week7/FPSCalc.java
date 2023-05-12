/*
 * exercise: calculate the FPS (frames per second) of some application like a game
 * - given a stream of data representing the time taken to draw each frame, 
 *   and a "window size", calculate the average of all integers within this window
 *
 * - this is called the moving average problem. other examples include
 *   - fuel-efficiency (MPG) of a vehicle
 *   - stock market analysis
 *   - weather analysis, average temperature evaluation
 *   - traffic analysis
 */

import java.util.concurrent.ThreadLocalRandom; // just to generate random numbers
import java.util.LinkedList;
import java.util.Queue;

public class FPSCalc{

  double runningSum;
  int windowSize;
  Queue<Integer> window;

  public FPSCalc(int windowSize) {
    this.window =  new LinkedList<Integer>(); // question: why does this work? 
    this.windowSize = windowSize;
    this.runningSum = 0.0;
  }

  // given a new value, calculate a new average within the window
  // if the queue is at max capacity, dequeue an element before 
  // enqueueing the new one
  public double next(int val){
  }

  public static void main(String[] args){
    FPSCalc m = new FPSCalc(3);
    System.out.println(m.next(1));  // [1]/1      = 1 
    System.out.println(m.next(10)); // [1+10]/2   = 5.5 
    System.out.println(m.next(3));  // [1+10+3]/3 = 4.666  
    System.out.println(m.next(5));  // [10+3+5]/3 = 6.0    
    System.out.println(m.next(2));  // [3+5+2]/3  = 5.0   

    /*
    FPSCalc n = new FPSCalc(100);
    for(int i=0; i<1000; i++){
      int randomNum = ThreadLocalRandom.current().nextInt(50, 70);
      System.out.println(m.next(randomNum)); 
    }
    */
  }
}


