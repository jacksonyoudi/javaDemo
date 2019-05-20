import java.util.Arrays;
import java.util.Queue;

public class PriorityQueue {

    public static void main(String[] args) {
        Queue<Integer> pd = new java.util.PriorityQueue<Integer>();
        pd.offer(10);
        pd.add(22);
        pd.addAll(Arrays.asList(new Integer[]{
                11, 23, 34, 2, 7
        }));

        while (pd.peek() != null) {
            System.out.println(pd.poll());
        }
    }
}
