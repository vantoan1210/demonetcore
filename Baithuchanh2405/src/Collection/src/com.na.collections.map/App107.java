import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class App108 {
    public static void main(String[] args) {
        TreeMap<Integer,Double> treemap = new TreeMap<>();
        treemap.put(1,9d);
        treemap.put(4,10.1d);
        treemap.put(2, 7.2d);
        treemap.put(8, 10.28d);

        System.out.println("cac phan tu trong treemap: ");
        Set<Map.Entry<Integer,Double>> setTreeMap = treemap.entrySet();
        System.out.println(setTreeMap);

        treemap.replace( 4, 20.11d);

        treemap.replace(2, 7.2d, 7.7d);

        System.out.println("cac phan tu co trong treemap sau khi thay the : ");
        setTreeMap = treemap.entrySet();
        System.out.println(setTreeMap);


    }
}
