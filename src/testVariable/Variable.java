package testVariable;

import java.util.Scanner;

public class Variable {
  public static void main(String[] args) {
    // INSTANCE OBJECT
    Scanner sc = new Scanner(System.in);
    System.out.print("Input nama depan : ");
    String firstName = sc.nextLine();
    System.out.print("Input nama belakang : ");
    String lastName = sc.nextLine();
    System.out.print("Input tempat lahir : ");
    String birthPlace = sc.nextLine();
    System.out.print("Input tahun lahir : ");
    // int birthYear = Integer.valueOf(sc.nextLine());
    int birthYear = sc.nextInt();
    sc.nextLine();
    System.out.print("Input bahasa pemrograman fav : ");
    String favLang = sc.nextLine();
    sc.close();

    // firstName = "Ajeng";
    // lastName = "Septian";

    System.out.println();
    System.out.println(firstName + " " + lastName);
    System.out.println("Lahir di " + birthPlace);
    System.out.println("Tahun lahir " + birthYear);
    System.out.println("Suka bahasa pemrograman " + favLang);
  }
}
