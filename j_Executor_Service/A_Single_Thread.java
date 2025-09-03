package j_Executor_Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
            System.out.printf("%d%c ", i, ch);
        }
        System.out.printf("\n %s is Finish\n", Thread.currentThread().getName());
    }

}

public class A_Single_Thread {
    public static void main(String[] args) {

        // Step-3 : Define a Task(Runnable)
        MyThread task1 = new MyThread('*');
        MyThread task2 = new MyThread('#');
        MyThread task3 = new MyThread('$');

        // Step-4 : create a multi thread executor
        ExecutorService service = Executors.newSingleThreadExecutor();

        // Step-5 : submit the task to executor
        service.submit(task1);
        service.submit(task2);
        service.submit(task3);

        // Step-6: Try to stop all actively executor
        service.shutdown();
    }
}
