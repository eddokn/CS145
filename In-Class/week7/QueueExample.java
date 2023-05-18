import java.util.*;

// FIFO first in first out
// like waiting in line, first come first serve
// add - add element to back of queue
// remove - remove element from front of queue
// peek - look at front element without removing
// size - check number of elements
// isEmpty - check if empty

public class QueueExample{

  public static void main(String[] args){
    Queue<Integer> myqueue = new LinkedList<Integer>();
    // front is on the left
    myqueue.add(0); // 0
    myqueue.add(1); // 0, 1
    myqueue.add(2); // 0, 1, 2
    myqueue.peek(); // 0, 1, 2; return 0
    int zero = myqueue.remove(); // 1, 2; return 0
    int two = myqueue.size();
    boolean false = myqueue.isEmpty();
  }
}
