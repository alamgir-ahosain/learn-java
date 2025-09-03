package j_Executor_Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//Step-1 : Define a Class that implements Runnable
class MyThread implements Runnable {
    public Character ch;

    public MyThread(char c) {
        this.ch = c;
    }

    // Step-2 : Override run() method
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("%d%c ", i, ch);
        }
        System.out.printf("\n%s is Finish :\n", Thread.currentThread().getName());
    }

}

public class B_Multiple_Thread {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(3); // create a multi thread executor

        for (int i = 0; i < 10; i++) {
            MyThread task = new MyThread((char) i); // Define a task(Runnable)
            service.submit(task); // submit the task to executor
        }
        service.shutdown(); // Try to stop all actively executor

        // wait for all task to finish executor for 10 seconds
        System.out.println("\n_________\n");
        if (!service.awaitTermination(10, TimeUnit.SECONDS)) { //check if not finish in 10 seconds
            service.shutdown(); // Try to stop all actively executor
            System.out.println("\n---------\n");

        }
        System.out.printf("\n%s is Finish :\n", Thread.currentThread().getName());

    }
}
