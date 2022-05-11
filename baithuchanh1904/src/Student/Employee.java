package Student;
import java.util.Scanner;
    public class Employee extends Person {
        private double salary;
        private double rate;
        public Employee(){ 

        }
        public Employee(String name,int age, String address,double salary, double rate){
            this.salary = salary;
            this.rate = rate;
        }
        public void nhaptienluong(){
            System.out.println("hien thi tien luong ");
            Scanner sc = new Scanner(System.in);
            salary = sc.nextFloat();
            sc.close();
        }
        public void xuat(){
            System.out.println("so xuat tien ");
            Scanner sc = new Scanner(System.in);
            rate = sc.nextFloat();
            sc.close();
        }
    }