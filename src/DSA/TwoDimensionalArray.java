package DSA;

import java.util.Arrays;

public class TwoDimensionalArray {

  public static void main(String[] args) {
    rowWiseSum();
    columnWiseSum();
    diagonalSum();
    antiDiagonalSum();
    allDiagonals();
    transposeOfSquareMatrix();
    transposeOfMatrix();
  }

  public static int[][] declareAndInitialize2DArray() {
    // 1st way
    int[][] arr1 = {{1, 2, 3}, {1, 2, 3}};

    // 2nd way
    int[][] arr = new int[3][3];
    int rows = arr.length;
    int columns = arr[0].length;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        arr[i][j] = (i + 1) * (j);
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

  public static void allDiagonals() {
    // left to right
    int[][] arr = declareAndInitialize2DArray();
    System.out.println(Arrays.deepToString(arr));
    int m = arr.length;
    int n = arr[0].length;
    // columns
    for (int i = 0; i < n; i++) {
      int r = 0, c = i;
      while (r < m && c >= 0) {
        System.out.println(arr[r][c]);
        r++;
        c--;
      }
    }

    for (int i = 1; i < m; i++) {
      int r = i, c = n - 1;
      while (r < m && c >= 0) {
        System.out.println(arr[r][c]);
        r++;
        c--;
      }
    }
  }

  public static void transposeOfSquareMatrix() {
    // square matrix
    int[][] arr = declareAndInitialize2DArray();
    System.out.println(Arrays.deepToString(arr));
    int m = arr.length;
    int n = arr[0].length;
    for (int i = 0; i < m; i++) {
      for (int j = i + 1; j < n; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }
    System.out.println(Arrays.deepToString(arr));
  }

  public static void transposeOfMatrix() {
    // Non square matrix
    int[][] arr = declareAndInitialize2DArray();
    System.out.println(Arrays.deepToString(arr));
    int m = arr.length;
    int n = arr[0].length;
    int [][] newArr =  new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        newArr[i][j] = arr[j][i];
      }
    }
    System.out.println(Arrays.deepToString(newArr));
  }
}
