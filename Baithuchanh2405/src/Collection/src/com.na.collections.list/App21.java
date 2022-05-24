import java.util.ArrayList;

public class App21 {
    public static void main(String[] args) {
        ArrayList<String> animal = new ArrayList<>();

        animal.add("dog");
        animal.add("fox");
        animal.add("panther");
        animal.remove("tiger");
        animal.add("turtle");
        animal.add("crocodile");
        animal.add("bear");

        System.out.println(animal.get(4));
        System.out.println(animal.contains("snake"));
        System.out.println(animal.size());
        System.out.println(animal);

    }

}
