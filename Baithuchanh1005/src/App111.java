import java.util.LinkedList;
import java.util.Scanner;
public class App111 {
  public static void main(String[] args) {
    int n, node, sum = 0, count = 0;
    float tbCongSoChan;
    Scanner sc = new Scanner(System.in);
    LinkedList<Integer> linkedInteger = new LinkedList<>();
    System.out.println("Nhap so phan tu cua list:");
    n = sc.nextInt();

    for(int i=0; i < n; i++) {
      System.out.println("Nhap phan tu thu " +i + ":");
      node = sc.nextInt();
      linkedInteger.add(node);
    }
    for (int i = 0; i < n; i++) {
      if (linkedInteger.get(i) % 2 == 0) {
        sum += linkedInteger.get(i);
        count++;
      }
    }
    tbCongSoChan = sum/count;
    System.out.println("Trung binh cong cac so chan trong list: " +tbCongSoChan);
    sc.close();
  }
}