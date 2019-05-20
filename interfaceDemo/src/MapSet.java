import java.util.*;

public class MapSet {


    public static void main(String[] args) {
        Random rd = new Random();
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < 1000; i++) {
            int num = rd.nextInt(4);
            Integer count = countMap.get(num);
            if (count == null) {
                countMap.put(num, 1);
            } else {
                countMap.put(num, count + 1);
            }
        }

        for (Map.Entry<Integer, Integer> kv : countMap.entrySet()) {
            System.out.println(kv.getKey());
            System.out.println(kv.getValue());
        }


        Set<String> set = new HashSet<String>();
        set.add("hello");
        set.add("world");
        set.addAll(Arrays.asList(new String[]{"hello", "xiix"}));

        for (String s : set) {
            System.out.println(s + "\n");
        }
    }

}


class Spec {
    String size;
    String color;

    public Spec(String size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "[size=" + size + ",color=" + color + "]";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        Set<Spec> set = new HashSet<Spec>();
        set.add(new Spec("M", "red"));
        set.add(new Spec("M", "red"));

        System.out.println(set);
    }
}
