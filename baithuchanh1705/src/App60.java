import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
public class App60 {
    public static void main(String[] args){

        Set<String> li = new LinkedHashSet<String>();
        li.add("java");
        li.add("C++");
        li.add("java");
        li.add("PHP");

        for (String str :li) {
            System.out.println(str);
        }
    }
}
