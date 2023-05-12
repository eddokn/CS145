// task: change the Node class so it has a reference to the previous node in the list
// you'll also have to edit main a bit

public class Node {

  private String data;
  private Node next;
  private Node previous;

  Node(String data){
    this.data = data;
    this.next = null;
  }

  public void setData(String data){
    this.data = data;
  }
  public void setNext(Node next){
    this.next = next;
  }
  public String getData(){
    return this.data;
  }
  public Node getNext(){
    return this.next;
  }
  public void setPrevious(Node prev){
    this.previous = prev;
  }
  public Node getPrevious(){
    return this.previous;
  }



  public static void main(String[] args){


    Node n1 = new Node("people");
    Node n2 = new Node("coal");
    Node n3 = new Node("rocks");
    Node n4 = new Node("dogs");

    n1.setNext(n2);
    n2.setNext(n3);
    n3.setNext(n4); 
    // n3 is the end of the list, so we leave its 'next' null
    // when a node's next is null, that's how we know it's the last node in the list

    //System.out.println(n1.data);
    //System.out.println(n1.next.data);
    //System.out.println(n1.next.next.data);

    Node anyNode;  
    anyNode = n1;
    while(anyNode != null){ // while we're not after the end of the list
      System.out.println(anyNode.data);
      anyNode = anyNode.next; // set anyNode to be the next node in the list
    }


  }
}
