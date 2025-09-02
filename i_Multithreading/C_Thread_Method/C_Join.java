package i_Multithreading.C_Thread_Method;

public class C_Join {
    public static void main(String[] args) throws InterruptedException {
        Task t1 = new Task('*');
        Task t2 = new Task('$');
        Task t3 = new Task('&');
        System.out.println("Starting Thread join...");
        t1.setPriority(Thread.MIN_PRIORITY); // Priority 0
        t2.setPriority(Thread.NORM_PRIORITY); // Priority 5
        t3.setPriority(Thread.MAX_PRIORITY); // Priority 10

        System.out.println("Thread 1 starting");
        t1.start();
        System.out.println("Thread 2 starting");
        t1.join(); // main waits until t1 is completely done
        t2.start();

        System.out.println("Thread 3 starting");
        t2.join(); // main waits until t2 is completely done
        t3.start();
        t3.join(); // main waits until t3 is completely done

        System.out.printf("\n %s  is Finish \n", Thread.currentThread().getName());
    }
}
