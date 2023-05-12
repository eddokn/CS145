import java.util.LinkedList;

public abstract class Matrix{
  protected int rows;
  protected int columns;

  public Matrix(int rows, int columns){
    //intialize rows and columns
    this.rows = rows;
    this.columns = columns;
  }

  public Matrix(double data[][]){
    //intializes rows and columns
     this.rows = data.length;
     this.columns = data[0].length;
  }

  public abstract double get(int row, int col);

  public abstract void set(int row, int col, double value);
}
