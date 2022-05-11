import java.util.Scanner;
public class baithuchanh1801 {
    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;
        String ketQua = "";
        Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap a : ");
            a = scanner.nextDouble();
            System.out.print("Nhap b: ");
            b = scanner.nextDouble();
            System.out.print("Nhap c: ");
            c = scanner.nextDouble();
            delta = b * b - 4 * a * c;
        if (delta < 0) {
            ketQua = "Phương trinh vo nghiem";
        } else if (delta == 0) {
            x1 = x2 = -b/ (2*a);
            System.out.println("Phương trinh co nghiem kep x1 = x2 = "+x1);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            ketQua = "Phương tring co 2 nghiem x1 = " + x1 + " và x2 = " + x2;
        }
        System.out.println(ketQua);
        scanner.close();
    }
}