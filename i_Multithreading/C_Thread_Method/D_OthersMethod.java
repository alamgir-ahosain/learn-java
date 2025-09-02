package i_Multithreading.C_Thread_Method;

public class D_OthersMethod {
    public static void main(String[] args) throws InterruptedException {
        Task t1 = new Task('*');
        Task t2 = new Task('$');

        System.out.println("Starting Thread ...");

        // start thread
        t1.start();
        t2.start();

        // isAlive()
        System.out.println("\nT1 is alive: " + t1.isAlive());

        // setPriority
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t2.getName() + " priority: " + t2.getPriority());

        // yield() ->give chance to another thread
        Thread.yield();

        // join-> wait for thread to finish
        t1.join(); // wait main until t1 is finish
        t2.join(); // wait main until t2 is finish
        System.out.println("Both thread are finish");

        // interrupt
        Task t3 = new Task('&');
        t3.start();
        t3.interrupt(); // interrupt t3 while runnihg

        // SetDaemon
        Thread daemon = new Thread(() -> {
            while (true) {
                System.out.println("Daemon is working..");
                try {
                    Thread.sleep(300);

                } catch (InterruptedException e) {
                    System.out.println(e);
                    break;
                }
            }
        });
        daemon.setDaemon(true);
        daemon.start();

        System.out.printf("\n %s  is Finish \n", Thread.currentThread().getName());
    }
}
