package main;

import slide71.HinhTron;

public class App71 {
    
    public static void main(String[] args) {
        //khởi động đối tượng hinhtron từ lớp HinhTron
        HinhTron hinhTron = new HinhTron();

        //set bán kính cho hinhTron thong qua phương thức setter
        hinhTron.setBanKinh(10);

        //các tính toán khác
        float chuVi = hinhTron.tinhChuVi();
        float dienTich = hinhTron.tinhDienTich();
        System.out.println("Chu vi hình tròn: " + chuVi + "; Và Diện Tích: " + dienTich);
    }
}
