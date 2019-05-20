import java.util.ArrayList;
import java.util.Iterator;

public class DynamicArray {

    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for (Integer a : integerArrayList) {
            System.out.println(a);
        }

        Iterator<Integer> it = integerArrayList.iterator();
        while (it.hasNext()) {
            if (it.next() <= 100) {
                // 通过迭代器进行删除
                it.remove();
            }
        }


    }

}
