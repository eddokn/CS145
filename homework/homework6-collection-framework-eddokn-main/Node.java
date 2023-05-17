/**
 * Define a doubly linked node
 */
public class Node {
    public Integer value;
    public Node next;
    public Node previous;

    /**
     * Create a Node with the given parameters
     */
    public Node(Integer value, Node next, Node previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }
}
