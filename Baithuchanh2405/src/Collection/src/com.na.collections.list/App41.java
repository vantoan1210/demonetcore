import java.util.LinkedList;
import java.util.Scanner;


public class App41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LinkedList<String> l = new LinkedList<>();

        l.add("thang 1");
        l.add("thang 2");
        l.add("thang 3");
        l.add("thang 4");
        l.add("thang 5");
        l.add("thang 6");
        l.add("thang 7");
        l.add("thang 8");
        l.add("thang 9");
        l.add("thang 10");
        l.add("thang 11");
        l.add("thang 12");

        System.out.println("Nhap vao chi so cua phan tu can lay: ");
        int index = scanner.nextInt();
        scanner.close();
        if ((index <0 ) || (index >(l.size()-1))) {
            System.out.println("Chi so can lay phai lon hon 0 va nho hon " + (l.size()-1));
        }else {
            String node = l.get(index);
            System.out.println("phan tu co chi so = " + index +" trong linkedlist la " + node); 
        }

        String firstNode = l.getFirst();

        String lastNode = l.getLast();

        System.out.println("phan tu dau tien trong danh sach la " + firstNode +"; phan tu cuoi cung trong danh sach la " +lastNode);
    }
}
