// Other ways to implement a bag includes using a linked list,
// where you can remove references to nodes. Another is to use
// a Set, however you can't have duplicates. An array list would work too.
// A bag would act as a superclass for data structures such as
// stack and queue, as these would benefit more from bag being the superclass
// due to them using such similar methods for data storage and retreval. 

public class Bag{
    private int[] items;
    private int startIndex;
    private int endIndex;
    private int maxValue;

    public Bag(){
      this.items = new int[4];
      this.maxValue = 4;
      this.startIndex = 0;
      this.endIndex = 0;
    }

    public int get(){
      int returnint = this.items[this.startIndex];
      this.startIndex ++;
      return returnint;
    }
    public void put(int item){
      // checks if the bag is full
      // if so, creates a copy, increases the Bag
      // size by 2x, and pulls from the copy
      if(this.endIndex == this.maxValue){
        int[] copyarray = this.items;
        this.items = new int[this.endIndex*2];
        this.maxValue = this.endIndex*2;
        for(int i=0;i<this.endIndex;i++){
          this.items[i] = copyarray[i];
        }
      }
      this.items[this.endIndex] = item;
      this.endIndex ++;
    }
    public static void main(String[] args){
      Bag bag = new Bag();
      bag.put(1);
      bag.put(2);
      bag.put(3);
      if(bag.get()!=1){System.out.println("get 1 failure");}
      if(bag.get()!=2){System.out.println("get 2 failure");}
      if(bag.get()!=3){System.out.println("get 3 failure");}
    }
}
