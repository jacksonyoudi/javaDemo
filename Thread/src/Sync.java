import java.util.Collections;

public class Sync {
    private int count;

    public synchronized void incr() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}


class CounterThread extends Thread {
    Sync counter;

    public CounterThread(Sync counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.incr();
        }
    }
}


class Switcher {
    private volatile boolean on;

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public static void main(String[] args) {
    }

}

