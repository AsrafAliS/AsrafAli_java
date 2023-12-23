package Question2;

public class consumer implements Runnable {
    private Thread1 t;

    public consumer(Thread1 t) {
        this.t = t;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        while (true) {
            t.deserialize();
        }
    }
}
