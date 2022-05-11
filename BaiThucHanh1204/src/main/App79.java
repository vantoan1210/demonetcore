package main;

import Slide79.NhanVienPartTime;
import Slide79.NhanVienFullTime;
import Configs.Configss;

public class App79 {
    public static void main(String[] args) {
        // Công ty có 3 nhân viên toàn thời gian, trong đó có 1 sếp, sếp không làm thêm ngày nào
        NhanVienFullTime sep = new NhanVienFullTime("Trần Văn Sếp", 0);
        sep.setLoaiChucVu(Configss.NHAN_VIEN_SEP);
        NhanVienFullTime linh1 = new NhanVienFullTime("Nguyễn Văn Lính", 0); // Không làm thêm ngày nào
        linh1.setLoaiChucVu(Configss.NHAN_VIEN_LINH);
        NhanVienFullTime linh2 = new NhanVienFullTime("Lê Thị Lính", 3); // Làm thêm 3 ngày
        linh1.setLoaiChucVu(Configss.NHAN_VIEN_LINH);
        NhanVienPartTime thoiVu = new NhanVienPartTime("Phan Thị Thời Vụ", 240); // Cô ấy siêng làm lắm
        // Tính lương cho nhân viên
        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        thoiVu.tinhLuong();
        // In thông tin nhân viên
        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        thoiVu.xuatThongTin();
    }
}