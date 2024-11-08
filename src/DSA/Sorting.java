package DSA;

import java.util.Arrays;
import java.util.Collections;

public class Sorting {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
    minimumCostUsingSorting();
    findTheCountOfNobleInteger();
  }

  public static void minimumCostUsingSorting() {
    Integer[] arr = {1, 2, 3, 4};
    int n = arr.length;
    Arrays.sort(arr, Collections.reverseOrder());
    int cost = 0;
    for (int i = 0; i < n; i++) {
      cost += (n - i) * arr[i];
    }
    System.out.println(Arrays.toString(arr));
    System.out.println(cost);
  }

  public static void findTheCountOfNobleInteger() {
    int[] A = {0, 5, 1, 2, 3};
    int n = A.length;
    int count = 0;
    Arrays.sort(A);
    for (int i = 0; i < n; i++) {
      if (A[i] == i) {
        count += 1;
      }
    }
    System.out.println(count);
  }
}
