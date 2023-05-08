public class Node {
  char info;
  Node next;

  public Node(char letter, Node node){
    this.info = letter;
    this.next = node;
  }
}
