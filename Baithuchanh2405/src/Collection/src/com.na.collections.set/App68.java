package COLLECTIONS.collectionSet;
import java.util.TreeSet;
// import java.util.Set;
import java.util.Scanner;

public class App68 {
  public static void main (String[] args) {
    int number;
    TreeSet<Integer> treeInteger = new TreeSet<>();
    Scanner scanner = new Scanner(System.in);
    treeInteger.add(0);
    treeInteger.add(3);
    treeInteger.add(1);
    treeInteger.add(4);
    treeInteger.add(2);
    treeInteger.add(8);
    treeInteger.remove(0);
    System.out.println("Cac phan tu trong treeInteger");
    System.out.println(treeInteger);
    System.out.println("Nhap cac phan tu can them");

    number = scanner.nextInt();
    if(!treeInteger.contains(number)) {
      treeInteger.add(number);
      System.out.println("Them thanh cong");
      System.out.println("Cac phan tu trong treeInteger sau khi them: ");
      System.out.println(treeInteger);

    } else {
      System.out.println("Phan tu " +number+ "da ton tai!" );
      scanner.close();
    }

  }
}
