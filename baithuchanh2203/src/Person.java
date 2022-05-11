import java.util.Scanner;

public class Person {
    String PersonID;
    String PersonName;
    Boolean Gender;
    String Address;
    Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        Person ps = new Person();
        ps.nhapPersonID();
        ps.nhapPersonName();
        ps.nhapGender();
        ps.nhapAddress();
        ps.inThongTin();

    }

    
    void nhapPersonID(){
        System.out.println("Hay nhap vao PersonID: ");
        PersonID = scanner.next();
    }
    void nhapPersonName(){
        System.out.println("Hay nhap vao PersonName: ");
        PersonName = scanner.next();
    }
    void nhapGender(){
        System.out.println("gioitinh? (Y(yes) | N(no))");
        String result = scanner.next();
        if (result.equals("Y") || result.equals("y")) Gender = true ;
        else Gender = false;
        
    }
    void nhapAddress(){
        System.out.println("Hay nhap vao Address: ");
        Address = scanner.next();
    }

    void inThongTin(){
        System.out.println("PersonID: " + PersonID);
        System.out.println("PersonName: " + PersonName);
        System.out.println("Gender: " + Gender);
        System.out.println("Address: " + Address);
    }
}