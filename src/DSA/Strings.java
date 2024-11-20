package DSA;

public class Strings {
  public static void main(String[] args) {
    toggleCase();
    reverseString();
    stringOperations();
  }

  public static void toggleCase() {
    String s = "SumanTh";
    StringBuilder sb = new StringBuilder();
    int n = s.length();
    for (int i = 0; i < n; i++) {
      char c = s.charAt(i);
      if (c >= 'a' && c <= 'z') {
        sb.append((char) (c - 32));
      } else {
        sb.append((char) (c + 32));
      }
    }
    System.out.println(sb.toString());
  }

  public static void reverseString() {
    String s = "the   sky   is blue";
    String[] c = s.split(" ");
    StringBuilder sb = new StringBuilder();
    for (int i = c.length - 1; i >= 0; i--) {
      if (!c[i].isEmpty()) {
        sb.append(c[i]).append(" ");
      }
    }
    String newString = sb.toString().trim();
    System.out.println(newString);
  }

  public static void stringOperations() {
    StringBuilder sb = new StringBuilder();
    String s = "AbcaZeoB";
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c >= 'a' && c <= 'z') {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
          sb.append("#");
        } else {
          sb.append(c);
        }
      }
    }
    System.out.println(sb.toString());
  }
}
