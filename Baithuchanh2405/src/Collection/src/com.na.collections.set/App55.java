package COLLECTIONS.collectionSet;

import java.util.HashSet;
import java.util.Scanner;

public class App55 {
  public static void main (String[] args) {
    String name;
    HashSet<String> hashSet = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    hashSet.add("Wilson");
    hashSet.add("Nike");
    hashSet.add("Volvo");
    hashSet.add("Kia");
    hashSet.add("Lenovo");
    hashSet.add("Lenovo");

    System.out.println("Cac phan tu trong hashSet:");
    System.out.println(hashSet);
    System.out.println("Nhap phan tu can xoa");
    name = sc.next();

    if (hashSet.contains(name)) {
      hashSet.remove(name);
      System.out.println("Xoa thanh cong!");
      System.out.println("Cac phan tu con lai trong hashSet");
      System.out.println(hashSet);
    } else {
      System.out.println("xOA KHONG THANH CONG");
    }
    sc.close();
  }
}

