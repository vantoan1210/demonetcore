import java.util.HashSet;
import java.util.Scanner;
public class App54 {
    public static void main(String[] args){
        int number;
        HashSet<Integer> ha = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        ha.add(0);
        ha.add(3);
        ha.add(1);
        ha.add(4);
        ha.add(2);
        ha.add(8);

        System.out.println("Các phần tử trong hashSetinteger:");
        System.out.println(ha);
        System.out.println("nhap phan tu can them");
        number = sc.nextInt();
        if(!ha.contains(number)){
            ha.add(number);
            System.out.println("Them thanh cong!");
            System.out.println("cac phan tu trong hashSetInteger sau khi them: ");
            System.out.println(ha);

        } else
        {
        System.out.println("phan tu " + number + "da ton tai!");
        }
        sc.close();
    }
}
