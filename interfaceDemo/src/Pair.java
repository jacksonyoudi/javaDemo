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
        Pair<Integer> minmax = new Pair<Integer>(1, 100);
        System.out.println(minmax.getFirst());
        System.out.println(minmax.getSecond());
    }
}


class Pa<U, V> {
    U first;
    V second;

    public Pa(U first, V second) {
        this.first = first;
        this.second = second;
    }

    public U getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
}
