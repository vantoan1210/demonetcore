import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class App86 {
    public static void main(String[] args) {
        HashMap<String, String> ha = new HashMap<>();
        ha.put("CSLT","co so lap trinh");
        ha.put("C++","C++");
        ha.put("C#","C Sharp");
        ha.put("PHP","PHP");
        ha.put("Java", "java");

        Set<Map.Entry<String, String>> sh = ha.entrySet();

        System.out.println("cac entry co trong setHasMap: ");
        System.out.println(sh);
    } 
}
