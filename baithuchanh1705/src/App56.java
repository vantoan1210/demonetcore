import java.util.HashSet;
import java.util.Scanner;
public class App56 {
    public static void main(String[] args){
        String name;
        HashSet<String> ha = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        ha.add("wilson");
        ha.add("Nike");
        ha.add("volvo");
        ha.add("Kia");
        ha.add("Lenovo");
        ha.add("Lenovo");
        ha.remove("Kia");
        //hashSetInteger.Set
        
        System.out.println("Các phần tử trong hashSetString:");
        System.out.println(ha);
        System.out.println("nhap phan tu can xoa");
        name = sc.nextLine();
        if(!ha.contains(name)){
            ha.remove(name);
            System.out.println("xoa thanh cong!");
            System.out.println("cac phan tu con lai trong hashSetInteger sau khi them: ");
            System.out.println(ha);

        } else
        {
        System.out.println("xoa khong thanh cong");
        }
        sc.close();
    }
}
