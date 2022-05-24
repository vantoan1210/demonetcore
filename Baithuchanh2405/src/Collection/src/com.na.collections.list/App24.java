import java.util.ArrayList;
import java.util.Scanner;

public class App24 {
    public static void main(String[] args) {
        ArrayList<Integer> arrint = new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        int number;

        System.out.println("nhap so phan tu cua arr: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("nhap phan tu thu " + i + ": ");
            number = scanner.nextInt();
            arrint.add(number);
            
        }
        scanner.close();
        int max = arrint.get(0);

        for (int i = 1; i < arrint.size();i++) {
            if (arrint.get(i).compareTo(max) > 0) {
                max = arrint.get(i);
            }
        }
        System.out.println("phan tu lon nhat trong arr = " + max);
    }
}
