import java.util.LinkedList;

public class App38 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("JAVA");

        System.out.println("Vi du su dung phuong thuc addAll() ");

        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.print("listA: ");
        showList(listA);

        System.out.println("Vi du su dung phuong thuc retainAll() ");

        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Java");

        listA.retainAll(listB);
        System.out.print("list");
        showList(listA);

        System.out.println("Vi du su dung phuong thuc removeAll() ");

        list.removeAll(listB);
        System.out.print("list: ");
        showList (list);
    }
    public static void showList(LinkedList<String> list) {
        for (String obj : list) {
            System.out.print("" + obj +", ");
        }
        System.out.println();
    }
}
