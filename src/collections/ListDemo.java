package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {
    // INSTANCE OBJECT
    List<String> makanan = new ArrayList<>();
    String[] arrMinuman = { "air putih", "es teh manis" };
    List<String> minuman = new ArrayList<>(Arrays.asList(arrMinuman));
    List<String> menu = new ArrayList<>();

    // ADD DATA TO LIST
    makanan.add("Bakso");
    makanan.add("Mie Ayam");
    makanan.add("Bakso");

    System.out.println("makanan index ke 2 " + makanan.get(2));

    makanan.remove(2);

    menu.addAll(makanan);
    menu.addAll(minuman);

    // PRINT
    System.out.println("makanan " + makanan);
    System.out.println("minuman " + minuman);
    System.out.println("menu " + menu);
  }
}
