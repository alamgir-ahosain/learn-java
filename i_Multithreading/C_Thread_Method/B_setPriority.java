package i_Multithreading.C_Thread_Method;

public class B_setPriority {
    public static void main(String[] args) {

        Task t1 = new Task('*');
        Task t2 = new Task('$');
        Task t3 = new Task('&');
        System.out.println("Starting Thread priority...");
        t1.setPriority(Thread.MIN_PRIORITY); // Priority 0
        t2.setPriority(Thread.NORM_PRIORITY); // Priority 5
        t3.setPriority(Thread.MAX_PRIORITY); // Priority 10

        t1.start();
        t2.start();
        t3.start();

        System.out.printf("\n %s  is Finish \n", Thread.currentThread().getName());
    }
}
