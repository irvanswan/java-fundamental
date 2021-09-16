package loop;

import java.util.Scanner;

public class LoopJava {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }
    System.out.println();

    int[] intArray = { 1, 2, 3, 4, 5, 6, 7 };
    for (int element : intArray) {
      System.out.println(element);
    }
    System.out.println();

    Scanner scanner = new Scanner(System.in);

    int sum = 0;
    System.out.print("Input n : ");
    int n = Integer.valueOf(scanner.nextLine());
    for (int i = 0; i < n; i++) {
      if ((i + 1) % 3 == 0 || (i + 1) % 5 == 0) {
        sum += (i + 1);
      }
    }
    System.out.println(sum);
    System.out.println();

    String reverse = "";
    System.out.print("Input string : ");
    String input = scanner.nextLine();
    for (int i = 0; i < input.length(); i++) {
      reverse += input.charAt(input.length() - i - 1);
    }
    System.out.println(reverse);

    System.out.print("Input n : ");
    int num = Integer.valueOf(scanner.nextLine());
    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num; j++) {
        if (i == j) {
          System.out.print("*");
        }
        System.out.print(" ");
      }
      System.out.println();
    }

    scanner.close();

  }
}
