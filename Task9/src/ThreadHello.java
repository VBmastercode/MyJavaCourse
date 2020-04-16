public class ThreadHello extends Thread {

    private final String messg;
    private final int pause;

    public ThreadHello (String messg, int pause) {
        this.messg = messg;
        this.pause = pause;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try { sleep(pause); } catch (InterruptedException e) {}
            System.out.println(messg);
        }
    }

}
