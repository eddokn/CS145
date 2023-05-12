public class CircularLL {

  private Node currentNode;

  public void next(){
    currentNode = currentNode.getNext();
  }
  public void previous(){
    currentNode = currentNode.getPrevious();
  }
  public void printCurrent(){
    System.out.println(currentNode.getData());
  }

  // add a node after currentNode
  public void add(String data) {
    Node newNode = new Node(data);
    if (currentNode == null) {
      newNode.setNext(newNode);
      newNode.setPrevious(newNode);
      currentNode = newNode;
    } else {
    	newNode.setNext(currentNode.getNext());
    	newNode.setPrevious(currentNode);
      currentNode.getNext().setPrevious(newNode);
    	currentNode.setNext(newNode);
    }
  }

  // delete the node pointed to by currentNode and set currentNode to next
  public void delete(){
    if(currentNode.getNext() == currentNode) { 
      currentNode = null;
    }
    currentNode.getPrevious().setNext(currentNode.getNext());
    currentNode.getNext().setPrevious(currentNode.getPrevious());
    next();
  }

  public void printAll(){
    Node runner = currentNode;
    System.out.print(runner.getData());
    runner = runner.getNext();
    while(runner != currentNode){
      System.out.print(runner.getData());
      runner = runner.getNext();
    }
    System.out.println();
  }
  
  public static void main(String[] args){
    CircularLL cll = new CircularLL();
    cll.add("A");
    cll.add("B");
    cll.add("C");
    cll.add("D");

    cll.printAll();
    cll.delete();
    cll.printAll();
    cll.delete();
    cll.printAll();
    cll.add("E");
    cll.printAll();
  }
}
