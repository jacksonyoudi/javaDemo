import java.util.ArrayList;
import java.util.List;

public class SM {
    private static int shared = 0;

    private static void incrShared() {
        shared++;
    }

    static class CT extends Thread {
        List<String> list;

        public CT(List<String> list) {
            this.list = list;
        }

        @Override
        public void run() {
            incrShared();
            list.add(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Thread t1 = new CT(list);
        Thread t2 = new CT(list);
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        try {
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(shared);
        System.out.println(list);
    }
}
