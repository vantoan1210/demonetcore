import java.util.Scanner;
public class App5
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen= ");
        int n = scanner.nextInt();

        int check = find_perfect_num(n);
     
        if( check == 1 ) System.out.println(n + " la so hoan hao" ) ;
        else System.out.println(n+ " khong phai la so hoan hao" ) ;
        scanner.close();
    }
    private static int find_perfect_num(int n){
        // flag = 1 => số hoàn hảo
        // flag = 0 => không phải số hoàn hảo

        int flag = 0, total=0;
        
        //Tìm tổng ước số   
        for (int i=1;i<n; i++){
             if (n % i == 0) total+=i;//Nếu là ước số thì cộng vào tổng
        }
        //So sánh tổng ước số với số đã cho để tìm ra số hoàn hảo
        if (total == n & n!=0) flag = 1;

        return flag;
    }
 
}

