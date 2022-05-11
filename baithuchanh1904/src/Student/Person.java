package Student;
import java.util.Scanner;
public class Person {
    public String PersonID;
    public String PersonName;
    public String Address;
    Scanner sc = new Scanner(System.in);

    public Person(){}

    public void nhapPersonID(){
        System.out.println("Hay nhap PersonID ");
        Scanner sc = new Scanner(System.in);
        PersonID = sc.nextLine();
        sc.close();
    }

    public void nhapPersonName() {
       System.out.println("nhap ten:");
        Scanner sc = new Scanner(System.in);
        PersonName = sc.nextLine();
        sc.close();
    }
    
    public void nhapAddress() {
        System.out.println("Hay nhap Address ");
        Scanner sc = new Scanner(System.in);
        Address = sc.nextLine();
        sc.close();
    }
}
