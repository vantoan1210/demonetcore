
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class App106 {
    public static void main(String[] args){
        TreeMap<Integer,Character> treemap = new TreeMap<>();

        treemap.put(6, 'A');
        treemap.put(5, 'B');
        treemap.put(1, 'C');
        treemap.put(2, 'D');
        treemap.put(8, 'E');


        Set<Map.Entry<Integer, Character>> setTreeMap = treemap.entrySet();

        System.out.println(" cac entry co reong setTreeMap la: ");
        System.out.println(setTreeMap);
    }
}
