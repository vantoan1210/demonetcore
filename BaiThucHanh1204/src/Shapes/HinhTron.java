package Shapes;
import java.util.Scanner;

public class HinhTron extends HinhHoc {
    
    public float banKinh;

    // Constructor
    public HinhTron() {
        ten = "Hình Tròn";
    }
    public void nhapBanKinh() {
        System.out.println("Bán Kính + ");
        try (Scanner scanner = new Scanner(System.in)) {
            banKinh = scanner.nextFloat();
        }
    }
    public void tinhChuVi() {
        chuVi = 2 * PI * banKinh;
    }
    public void tinhDienTich() {
        dienTich = PI * banKinh * banKinh;
    }
	public void xuatTen() {
	}
    public void inChuVi() {
    }
    
}