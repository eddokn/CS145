public class Matrix{

  double[][] matrix;
  public Matrix(int rows, int columns){
    //intialize a matrix of dimensions rows x colums with all
    // entries as zero
    double[][] matrix = new double[rows][columns];

  }

  public Matrix(double data[][]){
    //intializes a matrix with a provided two dimensional
    //array of data
    double[][] matrix = data;
  }

  public double get(int row, int col){
    //retrieve the entry at the given row and column
    return this.matrix[row][col];
  }

  public void set(int row, int col, double value){
    //set the entry at the given row and column to given value
    this.matrix[row][col] = value;
  }

  public Matrix add(Matrix other){
    //return a new matrix that is the result of adding this Matrix
    //with the other one
    Matrix matrix = new Matrix();
    for(int i; i < this.matrix.length; i++){
      for(int x; x < this.matrix.length;x++){
        matrix[i][x] = this.matrix[i][x] + other[i][x];
      }
    }
    return matrix;
  }

  public Matrix sub(Matrix other){
    Matrix matrix = new Matrix();
    for(int i; i < this.matrix.length; i++){
      for(int x; x < this.matrix.length;x++){
        matrix[i][x] = this.matrix[i][x] - other[i][x];
      }
    }
    return matrix;
  }

  public Matrix scalarmul(double scalar){
    //return a new matrix that is the result of
    //the scalar multiplication of this matrix with given scalar
  }

  public Matrix transpose(){
    //transpose given matrix
  }

  public static void main(String[] args){
    double test_2d_array[][] = { {1, 2, 3}, {4, 5, 6} };
    System.out.println(test_2d_array);
  }
}
