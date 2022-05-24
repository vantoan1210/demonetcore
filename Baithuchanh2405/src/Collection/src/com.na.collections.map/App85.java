import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App85 {
     public static void main(String[] args){
         HashMap<String,String> hashmap = new HashMap<>();

         hashmap.put ("CSLT", "Co so lap trinh");
         hashmap.put("C++", "C++");
         hashmap.put ("c#"," C Sharp");
         hashmap.put("PHP","PHP");
        hashmap.put("Java","Java");


        Set<Map.Entry<String,String>> setHashMap = hashmap.entrySet();

        System.out.println("cac entry co trong sethashmap: ");
        System.out.println(setHashMap);
     }
}
