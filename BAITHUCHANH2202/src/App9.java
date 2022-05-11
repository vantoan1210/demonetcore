import java.util.Scanner;
public class App9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so: ");
        int n=sc.nextInt();
        int daoso=0;
        while(n>0)
        {
            daoso=daoso*10+(n%10);
            n=n/10;
        }
        System.out.println("so dao nguoc la: "+daoso);
        sc.close();
    }
}