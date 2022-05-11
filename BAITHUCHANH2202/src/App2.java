import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khai báo biến
        double a, b, c;

        // Nhập dữ liệu
        System.out.print("Nhập vào cạnh thứ nhất: ");
        a = sc.nextDouble();
        System.out.print("Nhập vào cạnh thứ hai: ");
        b = sc.nextDouble();
        System.out.print("Nhập vào cạnh thứ ba: ");
        c = sc.nextDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a) &&
                (a > 0) && (b > 0) && (c > 0)) {
            if ((a == b) && (b == c)) {
                System.out.println("Tam giac deu!");
            } else if ((a == b) || (a == c) || (b == c)) {
                System.out.println("Tam giac can!");
            } else if ((a * a == b * b + c * c) ||
                    (b * b == a * a + c * c) ||
                    (c * c == a * a + b * b)) {
                System.out.println("Tam giac vuong!");
            } else if (((a * a + b * b == c * c) &&(a == b)) ||
                    ((a * a + c * c == b * b) && (a == c)) ||
                    ((b * b + c * c == a * a) && (b == c))) {
                System.out.println("Tam giac vuong can!");
            } else {
                System.out.println("Tam giac thuong!");
            }
        } else {
            System.out.println("3 cạnh của tam giác không thỏa mãn điều kiện lập thành tam giác!");
        }

        sc.close();
    }
}