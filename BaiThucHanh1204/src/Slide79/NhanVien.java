package Slide79;

public class NhanVien {
    protected String ten;
    protected long luong;
    protected long ngayLamThem;
    protected int loaiChucVu;

    public NhanVien() {

    }
    

    public NhanVien(String ten, int ngayLamThem) {
        this.ten = ten;
        this.ngayLamThem = ngayLamThem;
    }
    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }
    protected String loaiNhanVien() {
        return"";
    }
    public void xuatThongTin(){
        System.out.println("==== nhan vien: " + ten + " ====");
        System.out.println("- loai nhan vien: " + loaiNhanVien());
        System.out.println("- Luong: " +luong + " VND");
    }
    
}