package DSA;

public class SpecialIndexNumber {

  public static void main(String[] args) {
    findTheSpecialIndexCount();
  }

  public static void findTheSpecialIndexCount() {
    int[] B = {1, 1, 1};
    int n = B.length;
    int count = 0;
    int[] prefixEvenSum = new int[n];
    int[] prefixOddSum = new int[n];
    int evenSum = 0;
    int oddSum = 0;
    prefixEvenSum[0] = B[0];
    prefixOddSum[0] = 0;
    for (int i = 1; i < n; i++) {
      if (i % 2 == 0) {
        prefixEvenSum[i] = prefixEvenSum[i - 1] + B[i];
        prefixOddSum[i] = prefixOddSum[i - 1];
      } else {
        prefixOddSum[i] = prefixOddSum[i - 1] + B[i];
        prefixEvenSum[i] = prefixEvenSum[i - 1];
      }
    }

    for (int i = 0; i < n; i++) {
      if (i == 0) {
        evenSum = prefixOddSum[n - 1] - prefixOddSum[i];
        oddSum = prefixEvenSum[n - 1] - prefixEvenSum[i];
      } else {
        evenSum = prefixEvenSum[i - 1] + prefixOddSum[n - 1] - prefixOddSum[i];
        oddSum = prefixOddSum[i - 1] + prefixEvenSum[n - 1] - prefixEvenSum[i];
      }
      if (evenSum == oddSum) {
        count++;
      }
    }
    System.out.println("Count of array indices are " + count);
  }
}
