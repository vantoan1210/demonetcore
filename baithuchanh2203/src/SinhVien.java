import java.util.Scanner;

public class SinhVien {
    public static void main(String[] args) throws Exception {
      SinhVien sv = new SinhVien();
      sv.nhapdulieu();
      sv.inDiaChi();
      sv.inHoTen();
      sv.inMaSinhVien();
      sv.inNgaySinh();
      sv.ingioiTinh();

    }

    String MaSinhVien;
    String HoTen;
    Boolean gioiTinh;
    String Diachi;
    String NgaySinh;
    Scanner scanner = new Scanner(System.in);

    void nhapdulieu(){
        System.out.println("Hay nhap Ma Sinh Vien ");
        MaSinhVien = scanner.nextLine();
        System.out.println("Hay nhap Ho Ten ");
        HoTen = scanner.nextLine();
        System.out.println("Hay nhap Dia chi  ");
        Diachi = scanner.nextLine();
        System.out.println("Hay nhap ngay sinh  ");
        NgaySinh = scanner.nextLine();

    }
    void inMaSinhVien() {
        System.out.println("Ma sinh vien cua ban la: " + MaSinhVien);
    }

    void inHoTen() {
        System.out.println("Ho ten cua ban la: " + HoTen);
    }
    void inDiaChi() {
        System.out.println("Dia chi cua ban la: " + Diachi);
    }

    void inNgaySinh() {
        System.out.println("Ngay sinh cua ban la: " + NgaySinh);
    }

    void ingioiTinh() {
        System.out.println("gioitinh? (Y(yes) | N(no))");
        String result = scanner.next();
        if (result.equals("Y") || result.equals("y")) gioiTinh = true ;
        else gioiTinh = false;
    }

    
}