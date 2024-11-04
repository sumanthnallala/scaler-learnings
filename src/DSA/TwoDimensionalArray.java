package DSA;

import java.util.Arrays;

public class TwoDimensionalArray {

  public static void main(String[] args) {
    rowWiseSum();
  }

  public static int[][] declareAndInitialize() {
    // 1st way
    int[][] arr1 = {{1, 2, 3}, {1, 2, 3}};

    // 2nd way
    int[][] arr = new int[4][3];
    int rows = arr.length;
    int columns = arr[0].length;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        arr[i][j] = i + j;
      }
    }
    System.out.println(Arrays.deepToString(arr1));
    return arr;
  }

  public static void rowWiseSum() {
    // calculate the row wise sum for a 2D Matrix
    int[][] arr = declareAndInitialize();
    System.out.println(Arrays.deepToString(arr));
  }

  public static void columnWiseSum() {
    // calculate the column wise sum for a 2D Matrix
  }


}
