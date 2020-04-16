public class Main {

    public static void main (String[] args) throws Exception {

        Thread t1 = new ThreadJava();
        t1.start();

        t1.join();
//----------------------------------------------------------------------------------------------
        Thread t2 = new ThreadHello("Hello, world", 2000);
        Thread t3 = new ThreadHello("Peace in the peace", 3000);
        t2.start();
        t3.start();
        t2.join();
        t3.join();

        System.out.println("My name is Viktor");
//--------------------------------------------------------------------------------------------

        Runnable r4 = new SyncThread4();
        Thread t4 = new Thread(r4);
        Runnable r5 = new SyncThread5();
        Thread t5 = new Thread(r5);
        Runnable r6 = new SyncThread6();
        Thread t6 = new Thread(r6);
        t4.start();
        t5.start();
        t6.start();
    }
}
