package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
  public static void main(String[] args) {
    Set<String> nama = new HashSet<>();
    nama.add("Putri");
    nama.add("Aisyah");
    nama.add("Budi");
    nama.add("Putri");

    // convert to list
    List<String> listName = new ArrayList<>(nama);
    Collections.sort(listName);

    System.out.println(nama);
    System.out.println(listName);
    System.out.println(listName.get(1));
  }
}
