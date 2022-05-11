package main;

import Slide72.SinhVien;

public class App72 {
    
    public static void main(String[] args) {
        SinhVien sinhVien1 = new SinhVien();
        SinhVien sinhVien2 = new SinhVien();

        sinhVien1.setTen("");
        sinhVien1.setTuoi(23);

        sinhVien2.setTen("Peter");
        sinhVien2.setTuoi(17);

        System.out.println("Sinh viên có 1 tên:" + sinhVien1.getTen() + ", tuổi:" + sinhVien1.getTuoi());
        System.out.println("Sinh viên có 2 tên:" + sinhVien2.getTen() + ", tuổi:" + sinhVien2.getTuoi());
    }
}
