import java.util.Scanner;
public class App10 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so: ");
        int n=sc.nextInt();
        int dem=0;
        while(n>0)
        {
            dem++;
            n=n/10;
        }

        System.out.println("so vua nhap co "+dem+" chu so");
        sc.close();
    }
}