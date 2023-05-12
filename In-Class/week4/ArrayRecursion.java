public class ArrayRecursion {
  public static boolean search(int[] arr, int x, int index) {
    if(index == arr.length){ // base case, end of array
      return false;
    }
    if(arr[index]==x){ // base case, number found
      return true;
    }
      return search(arr, x, index+1); // recursive case
    }



  /* arr: array to search through
   * x: int to search for
   * low: lower/leftside boundary of the zone I'm currently searching within
   * high: upper/rightside boundary of the zone I'm currently searching within
   */
  public static boolean binarySearch(int[] arr, int x, int low, int high){
  if(arr[(high-low)/2]==x){
    return true;
  }
  if(arr[(high-low)/2]>x){
  binarySearch(arr,x,((high-low)/2)+1,high);
  }
  if(arr[(high-low)/2]<x){
  binarySearch(arr,x,low,((high-low)/2)-1);
}
}

  public static void main(String[] args) {
    int[] arr = {1, 3, 5, 7, 9};
    int num1 = 5;
    int num2 = 8;

    System.out.println(num1 + " exists in the array: " + search(arr, num1, 0));
    System.out.println(num2 + " exists in the array: " + search(arr, num2, 0));

    System.out.println(num1 + " exists in the array: " + binarySearch(arr, num1, 0, arr.length);
    System.out.println(num2 + " exists in the array: " + binarySearch(arr, num2, 0, arr.length-1);
  }
}
