class Node<T> { // <-- whats missing?
  T data;
  Node<T> next;
  Node(T data){
    this.data = data;
    this.next = null;
  }

}

public class GenericLL<T> { // <-- what's missing?

  private Node<T> head; // convert to generic node
  private Node<T> tail; // ^

  public GenericLL(){
    this.head = null;
    this.tail = null;
  }

  public void append(T genericArg){
    // instantiate a Node object of type T here, constructed using the generic argument
    Node<T> newNode = new Node<T>(data);
    if(this.head == null){
      this.head = newNode;
      this.tail = newNode;
    } else {
      this.tail.setNext(newNode);
      newNode.setPrevious(this.tail);
      this.tail = newNode;
   }
  }



  public static void main(String[] args){
    // create a LL of type Integer
    // append 3 ints
    //
    // create another LL of type String
    // append 3 strings
  }

}
