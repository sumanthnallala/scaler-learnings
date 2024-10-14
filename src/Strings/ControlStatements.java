package Strings;

import java.util.Objects;
import java.util.Scanner;

public class ControlStatements {
  
  public static void main(String[] args) {
    controlStatements();
  }

  public static void controlStatements() {
    Scanner sc = new Scanner(System.in);
    String weather = sc.nextLine();

    if (Objects.equals(weather, "abc")) {
      System.out.println("False");
    } else if (Objects.equals(weather, "bcd")) {
      System.out.println("True");
    } else {
      System.out.println("Nothing");
    }
  }

}

