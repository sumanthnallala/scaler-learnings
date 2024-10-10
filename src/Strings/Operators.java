package Strings;

public class Operators {

  public static void main(String[] args) {
    arithmeticOperators();
    relationalOperators();
  }

  public static void arithmeticOperators() {

    int a = 10, b = 2;

    // Addition operator
    System.out.println(a + b); // output = 12

    // Subtraction operator
    System.out.println(a - b); // output = 8

    // Multiplication operator
    System.out.println(a * b); // output = 20

    // Division operator
    System.out.println(a / b); // output = 5

    // Modulus operator
    System.out.println(a % b); // output = 0
  }

  public static void relationalOperators() {

    int a = 10, b = 2;

    // Equals to operator
    System.out.println(a == b); // output = false

    // Not equals to operator
    System.out.println(a != b); // output = true

    // Greater than operator
    System.out.println(a > b); // output = true

    // Less than operator
    System.out.println(a < b); // output = false

    // Greater than equals to operator
    System.out.println(a >= b); // output = true

    // Less than equals to operator
    System.out.println(a <= b); // output = false
  }
};
