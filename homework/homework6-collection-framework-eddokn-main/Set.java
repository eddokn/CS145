/**
 * Implements a Set
 */
public class Set extends Collection {
    public Set() {
      super();
    }

    public Integer get() {
        // TODO: Implement this
        // iterates through the list to
        Integer returnint = tail.value;
        this.tail = this.tail.previous;
        this.count -= 1;
        if(this.count == 0){
          this.head = this.tail = null;
        }
        return returnint;
    }


    public void put(Integer value) {
        // TODO: Implement this
        Node runner = this.head;
        for(int i=0;i<this.count;i++){
          if(runner.value == value){
            return;
          }else{
            runner = runner.next;
          }
        }
        super.put(value);
    }

    /**
     * Return a union of this set and the other
     */
    public Set union(Set other) {
        // TODO: Implement this
        Set union = new Set();
        Node thisrunner = this.head;
        boolean put;
        // adds all values from the other list
        Node otherrunner = other.head;
        for(int i=0;i<other.count;i++){
          union.put(otherrunner.value);
          otherrunner = otherrunner.next;
        }
        // iterates through both lists to add from this object if its not already
        // in the list
        for(int i=0;i<this.count;i++){
          otherrunner = other.head;
          put = true;
          for(int x=0;x<other.count;x++){
            if(thisrunner.value==otherrunner.value){
              put = false;
            }
            otherrunner = otherrunner.next;
          }
          if(put==true){
            union.put(thisrunner.value);
          }
          thisrunner = thisrunner.next;
        }
        return union;
    }

    /**
     * Return an intersection of this set and the other
     */
    public Set intersect(Set other) {
      Set intersect = new Set();
      Node thisrunner = this.head;
      Node otherrunner;
      boolean put;
      // iterates through both lists to add from both objects if its a
      // duplicate
      for(int i=0;i<this.count;i++){
        otherrunner = other.head;
        put = false;
        for(int x=0;x<other.count;x++){
          if(thisrunner.value==otherrunner.value){
            put = true;
          }
          otherrunner = otherrunner.next;
        }
        if(put==true){
          intersect.put(thisrunner.value);
        }
        thisrunner = thisrunner.next;
      }
      return intersect;
    }
}
