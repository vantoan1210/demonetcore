package Slide77;

import java.util.Scanner;

public class HinhTron {
    protected float banKinh;
    private Scanner scanner;

    public HinhTron() {
        super();
        scanner = new Scanner(System.in);
    }

    public void nhapBanKinh() {
        System.out.println("Ban dung don vi tinh nao: ");
        System.out.println("\t1 - Centimet");
        System.out.println("\t2 - inch");
        Configs.donVi = scanner.nextInt();

        System.out.println("Hay nhap vao ban kinh Hinh Tron");
        banKinh = scanner.nextFloat();
    }

    public void inThongTin() {
        if (Configs.donVi == Configs.DON_VI_CM) {
            System.out.println("Hinh tron co ban kinh " + banKinh + " cm");
            System.out.println("Tuong Duong " + Configs.ChuyenCentimetSangInch(banKinh) + "inch");
        } else {
            System.out.println("Hinh tron co ban kinh " + banKinh + " inch");
            System.out.println("Tuong duong " + Configs.ChuyenInchSangCentimet(banKinh) + " cm");
        }
    }
}