import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class SetEx {
    public static void main(String args[]) {
        HashSet<Integer> hs = new HashSet<>();
        LinkedHashSet<String> ls = new LinkedHashSet<>();
        TreeSet<Float> ts = new TreeSet<>();
        setSample(hs);
        setSample(ls);
        setSample(ts);
    }
public static void setSample(HashSet<Integer> hs){
    hs.add(49);
    hs.add(7);
    hs.add(70);
    hs.add(3);
    hs.add(100);
    hs.add(378);
    hs.add(63);
    hs.add(20);
    System.out.println("HashSet");
    System.out.println("----------------------------------------------------------");
    System.out.println("HashSet Size: " + hs.size());
            System.out.println("Elements in HashSet: " + hs);
            hs.remove(70);
            System.out.println("After Removing "+hs);
            for (Integer element : hs)
                if (element % 7== 0)
                      System.out.println(" divisible by 7 are: " + element);
        }
        public static void setSample(LinkedHashSet<String> ls){

            ls.add("This is LinkedHashset");
            ls.add("hii");
            ls.add("Krish");
            ls.add("Java");
            ls.add("Programming");
            ls.add("Hashset");
            ls.add("Collections");
            ls.add("Bye");
            System.out.println("LinkedHashSet");
            System.out.println("----------------------------------------------------------");
            System.out.println("LinkedhashSet Size: " + ls.size());
            System.out.println("Elements in LinkedHashSet: " + ls);
            ls.remove(73);
            System.out.println("After removing :"+ ls);
            for (String ele : ls)
                if (ele.length()==5)
                    System.out.println("ele : " +ele);
        }
        public static void setSample(TreeSet<Float> ts){
            ts.add(20.5f);
            ts.add(43.2f);
            ts.add(15.0f);
            ts.add(11f);
            ts.add(0.3f);
            ts.add(190.4f);
            ts.add(19.9f);
            ts.add(3.4f);
            System.out.println("TreeSet");
            System.out.println("----------------------------------------------------------");
            System.out.println("TreeSet size : "+ts.size());
            System.out.println("Treeset removing element " + ts.remove(11f));
            for(Float num:ts)
                if (num > 20)
                    System.out.println("Elements that are greater than 20 are :" + num);
        }
    }