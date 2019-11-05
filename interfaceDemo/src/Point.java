public class Point implements MyComparable {

    @Override
    public int compareTo(Object other) {

        return 1;
    }

    public static void main(String[] args) {
        Integer i = new Integer(20000);
        Integer.reverseBytes(i);
        Integer.reverse(i);


    }


}


