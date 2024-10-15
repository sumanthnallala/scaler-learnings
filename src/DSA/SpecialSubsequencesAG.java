package DSA;

public class SpecialSubsequencesAG {

  public static void main(String[] args) {
    findSubsequencesCount();
  }

  public static void findSubsequencesCount() {
    String A = "BCGA";
    int n = A.length();
    int count = 0;
    int ouput = 0;
    int[] prefixSum = new int[n];
    for (int i = 0; i < n; i++) {
      if (A.charAt(i) == 'A') {
        count++;
        prefixSum[i] = count;
      } else {
        prefixSum[i] = count;
      }
    }
    for (int i = 0; i < n; i++) {
      if (A.charAt(i) == 'G') {
        ouput += prefixSum[i];
      }
    }
    System.out.println(ouput);
  }
}
