import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App88 {
    public static void main(String[] args) {
        HashMap<String, String> hs = new HashMap<>();
        hs.put("QNg","Quang ngai");
        hs.put("QN", "Quang Nam");
        hs.put("QN","Quang Ninh");
        hs.put("HCM","thanh pho ho chi minh");

        System.out.println("danh sach cac thanh pho trong hashMapCity:");
        Set<Map.Entry<String, String>> sc = hs.entrySet();
        System.out.println(sc);

        System.out.println("QNg: " + hs.get("QNg"));
        System.out.println("NT: " + hs.get("NT"));

        if (hs.containsValue("thanh pho ho chi minh")){
            System.out.println("co thanh pho ho chi minh trong hashMapCity");
        }
    }    
}
