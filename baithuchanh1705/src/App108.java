import java.util.TreeMap;
import java.util.Set;
import java.util.Map;

public class App108 {
    public static void main(String[] args){
        TreeMap<Integer,Double> tr = new TreeMap<>();
        tr.put(1,9d);
        tr.put(4,10.1d);
        tr.put(2,7.2d);
        tr.put(8,20.28d);
        System.out.println("cac phan tu co trong treeMap: ");
        Set<Map.Entry<Integer,Double>> setTreeMap = tr.entrySet();
        System.out.println(setTreeMap);

        tr.replace(4,20.11d);
        tr.replace(2, 7.2d, 7.7d);
        System.out.println("cac phan tu co trong treeMap sau khi thay the: ");
        setTreeMap = tr.entrySet();
        System.out.println(setTreeMap);
    }    
}
