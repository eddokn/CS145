//Author: Grayson Koch
//Date: 5/7
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
      this.tail.next = node;
      this.tail = this.tail.next;
    }
  }
  public void remove(char letter){
    Node runner;
    runner = this.head;
    while(runner != null && runner.info == letter){
      runner = runner.next;
      this.head = runner;
    }
    while(runner != null && runner.next != null){
      if(runner.next.info == letter){
        runner.next = runner.next.next;
      }
      this.tail = runner;
      runner = runner.next;
    }
    }
    public void removeConsecutiveDuplicates(){
      Node runner;
      runner = this.head;
      while(runner != null && runner.next != null && runner.next.info == runner.info){
        runner = runner.next.next;
        this.head = runner;
      }
      while(runner != null && runner.next != null && runner.next.next != null){
        if(runner.next.next.info == runner.next.info){
          runner.next = runner.next.next.next;
        }
        this.tail = runner;
        runner = runner.next;
      }
    }
    public void printAll(){
      Node runner;
      runner = this.head;
      while(runner != null){
        System.out.print(runner.info + " ");
        runner = runner.next;
      }
      System.out.println();
    }

  public static void main(String[] args){
  LinkedList list = new LinkedList();
  Node p = new Node('p',null);
  list.add(p);
  list.printAll();
  list.tail.next = list.head;
  list.tail = list.tail.next;
  list.head = list.head.next;
  list.tail.next = null;
  list.printAll();
  LinkedList AA = new LinkedList();
  Node a = new Node('a',null);
  Node b = new Node('a',null);
  Node c = new Node('b',null);
  AA.add(a);
  AA.add(b);
  AA.add(c);
  AA.remove('b');
  AA.printAll();
  AA.add(c);
  AA.removeConsecutiveDuplicates();
  AA.printAll();

  }
}
