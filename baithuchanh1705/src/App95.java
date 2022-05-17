import java.util.LinkedHashMap;
import java.util.Set;
public class App95 {
    public static void main (String args[]){
        LinkedHashMap<Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>();

        linkedhashmap.put(1, "Java");
        linkedhashmap.put(3, "C++");
        linkedhashmap.put(2, "PHP");
        linkedhashmap.put(4,"Python");

        System.out.println("Before remove: ");
        show(linkedhashmap);

        linkedhashmap.remove(2);

        System.out.println("After remove: ");
        show(linkedhashmap);
    }

        public static void show(LinkedHashMap<Integer,String> linkedHashMap) {
            Set<Integer> keySet = linkedHashMap.keySet();
            for (Integer key : keySet) {
                System.out.println(key + " " + linkedHashMap.get(key));
            }
        }
}