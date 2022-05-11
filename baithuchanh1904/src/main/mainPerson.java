package main;

import Student.Person;
import Student.Student;
import Student.Employee;
import Student.Customer;
import Student.VipCustomer;
import Student.OfflineStudent;
import Student.OnlineStudent;
import Student.ParttimeEmployee;
import Student.FulltimeEmployee;

public class mainPerson
{
    public static void main(String[] args)  {
    //person
        Person ps1=new Person();
        ps1.nhapPersonID();
        ps1.nhapPersonName();
        ps1.nhapAddress();

    //khach hang
        Customer kh1=new Customer();
        kh1.nhapCustomerEmail();
        kh1.nhapCustomerName();
        VipCustomer kh2=new VipCustomer();
        kh2.hienThiThongTin();

    //nhan vien
        Employee nv= new Employee();
        nv.nhaptienluong();
        nv.xuat();

        FulltimeEmployee nv1=new FulltimeEmployee();
        nv1.loainhanvien();

        ParttimeEmployee nv2 = new ParttimeEmployee();
        nv2. loainhanvien();

    //sinh vien
        Student sv= new Student();
        sv.nhapTen();
        sv.nhapMSSV();

        OnlineStudent onl = new OnlineStudent();
        onl.trangthaiStudent();
        OfflineStudent off = new OfflineStudent();
        off.loaiStudent();
    }
}