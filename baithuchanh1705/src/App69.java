import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;
public class App69 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> tr = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        tr.add(0);
        tr.add(3);
        tr.add(1);
        tr.add(4);
        tr.add(2);
        tr.add(8);

        System.out.println("Cac phan tu trong treeSetInteger: ");
        System.out.println(tr);
        System.out.println("nhap phan tu can them: ");
        number = sc.nextInt();
        if(!tr.contains(number)){
            tr.add(number);
            System.out.println("Them thanh cong!");
            System.out.println("cac phan tu trong treeSetInteger sau khi them: ");
            System.out.println(tr);

        } else {
            System.out.println("phan tu " + number + "da ton tai");
        }
        sc.close();
    }
}
