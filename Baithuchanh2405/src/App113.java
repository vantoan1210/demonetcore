import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class App113 {
  public static void main(String[] args) {
    HashSet<String> hashSet = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    String name;
    hashSet.add("Tao");
    hashSet.add("Thanh long");
    hashSet.add("Xoai");
    hashSet.add("Nhan");
    hashSet.add("Mit");
    hashSet.add("Buoi");

    System.out.println("Các phần tử có trong hashSet là: ");
    System.out.println(hashSet);

    System.out.println("Nhap mot loai trai cay bat ky:");
    name = sc.next();
    if(hashSet.contains(name)) {
      System.out.println("Tim thay ten trai cay vua nhap");
    } else {
      System.out.println("khong tim thay ten trai cay vua nhap");
    }
    hashSet.remove("Tao");
    System.out.println("Các phần tử con lai trong hashSet là: ");
    System.out.println(hashSet);

    List<String> listFruits = new ArrayList<>();
    listFruits.add("Apple");
    listFruits.add("Banana");
    listFruits.add("Mango");
    listFruits.add("Apple");

    hashSet.addAll(listFruits);
    System.out.println("Các phần tử có trong hashSetFruits sau khi thêm: ");
    Iterator<String> iterator = hashSet.iterator();
    while (iterator.hasNext()) {
        System.out.print(iterator.next() + "\t");
    }

    hashSet.removeAll(listFruits);
    System.out.println("\nCác phần tử có trong hashSetFruits sau khi xóa: " + hashSet);
    sc.close();
  }
}