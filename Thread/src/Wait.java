public class Wait extends Thread {
    private volatile boolean fire = false;

    @Override
    public void run() {
        try {
            synchronized (this) {
                while (!fire) {
                    wait();
                }
                System.out.println("fired");
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public synchronized  void fire() {
        this.fire = true;
        notify();
    }


    public static void main(String[] args) throws InterruptedException {
        Wait wait = new Wait();
        wait.start();
        Thread.sleep(1000);
        System.out.println("fire");
        wait.fire();

    }
}
