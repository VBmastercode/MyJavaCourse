import static java.lang.Thread.sleep;

public class SyncThread5 implements Runnable {

    public void run() {
        synchronized(Main.class) {
            for (int i = 0; i < 5; i++) {
                try { sleep(500); } catch (InterruptedException e) {}
                System.out.println("Thread5 running!");
            }
        }
    }
}
