import java.util.Map;
import java.util.LinkedHashMap;
public class LinkedHashmap_ex {
    public static void main(String args[]){
    LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
    lhm.put(1,"Krish");
    lhm.put(2,"Nivi");
    lhm.put(3,"Dharun");
    lhm.put(4,"Sanju");
    System.out.println("Initial HashMap: " + lhm);

        lhm.put(1, "veni");
        System.out.println("Updated Map: " +lhm);

        lhm.remove(1);
        System.out.println("Mappings after removal: " + lhm);

        System.out.println("Map traversal:");
        for (Map.Entry<Integer, String> e : lhm.entrySet()) {
        System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
    }
}
}