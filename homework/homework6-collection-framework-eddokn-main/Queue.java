/**
 * Queue extends Collection to get a FIFO queue
 */
public class Queue extends Collection {
   public Queue() {
      super();
    }

    public Integer get() {
        // TODO: Implement this
        // stores the int value of the head and sets it to the next node
        Integer returnint = head.value;
        this.head = this.head.next;
        this.count -= 1;
        if(this.count == 0){
          this.head = this.tail = null;
        }
        return returnint;
    }

    public void put(Integer value) {
        // TODO: Implement this
        super.put(value);
        }
    }
