package DSA;

import java.util.Scanner;

public class Factors {

  public static void main(String[] args) {
    findFactors();
    findFactorsNew();
  }

  public static void findFactors() {
    // brute force approach
    long startTime = System.currentTimeMillis();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num = 255550000;
    int count = 0;
    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        count++;
      }
    }
    long endTime = System.currentTimeMillis();
    long executionTimeInMS = (endTime - startTime);
    long executionTimeInSeconds = (endTime - startTime) / 1000;
    System.out.println("Number of factors are " + count);
    System.out.println("Brute force time in ms " + executionTimeInMS);
    System.out.println("Brute force time in seconds " + executionTimeInSeconds);
  }

  public static void findFactorsNew() {
    // optimized approach
    long startTime = System.currentTimeMillis();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num = 255550000;
    int count = 0;
    for (int i = 1; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        if (num / i == i) {
          count += 1;
        }
        count += 2;
      }
    }
    long endTime = System.currentTimeMillis();
    long executionTimeInMS = (endTime - startTime);
    long executionTimeInSeconds = (endTime - startTime) / 1000;
    System.out.println("Number of factors are " + count);
    System.out.println("optimized time in ms " + executionTimeInMS);
    System.out.println("optimized time in seconds " + executionTimeInSeconds);
  }

}
