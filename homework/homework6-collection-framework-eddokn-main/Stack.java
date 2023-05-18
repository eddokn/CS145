/**
 * Define a LIFO stack
 */
public class Stack extends Collection {
    public Stack() {
      super();
    }

    public Integer get() {
        // TODO: Implement this
        // stores the int value of the head and sets it to the next node
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
        super.put(value);
    }
}
