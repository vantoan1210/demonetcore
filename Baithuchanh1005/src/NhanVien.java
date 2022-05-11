import java.util.Scanner;

public class NhanVien {
    public String MaNhanVien;
    public String HoTenNhanVien;
    public String DiaChi;
    Scanner scanner= new Scanner(System.in);

    public NhanVien(String MaNhanVien, String HoTenNhanVien, String DiaChi ) {
        this.MaNhanVien = MaNhanVien;
        this.HoTenNhanVien = HoTenNhanVien;
        this.DiaChi = DiaChi;
    }

    public void NhapThongTin() {
        System.out.println("Ma nhan vien la: ");
        MaNhanVien = scanner.nextLine();

        System.out.println("Ho va ten nhan vien la: ");
        HoTenNhanVien = scanner.nextLine();

        System.out.println("Dia chi la: ");
        DiaChi = scanner.nextLine();
    }
}