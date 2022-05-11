package Slide79;

import Configs.Configss;

public class NhanVienFullTime extends NhanVien {

    public NhanVienFullTime(String ten, int ngayLamThem) {
        super(ten, ngayLamThem);
    }

    @Override
    public String loaiNhanVien() {
        return "Nhan vien toan thoi gian";
    }
    public void tinhLuong() {
        luong = Configss.LUONG_LAM_THEM_MOI_NGAY * this.ngayLamThem;
    }
}