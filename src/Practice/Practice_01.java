package Practice;

import java.util.Arrays;

// Prefix sum and range sum queries with equilibrium index questions practice
public class Practice_01 {

  public static void main(String[] args) {
//    rangeSumQueries();
    test();
  }


  public static void rangeSum(int L, int R, int[] N) {
    int sum = 0;
    for (int i = 1; i <= 4; i++) {
      sum = sum + N[i];
    }
  }

  public static int[] calculatePrefixSum(int[] A) {
    int[] prefixSum = new int[A.length];
    for (int i = 1; i < A.length; i++) {
      prefixSum[0] = A[0];
      prefixSum[i] = prefixSum[i - 1] + A[i];
    }
    return prefixSum;
  }

  public static int[] calculateEvenIndexedPrefixSum(int[] A) {
    int[] prefixSum = new int[A.length];
    for (int i = 1; i < A.length; i++) {
      if (i % 2 == 0) {
        prefixSum[0] = A[0];
        prefixSum[i] = prefixSum[i - 1] + A[i];
      } else {
        prefixSum[i] = prefixSum[i - 1];
      }
    }
    return prefixSum;
  }

  public static int[] calculateOddIndexedPrefixSum(int[] A) {
    int[] prefixSum = new int[A.length];
    for (int i = 1; i < A.length; i++) {
      if (i % 2 != 0) {
        prefixSum[0] = 0;
        prefixSum[i] = prefixSum[i - 1] + A[i];
      } else {
        prefixSum[i] = prefixSum[i - 1];
      }
    }
    return prefixSum;
  }

  public static void rangeSumQueries() {
//    Given N array elements and Q queries, for each query calculate the sum of all elements
//    ranging from L to R

    int[] N = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
    int[] L = {1, 1, 2, 2, 0};
    int[] R = {4, 6, 3, 4, 7};
    int[] Q = new int[5];

//    Brute force
    for (int i = 0; i < Q.length; i++) {
      int left = L[i];
      int right = R[i];
      rangeSum(left, right, N);
    }

//    Optimized approach for reducing the time complexity

//    create a prefix sum of array
//    loop for all the queries and
//    sum =  pf[r] - pf[l-1]

    int[] prefixSum = calculatePrefixSum(N);
    System.out.println(Arrays.toString(prefixSum));
    for (int i = 0; i < Q.length; i++) {
      int left = L[i];
      int right = R[i];
      int sum = 0;
      if (left == 0) {
        sum = prefixSum[right];
      } else {
        sum = prefixSum[right] - prefixSum[left - 1];
      }
      System.out.printf("Optimised prefix sum: %d\n", sum);
    }

//    calculate the sum of the even indexed in array
//    calculate the sum of odd indexed in array
//    calculate the count of the equilibrium index using prefix odd and prefix even
  }

  public static void solve() {
    int[] a = {1, 2, 3};
    int n = a.length;
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        for (int k = i; k <= j; k++) {
          System.out.println(a[k]);
        }
      }
    }
  }

  public static void test() {
    int[][] arr = new int[4][3];
    int[][] arrayName = {{1, 2, 4}, {4, 5, 6}, {7, 8, 9}};
    int n = arrayName.length;
    int antiDiagSum = 0;
    int diagSum = 0;
    for (int i = 0; i < n; i++) {
      antiDiagSum += arrayName[i][n - i - 1];
      diagSum += arrayName[i][i];
    }
    System.out.printf("Anti Diagonal sum of matrix : %d\n", antiDiagSum);
    System.out.printf("Diagonal sum of matrix : %d ", diagSum);
  }
}
