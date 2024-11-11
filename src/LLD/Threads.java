package LLD;

public class Threads implements Runnable {

  @Override
  public void run() {
    System.out.println("Hello world from thread: " + Thread.currentThread().getName());
  }
}
