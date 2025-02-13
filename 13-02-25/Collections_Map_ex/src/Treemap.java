
import java.util.TreeMap;
import java.util.Map;
public class Treemap {
    public static void main(String args[]){
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        tm.put(9,120);
        tm.put(2,130);
        tm.put(8,140);
        tm.put(4,150);
        System.out.println("TreeMAp Elements : " + tm);
        tm.replace(2,125);
        System.out.println("Updated Map"+tm);
        tm.remove(4);
        System.out.println("Updated map after removing "+tm);
        for(Map.Entry<Integer,Integer> ele: tm.entrySet()){
            System.out.println("Key: " + ele.getKey() + " Value: " + ele.getValue());
        }
    }

}
