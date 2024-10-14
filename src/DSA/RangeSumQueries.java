package DSA;

import java.util.Arrays;

public class RangeSumQueries {

  public static void main(String[] args) {
    calculateRangeSum();
  }

  public static int[] calculatePrefixSum(int[] A) {
    int n = A.length;
    int[] prefixSum = new int[n];
    prefixSum[0] = A[0];
    for (int i = 1; i < n; i++) {
      prefixSum[i] = prefixSum[i - 1] + A[i];
    }
    System.out.println(Arrays.toString(prefixSum));
    return prefixSum;
  }

  public static void calculateRangeSum() {
    int[] A = {1, 2, 3, 4, 5};
    int[][] B = {{0, 2}, {0, 0}};
    int n = B.length;
    int[] output = new int[n];
    int[] prefixSum = calculatePrefixSum(A);
    for (int i = 0; i < n; i++) {
      int L = B[i][0];
      int R = B[i][1];
      if (R == 0) {
        output[i] = prefixSum[0];
      } else if (L == 0) {
        output[i] = prefixSum[R];
      } else {
        output[i] = prefixSum[R] - prefixSum[L - 1];
      }
    }
    System.out.println(Arrays.toString(output));
  }
}
