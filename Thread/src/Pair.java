/**
 * 泛型就是类型参数化，处理的数据类型不固定的，而是可以作为参数传入
 * 更好的安全性和更好的可读性
 * <p>
 * <p>
 * <p>
 * <p>
 * 容器类
 *
 * @param <T>
 */


public class Pair<T> {
    T first;
    T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }


    public static void main(String[] args) {
        Pair<Integer> minmax = new Pair<>(1, 1000);
        Integer min = minmax.getFirst();
        Integer max = minmax.getSecond();


    }
}


//public interface Comparable<T> {
//    public int compareTo(T o);
//}
