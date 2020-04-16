import static java.lang.Thread.sleep;

public class SyncThread6 implements Runnable {

    public void run() {
        synchronized(Main.class) {
            for (int i = 0; i < 5; i++) {
                try { sleep(500); } catch (InterruptedException e) {}
                System.out.println("Thread6 running!");
            }
        }
    }
}

