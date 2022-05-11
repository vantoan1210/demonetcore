package Shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;
    protected String ten;
    private float chuVi;
    private float dientich;

    //constructor
    public HinhChuNhat() {
        ten = "Hình chữ nhật";
    }
    public void nhapChieuDai() {
        System.out.println("Chiều dài = ");
        try (Scanner scanner = new Scanner(System.in)) {
            dai =  scanner.nextFloat();
        }
    }
    public void nhapChieuRong() {
        System.out.println("Chiều rộng = ");
        try (Scanner scanner = new Scanner(System.in)) {
            rong =  scanner.nextFloat();
        }
    }
    public void tinhChuVi() {
        chuVi = 2 * (dai + rong);
    }
    public void tinhDienTich() {
        dientich = dai * rong;
    }
	public void xuatTen() {
	}

}
