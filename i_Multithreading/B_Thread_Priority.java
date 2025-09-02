package i_Multithreading;

class Task extends Thread {

    public Character ch;

    public Task(char c) {
        this.ch = c;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.printf("%d %c", i, ch);
        }
        System.out.printf("\n %s is Finish\n", Thread.currentThread().getName());
    }

}

public class B_Thread_Priority {
    public static void main(String[] args) {
        Task t1 = new Task('*');
        Task t2 = new Task('$');
        Task t3 = new Task('&');
        System.out.println("Starting Thread...");
        t1.setPriority(Thread.MIN_PRIORITY); //Priority 0
        t2.setPriority(Thread.NORM_PRIORITY); // Priority 5
        t3.setPriority(Thread.MAX_PRIORITY); // Priority 10
        
        t1.start();
        t2.start();
        t3.start();

        System.out.printf("\n %s  is Finish \n", Thread.currentThread().getName());
    }
}
