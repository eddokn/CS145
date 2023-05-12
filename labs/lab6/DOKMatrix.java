import java.util.HashMap;

public class DOKMatrix extends Matrix{
    HashMap<String, Double> keys;


  public DOKMatrix(int rows, int columns){
    super(rows, columns);
    this.keys = new HashMap<String, Double>();
  }



  public double get(int row, int col){
    return this.keys.get(Integer.toString(row) + "," + Integer.toString(col));
  }

  public void set(int row, int col, double value){
    String key = Integer.toString(row) + "," + Integer.toString(col);
    this.keys.put(key,value);
  }

  public static void main(String[] args){
    Matrix matrix = new DOKMatrix(100,100);
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
