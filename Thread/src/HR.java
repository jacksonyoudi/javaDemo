public class HR implements Runnable {
    @Override
    public void run() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Thread hl = new Thread(new HR());
        System.out.println(hl.getState());
        hl.start();
        System.out.println(hl.getState());
        System.out.println(hl.isAlive());
        System.out.println(hl.isDaemon());
//        hl.join();
        hl.stop();
    }
}
