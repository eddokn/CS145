/**
 * Abstract class for a collection
 */
public abstract class Collection {
    protected Node head;
    protected Node tail;
    protected int count;

    public Collection() {
        head = tail = null;
        count = 0;
    }

    public int size() {
        return count;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    // Don't change anything above. The automatic tests use it

    /**
     * Get an item from the collection, or null if empty
     */
    abstract Integer get();

    /**
     * Add an item to the collection
     */
    abstract void put(Integer value);

    /**
     * Return true if the collection contains the value, or false otherwise
     */
    boolean contains(Integer value) {
        // TODO: You must implement this method
        for(int i=0; i<count)
        return false;
    }

    /**
     * Print out the collection. This is a helpful method for you to use.
     * Really helps with debugging.
     */
    public String toString() {
        String result = getClass().toString() + "::Count(" + count + "): [";
        for (Node node = head; node != null; node = node.next) {
            result += node.value + ", ";
        }
        return result + "]";
    }

    /**
     * A simple test function
     */
    public static void main(String[] args) {
        Queue q = new Queue();
        q.put(42);
        q.put(13);
        System.out.println(q.get());
        System.out.println(q.get());
        System.out.println(q);

        Stack s = new Stack();
        s.put(42);
        s.put(13);
        System.out.println(s.get());
        System.out.println(s);
        System.out.println(s.get());
    }
}
