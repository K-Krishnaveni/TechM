
import java.util.Hashtable;
import java.util.Map;
public class HashTableEx {
    public static void main(String args[]){
        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(1, "one");
        ht.put(2, "two");
        ht.put(3, "three");
        System.out.println("Initial HashMap: " + ht);

        ht.put(2, "For");
        System.out.println("Updated Map: " + ht);

        ht.remove(1);
        System.out.println("Mappings after removal: " + ht);

        System.out.println("Map traversal:");
        for (Map.Entry<Integer, String> e : ht.entrySet()) {
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
        }
    }
}
