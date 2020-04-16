public class ThreadJava extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            try { sleep(1000); } catch (InterruptedException e) {}
            System.out.println("I study Java");
        }
    }

}
