import java.util.ArrayList;
import java.util.ListIterator;

public class App19 {
    public static void main(String[] args) {
    
        ArrayList<Character> a = new ArrayList<>();
        a.add('g');
        a.add('o');
        a.add('o');
        a.add('d');

        ListIterator<Character> listIterator = a.listIterator();

        System.out.println("cac phan tu trong arrlistchar la: ");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + "");
        }

    }
}
