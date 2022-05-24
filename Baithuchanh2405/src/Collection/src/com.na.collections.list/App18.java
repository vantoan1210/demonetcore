import java.util.ArrayList;
import java.util.Iterator;

public class App18 {
    public static void main(String[] args) {
        ArrayList<Float> a = new ArrayList<>();

        a.add(0.1f);
        a.add(0.8f);
        a.add(5.2f);
        a.add(6.7f);

        Iterator<Float> iterator = a.iterator();

        System.out.println(" cac phan tu co trong arrlistFloat la: " );
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "  ");
        }
    }
}

