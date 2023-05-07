public class LinkedList{
  private Node head;
  private Node tail;

  public LinkedList(){
    this.head = null;
    this.tail = null;
  }
  public LinkedList(Node head, Node tail){
    this.head = head;
    this.tail = tail;
  }
  public void add(Node node){
    if(this.head==null){
      this.head = node;
      this.tail = node;
    }else{
      this.tail.head = node;
      node.tail = this.tail;
      this.tail = node;
    }
  }
  public static void main(String[] args){
  LinkedList list = new LinkedList(p, p);
  }
}
