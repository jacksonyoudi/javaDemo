public class HT extends Thread {
    @Override
    public void run() {
        System.out.println("hello");
        System.out.println(this.getName());
        System.out.println(this.getId());
    }



    public static void main(String[] args) {
        Thread ht = new HT();
        ht.run();
    }
}
