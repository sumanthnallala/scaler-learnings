package DSA;

import java.util.Scanner;

public class PrimeNumbers {

  public static void main(String[] args) {
    findPrime();
    findPrimeNew();
  }

  public static void findPrime() {
    // brute force approach
    long startTime = System.currentTimeMillis();
    Scanner scanner = new Scanner(System.in);
//    System.out.println("Enter the number: ");
//    int num = scanner.nextInt();
    // logic
    int num = 160;
    int count = 0;
    for (int i = 2; i <= num; i++) {
      if (num % i == 0) {
        count++;
      }
    }

    if (count == 0) {
      System.out.println(num + " is a prime number");
    } else {
      System.out.println(num + " is not a prime number");
    }

    long endTime = System.currentTimeMillis();
    long executionTimeInMS = (endTime - startTime);
    System.out.println("brute force time in ms " + executionTimeInMS + "\n");
  }

  public static void findPrimeNew() {
    // optimized approach
    long startTime = System.currentTimeMillis();
    Scanner scanner = new Scanner(System.in);
//    System.out.println("Enter the number: ");
//    int num = scanner.nextInt();

    //logic
    int num = 160;
    int count = 0;
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        count += 1;
      }
    }
    if (count == 0) {
      System.out.println(num + " is a prime number");
    } else {
      System.out.println(num + " is not a prime number");
    }

    long endTime = System.currentTimeMillis();
    long executionTimeInMS = (endTime - startTime);
    System.out.println("optimized time in ms " + executionTimeInMS + "\n");
  }
}