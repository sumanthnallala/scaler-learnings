package DSA;

public class BitManipulation {
  public static void main(String[] args) {
    String a = "101";
    String b = "1001";
    StringBuilder result = new StringBuilder();

    int i = a.length() - 1, j = b.length() - 1, carry = 0;

    while (i >= 0 || j >= 0) {
      int sum = carry;
      if (i >= 0) {
        sum += a.charAt(i--) - '0';
      }
      if (j >= 0) {
        sum += b.charAt(j--) - '0';
      }
      carry = sum / 2;

      result.append(sum % 2);
    }

    if (carry != 0) {
      result.append(carry);
    }
    System.out.println(result.reverse().toString());
  }
}
