import java.util.LinkedList;

public class LOLMatrix extends Matrix{
  private int value;
  private LinkedList<LinkedList> list;
  private LinkedList<Node> sublist;
  private Node setter;

  public LOLMatrix(int rows, int columns){
    super(rows, columns);
    this.list = new LinkedList<LinkedList>();
    for(int i=0;i<=rows;i++){
      LinkedList<Node> sublist = new LinkedList<Node>();
      this.list.add(i, sublist);
    }
  }


  public double get(int row, int col){
    LinkedList<Node> values = this.list.get(row);
      for(int i=0;i<values.size();i++){
        if(values.get(i).columns == col){
          return values.get(i).value;
        }
      }return 0;
  }

  public void set(int row, int col, double value){
    Node setter = new Node();
    setter.columns = col;
    setter.value = value;
    this.list.get(row).add(setter);
}
  public static void main(String[] args){
    Matrix matrix = new LOLMatrix(100,100);
    matrix.set(1,1,20);
    matrix.set(1,2,123);
    matrix.set(23,46,23);
    matrix.set(100,100,100);
    if(matrix.get(1,1)!=20){System.out.print("1,1,20 failure");}
    if(matrix.get(1,2)!=123){System.out.print("1,2,123 failure");}
    if(matrix.get(23,46)!=23){System.out.print("23,46,23 failure");}
    if(matrix.get(100,100)!=100){System.out.print("100,100,100 failure");}



  }
}
