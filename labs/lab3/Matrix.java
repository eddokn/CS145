public class Matrix{
  // attributes
  private double[][] matrix;

  public Matrix(int rows, int columns){
    //intialize a matrix of dimensions rows x colums with all
    // entries as zero
     this.matrix = new double[rows][columns];

  }

  public Matrix(double data[][]){
    //intializes a matrix with a provided two dimensional
    //array of data
     this.matrix = data;
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
    Matrix matrix = new Matrix(this.matrix.length, this.matrix[0].length);
    for(int i=0; i < this.matrix.length; i++){
      for(int x=0; x < this.matrix[0].length;x++){
        matrix.matrix[i][x] = this.matrix[i][x] + other.matrix[i][x];
      }
    }
    return matrix;
  }

  public Matrix sub(Matrix other){
    Matrix matrix = new Matrix(this.matrix.length, this.matrix[0].length);
    for(int i=0; i < this.matrix.length; i++){
      for(int x=0; x < this.matrix[0].length;x++){
        matrix.matrix[i][x] = this.matrix[i][x] - other.matrix[i][x];
      }
    }
    return matrix;
  }

  public Matrix scalarmul(double scalar){
    //return a new matrix that is the result of
    //the scalar multiplication of this matrix with given scalar
    Matrix matrix = new Matrix(this.matrix.length, this.matrix[0].length);
    for(int i=0; i < this.matrix.length; i++){
      for(int x=0; x < this.matrix[0].length; x++){
        matrix.matrix[i][x] = this.matrix[i][x] * scalar;
      }
    }
    return matrix;
  }

  public Matrix transpose(){
    //transpose given matrix
    Matrix matrix = new Matrix(this.matrix[0].length, this.matrix.length);
    for(int i=0; i < this.matrix[0].length; i++){
      for(int x=0; x < this.matrix.length; x++){
        matrix.matrix[i][x] = this.matrix[x][i];
      }
    }
    return matrix;
  }

  public static void main(String[] args){
    //create matricies
    double firstarray[][] = {{1, 2, 3}, {4, 5, 6}};
    Matrix firstmatrix = new Matrix(firstarray);
    Matrix secondmatrix = firstmatrix;
    double testarray[][] = {{2, 4, 6}, {8, 10, 12}};
    Matrix testmatrix = new Matrix(testarray);
    double testarray2[][] = {{2, 8},{4,10},{6, 12}};
    Matrix testmatrix2 = new Matrix(testarray2);
    double emptyarray[][] = {{0, 0, 0}, {0, 0, 0}};
    Matrix emptymatrix = new Matrix(emptyarray);
    //test addition method
    if(firstmatrix.add(secondmatrix).matrix==testmatrix.matrix){
      System.out.println("addition successful");
    }
    else{
      System.out.println("addition failure");
    }
    //test subtraction method
    if(firstmatrix.sub(secondmatrix).matrix==emptymatrix.matrix){
      System.out.println("subtraction successful");
    }
    else{
      System.out.println("subtraction failure");
        }
  //test scalar multiplication
    if(firstmatrix.scalarmul(2).matrix==testmatrix.matrix){
    System.out.println("scalarmul successful");
    }
    else{
    System.out.println("scalarmul failure");
  }
  //transpose test
  if(firstmatrix.transpose().matrix==testmatrix2.matrix){
    System.out.println("transpose successful");
  }
  else{
    System.out.println("transpose failure");
  }
  }
}
