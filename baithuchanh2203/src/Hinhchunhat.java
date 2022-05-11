import java.util.Scanner;
public class Hinhchunhat {
 public static void main(String[] args){
        Hinhchunhat hcn = new Hinhchunhat();
        hcn.nhapkichthuoc();
        hcn.tinhdientich();
        hcn.tinhchuvi();
        hcn.indientich();
        hcn.inchuvi();
    }
        float cr;
        float cd;
        float cv;
        float dt;
        Scanner scanner = new Scanner(System.in);

        public void nhapkichthuoc(){
            System.out.println("nhap chieu dai: ");
            cd = scanner.nextFloat();
            System.out.println("nhap chieu rong: ");
            cr = scanner.nextFloat();
        }
        void tinhchuvi(){
            cv = (cr + cd) * 2;
        }
        void tinhdientich(){
            dt =cr * cd;
        }
        void inchuvi(){
            System.out.printf("chu vi hinh chu nhat: " + cv);
        }
        void indientich(){
        System.out.println("dien tich hinh chu nhat: " + dt);
        }
    }
