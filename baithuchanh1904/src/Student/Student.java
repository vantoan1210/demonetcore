package Student;
import java.util.Scanner;

public class Student extends Person{

    public String dob;
    public String gender;

        public Student( String masinhvien, String ten, String ngaysinh, String gioitinh, String diachi){
            this.dob=ngaysinh;
            this.PersonID=masinhvien;
            this.PersonName=ten;
            this.Address=diachi;
            this.gender=gioitinh;
        }
        public Student(){}
        public void nhapTen(){
            System.out.println("so xuat tien ");
            Scanner sc = new Scanner(System.in);

            sc.close();
        }
        public void nhapMSSV(){
            System.out.println("so xuat tien ");
            Scanner sc = new Scanner(System.in);
            
            sc.close();
        }
}