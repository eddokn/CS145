public class Example2 extends Thread {
  
  // think of this like a thread's very own main() 
  public void run() {
    System.out.println("About to do a heavy workload");

    try {
      Thread.sleep(100);
    } catch(Exception e){}

    System.out.println("Heavy workload finished");
  }

  public static void main(String[] args) {
    Example2 exmpl1 = new Example2();
    Example2 exmpl2 = new Example2();
    Example2 exmpl3 = new Example2();

    System.out.println("Threads are about to start running");

    exmpl1.start();
    exmpl2.start();
    exmpl3.start();

    System.out.println("Threads are currently running. Waiting for them to finish...");

    try {
      exmpl1.join();
      exmpl2.join();
      exmpl3.join();
    } catch(InterruptedException e){}

    System.out.println("Threads have finished running");
  }
}
