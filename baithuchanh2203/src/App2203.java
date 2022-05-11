public class App2203 {
    private static Object sv;

    public static void main(String[] args) throws Exception {
        System.out.println(" bai1: HinhChuNhat ");
        Hinhchunhat hcn = new Hinhchunhat();
        hcn.nhapkichthuoc();
        hcn.tinhdientich();
        hcn.tinhchuvi();
        hcn.indientich();
        hcn.inchuvi();

        System.out.println(" bai2: Person ");
        Person ps = new Person();
        ps.nhapPersonID();
        ps.nhapPersonName();
        ps.nhapGender();
        ps.nhapAddress();
        ps.inThongTin();

        System.out.println(" bai3:Phuongtrinhbac2 ");
        Phuongtrinhbachai pt = new Phuongtrinhbachai();
        pt.nhapsolieu();
        pt.tinhdelta();
        pt.indelta();
        pt.giaiptb2();

        System.out.println(" bai4: Sinh vien ");
        SinhVien sv = new SinhVien();
        sv.nhapdulieu();
        sv.inDiaChi();
        sv.inHoTen();
        sv.inMaSinhVien();
        sv.inNgaySinh();
        sv.ingioiTinh();
  
    }
}