public class LinkedList{
  private Node head;
  private Node tail;

  // I made a small mistake and said that java makes a default
  // constructor for you, which takes no arguments and sets all
  // attributes to null. This is true only if there are no other
  // constructors defined. Since we made another constructor, java
  // does not make the default one for us. So, we must make it ourselves.
  public LinkedList(){
    this.head = null;
    this.tail = null;
  }

  public LinkedList(Node head, Node tail){
    this.head = head;
    this.tail = tail;
  }

  public void append(Node newNode){
   if(this.head == null){
     this.head = newNode;
     this.tail = newNode;
   } else {
    this.tail.setNext(newNode);
    newNode.setPrevious(this.tail);
    this.tail = newNode;
   }
  }

  public void prepend(Node newNode){
    if(this.head == null){
      this.head = newNode;
      this.tail = newNode;
    } else {
      newNode.setNext(this.head);
      this.head.setPrevious(newNode);
      this.head = newNode;
    }
  }

  public void printAll(){
    Node runner; 
    runner = this.head;
    while(runner != null){
      System.out.print(runner.getData() + " ");
      runner = runner.getNext();
    }
    System.out.println();
  }

  public void deleteFirst(){
    this.head = this.head.getNext();
    this.head.setPrevious(null);
  }

  public void deleteLast(){
    this.tail = this.tail.getPrevious();
    this.tail.setNext(null);
  }

  public static void main(String[] args){
    LinkedList LL = new LinkedList();
    Node n1 = new Node("first node");   // <-- 
    LL.append(n1);                      // <-- this is fine BUT
    LL.append(new Node("second node")); // in cases like this, it's not necessary to make a Node variable at all. we're never using n1 again, so why bother?
    LL.append(new Node("third node"));  // instead, just make a new Node object and directly pass it as an argument to append()
    LL.prepend(new Node("zero'th node"));
    
    LL.printAll();
    LL.deleteFirst();
    LL.deleteLast();
    System.out.println("deleted first and last node");
    LL.printAll();

  }

}
