package Strings;
import com.sun.org.apache.xpath.internal.operations.Bool;
import java.util.Scanner;
public class Strings {

  public void readStrings() {
    Scanner sc = new Scanner(System.in);
    // reading the integer
    int a = sc.nextInt();
    // reading the short
    short b = sc.nextShort();
    // reading the byte
    byte c =  sc.nextByte();
    // reading the long
    long d = sc.nextLong();

    // reading string without spaces
    String e = sc.next(); // which will not take the whole word when String contains spaces.

    // reading string with spaces
    String f = sc.nextLine();

    // reading boolean
    boolean g = sc.nextBoolean();

    // scanner class doesn't allow to read single character
    char h = sc.next().charAt(0);

  }

}
