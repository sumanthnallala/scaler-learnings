package DSA;

import java.util.ArrayList;
import java.util.List;

public class SubArrays {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3};
    //    findSubArrays();
    sumOfPossibleSubArrays();
    totalSumOfSubArrays();
    contributionTechnique();
    totalNoOfSubArraysWithLengthK();
    printStartAndEndIndexes();
  }

  public static void findSubArrays() {
    int[] arr = {1, 2, 3, 4, 5};
    int n = arr.length;
    List<Integer> array = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        for (int k = i; k <= j; k++) {
          array.add(arr[k]);
          System.out.println(array);
        }
        array = new ArrayList<>();
      }
      array = new ArrayList<>();
    }
  }

  public static int[] calculatePrefixSum(int[] A) {
    int n = A.length;
    int[] prefixSumArray = new int[n];
    prefixSumArray[0] = A[0];
    for (int i = 1; i < n; i++) {
      prefixSumArray[i] = A[i] + prefixSumArray[i - 1];
    }
    return prefixSumArray;
  }

  public static void sumOfPossibleSubArrays() {
    // optimized approach with space as O(1) and time as O(N2) from O(N) and O(N3)
    int[] arr = {1, 2, 3};
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = i; j < n; j++) {
        sum += arr[j];
        System.out.println(sum);
      }
    }
  }

  public static void totalSumOfSubArrays() {
    // optimized approach with space as O(1) and time as O(N2) from O(N) and O(N3)
    int[] arr = {1, 2, 3};
    int n = arr.length;
    int total = 0;
    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = i; j < n; j++) {
        sum += arr[j];
        total += sum;
      }
    }
    System.out.println(total);
  }

  public static void contributionTechnique() {
    // calculate no of sub arrays containing A[i]
    // formula A[i] * (i + 1) * (n - i)
    int[] arr = {1, 2, 3};
    int n = arr.length;
    int total = 0;
    for (int i = 0; i < n; i++) {
      total += arr[i] * (i + 1) * (n - i);
    }
    System.out.printf("Sum of sub arrays using contribution technique: %d\n", total);
  }

  public static void totalNoOfSubArraysWithLengthK() {
    int[] arr = {1, 2, 3, 4, 5, 6};
    int k = 2;
    int n = arr.length;
    int total = 0;
    int start = 0;
    int end = k - 1;
    while (end < n) {
      total += 1;
      start++;
      end++;
    }
    System.out.printf("Total sub arrays with length: % d\n", total);
  }

  public static void printStartAndEndIndexes() {
    int[] arr = {1, 2, 3, 4, 5, 6};
    int k = 2;
    int n = arr.length;
    int start = 0;
    int end = k - 1;
    while (end < n) {
      System.out.printf("Start and End Indexes with length %d are %d and %d\n", k, start, end);
      start++;
      end++;
    }
  }
}
