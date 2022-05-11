import java.util.ArrayList;
import java.util.ListIterator;
public class App19 {
    public static void main(String[] args){
        ArrayList<Character> ar = new ArrayList<>();

        ar.add('a');
        ar.add('e');
        ar.add('b');
        ar.add('c');

        ListIterator<Character> listIterator = ar.listIterator();

        System.out.println("các phần tử có trong arListChar là: ");
        while (listIterator.hasNext()){
            System.out.print(listIterator.next() + "\t");
        }
        }
}
