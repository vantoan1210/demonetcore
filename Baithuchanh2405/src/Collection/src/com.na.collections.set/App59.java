package COLLECTIONS.collectionSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class App59 {
  public static void main(String[] args) {
    Set<String> linkHasSet = new LinkedHashSet<>();
    linkHasSet.add("Java");
    linkHasSet.add("C++");
    linkHasSet.add("Java");
    linkHasSet.add("PHP");

    for(String str : linkHasSet) {
      System.out.println(str);
    }
  }
}
