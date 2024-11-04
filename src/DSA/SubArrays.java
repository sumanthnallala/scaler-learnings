package DSA;

import java.util.ArrayList;
import java.util.List;

public class SubArrays {

  public static void main(String[] args) {
    findSubArrays();
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
}
