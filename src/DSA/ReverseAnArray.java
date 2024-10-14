package DSA;

import java.util.Arrays;

public class ReverseAnArray {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4};
    reverseAnArray(arr);
    reverseString();
    reverseAnArrayRange(arr, 1, 2);
    rotateAnArray();
  }

  public static void reverseAnArray(int[] arr) {
    int j = arr.length - 1;
    for (int i = 0; j > i; i++) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      j--;
    }
    System.out.println(Arrays.toString(arr));
  }

  public static void reverseAnArrayRange(int[] arr, int s, int e) {
    for (int i = s; e > i; i++) {
      int temp = arr[i];
      arr[i] = arr[e];
      arr[e] = temp;
      e--;
    }
    System.out.println(Arrays.toString(arr));
  }

  public static void reverseString() {
    String arr = "sumanth";
    String[] array = arr.split("");
    StringBuilder newString = new StringBuilder();
    newString.reverse();
    for (int i = array.length - 1; i >= 0; i--) {
      newString.append(array[i]);
    }
    System.out.println(newString);
  }

  public static void rotateAnArray() {
    int[] arr = {1, 2, 3, 4, 5};
    int k = 2;
    reverseAnArrayRange(arr, 0, arr.length - 1);
    reverseAnArrayRange(arr, 0, k - 1);
    reverseAnArrayRange(arr, k, arr.length - 1);
  }

}
