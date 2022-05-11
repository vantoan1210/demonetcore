import java.util.Scanner;
import java.util.LinkedList;

public class App41 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> L = new LinkedList<>();
        L.add("thang 1");
        L.add("thang 2");
        L.add("thang 3");
        L.add("thang 4");
        L.add("thang 5");
        L.add("thang 6");
        L.add("thang 7");
        L.add("thang 8");
        L.add("thang 9");
        L.add("thang 10");
        L.add("thang 11");
        L.add("thang 12");
        
        System.out.println("Nhap vao chi so cua phan tu can lay: ");
        int index = scanner.nextInt();
        scanner.close();
        if ((index <0 ) || (index >(L.size()-1))) {
            System.out.println("Chi so can lay phai lon hon 0 va nho hon " + (L.size()-1));
        }else {
            String node = L.get(index);
            System.out.println("phan tu co chi so = " + index +" trong linkedlist la " + node); 
        }

        String firstNode = L.getFirst();

        String lastNode = L.getLast();

        System.out.println("phan tu dau tien trong danh sach la " + firstNode +"; phan tu cuoi cung trong danh sach la " +lastNode);
        }
}
