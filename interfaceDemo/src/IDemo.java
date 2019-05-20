import java.util.Arrays;
import java.util.Random;

public interface IDemo {
    void hello();

    public static void test() {
        System.out.println("hello");
    }

    default void hi() {
        System.out.println("hi");
    }

    public static void main(String[] args) {
        String name = "youdi";

        String hello = new String("xxii");
        System.out.println(hello.hashCode());

        StringBuilder sb = new StringBuilder();
        sb.append("1111");

        int[] arr = {9, 8, 3, 4};
        String aStr = Arrays.toString(arr);
        Arrays.sort(arr); // 没有返回值

        String[] ars = {"a", "A", "B"};
        Arrays.sort(ars);

        Random rd = new Random();


    }
}
