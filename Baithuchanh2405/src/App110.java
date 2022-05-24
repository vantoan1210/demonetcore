import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class App110 {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>(); 
    Scanner scanner = new Scanner(System.in);
    int number;
    System.out.println("Nhap so phan tu cua arrayList: ");
    int n = scanner.nextInt();
    for (int i = 0; i<n; i++) {
      System.out.println("Nhap phan tu thu " +i + ":");
      number = scanner.nextInt();
      arrayList.add(number);
    }
    int max = arrayList.get(0);

    for(int i = 1; i < arrayList.size(); i++) {
      if(arrayList.get(i).compareTo(max)  > 0) {
        max = arrayList.get(i);
      }
    }
    System.out.println("Nhap phan tu can xoa: ");
    number = scanner.nextInt();
    for(int i = 0; i < arrayList.size(); i++) {
      if(arrayList.get(i) == number) {
        arrayList.remove(number);
      }
    }
    System.out.println("arrayList sau khi xoa:");
    System.out.println(arrayList);

    arrayList.sort(Comparator.naturalOrder());
    System.out.println("arrayList sau khi sap xep:");
    System.out.println(arrayList);
    scanner.close();
    }
  }