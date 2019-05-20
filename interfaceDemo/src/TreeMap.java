import java.util.Comparator;
import java.util.Map;


public class TreeMap {
    public static void main(String[] args) {
        Map<String, String> map = new java.util.TreeMap<String, String>(
                new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o2.compareTo(o1);
                    }
                }
        );

        map.put("a", "abstract");
        map.put("c", "call");
        map.put("b", "basic");
        map.put("T", "tree");

        for (Map.Entry<String, String> kv : map.entrySet()) {
            System.out.println(kv.getKey() + "=" + kv.getValue());
        }
    }
}

