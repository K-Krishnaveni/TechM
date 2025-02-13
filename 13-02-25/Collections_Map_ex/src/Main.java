import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");
        System.out.println("Initial HashMap: " + hm);

        hm.put(2, "For");
        System.out.println("Updated Map: " + hm);

        hm.remove(1);
        System.out.println("Mappings after removal: " + hm);

        System.out.println("Map traversal:");
        for (Map.Entry<Integer, String> e : hm.entrySet()) {
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
        }
    }
}
