package LLD;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
  public static void main(String[] args) {
    Threads threads = new Threads();
    Thread t = new Thread(threads);
    t.start();
    System.out.println("Hello world from thread main: " + Thread.currentThread().getName());
    Executor executor = Executors.newFixedThreadPool(10);
    // twice the number of cores should be the threads
    System.out.println("Sumanth");
    executor.execute(threads);
  }
}
