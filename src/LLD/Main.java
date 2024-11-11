package LLD;

public class Main {
  public static void main(String[] args) {
    Threads threads = new Threads();
    Thread t = new Thread(threads);
    t.start();
    System.out.println("Hello world from thread main: " + Thread.currentThread().getName());
  }
}
