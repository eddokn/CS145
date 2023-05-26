public class Example extends Thread {

  // think of this like a thread's very own main()
  public void run() {
    System.out.println("This code is running in a thread");
  }

  public static void main(String[] args) {
    Example exmpl = new Example();
    exmpl.start(); // does some stuff then calls run() 
    System.out.println("This code is outside of the thread");
  }
}
