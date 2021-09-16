package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
  public static void main(String[] args) {
    Map<String, Integer> nilai = new HashMap<>();

    nilai.put("Putri", 100);
    nilai.put("Andi", 100);
    nilai.put("Femil", 90);

    System.out.println(nilai);

    for (String key : nilai.keySet()) {
      System.out.println("Nama : " + key + " nilainya " + nilai.get(key));
    }
  }
}

// menu :
// 1. informasi biodata (firstName, lastName, tempatLahir, tahunLahir,
// bahasaPemrogramanFav)
// 2. cetak pola
// ketika user memilih opsi 1, maka yg ditampilkan input biodata dan resumenya
// opsi 2, yg ditampilkan input n nya dan hasil polanya