/**
 * 多线程的创建
 *  线程是一种对象
 */

class Compute implements Runnable {
    public void run() {
        for (int i = 0;i < 10 ; i++) {
            System.out.print(i);
        }
    }
}


class Compute1 implements Runnable {
    public void run() {
        for (int j = 0;j < 10 ; j++) {
            System.out.print("数字是：" + j);
        }
    }
}


public class threadDemo {
    public static void main(String[] args) {
        Compute c1 = new Compute();
        Compute1 c2 = new Compute1();
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();


    }
}
