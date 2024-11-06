package DSA;

import java.util.Arrays;

public class TwoDimensionalArray {

  public static void main(String[] args) {
    rowWiseSum();
    columnWiseSum();
    diagonalSum();
    antiDiagonalSum();
  }

  public static int[][] declareAndInitialize2DArray() {
    // 1st way
    int[][] arr1 = {{1, 2, 3}, {1, 2, 3}};

    // 2nd way
    int[][] arr = new int[4][3];
    int rows = arr.length;
    int columns = arr[0].length;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        arr[i][j] = i * j;
      }
    }
    return arr;
  }

  public static void rowWiseSum() {
    // calculate the row wise sum for a 2D Matrix
    int[][] arr = declareAndInitialize2DArray();
    int r = arr.length;
    int c = arr[0].length;
    for (int i = 0; i < r; i++) {
      int sum = 0;
      for (int j = 0; j < c; j++) {
        sum += arr[i][j];
      }
      System.out.printf("sum of the row %d is %d\n", i, sum);
    }
    System.out.println();
  }

  public static void columnWiseSum() {
    // calculate the column wise sum for a 2D Matrix
    int[][] arr = declareAndInitialize2DArray();
    int r = arr.length;
    int c = arr[0].length;
    for (int i = 0; i < c; i++) {
      int sum = 0;
      for (int j = 0; j < r; j++) {
        sum += arr[j][i];
      }
      System.out.printf("sum of the column %d is %d\n", i, sum);
    }
  }

  public static void diagonalSum() {
    int[][] arr = declareAndInitialize2DArray();
    System.out.println(Arrays.deepToString(arr));
    int r = arr.length;
    int c = arr[0].length;
    int n = Math.min(r, c);
    int total = 0;
    for (int i = 0; i < n; i++) {
      total += arr[i][i];
    }
    System.out.printf("Diagonal sum of the matrix is: %d\n", total);
  }

  public static void antiDiagonalSum() {
    int[][] arr = declareAndInitialize2DArray();
    System.out.println(Arrays.deepToString(arr));
    int r = arr.length;
    int c = arr[0].length;
    int n = Math.min(r, c);
    int total = 0;
    for (int i = 0; i < n; i++) {
      total += arr[i][n - i - 1];
    }
    System.out.printf("Anti Diagonal sum of the matrix is: %d\n", total);
  }
}
