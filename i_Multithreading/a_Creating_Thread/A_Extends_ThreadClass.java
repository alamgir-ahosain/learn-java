package i_Multithreading.a_Creating_Thread;

//Step 1 : Define a Class that Extends Thread Class
class Task1 extends Thread {
    // Step 2: Override the run() method
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.printf("\n %s Thread: Task Complete\n", Thread.currentThread().getName());
    }
}

class Task2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.printf("\n %s Thread: Task Complete\n", Thread.currentThread().getName());
    }
}

class Task3 extends Thread {
    @Override
    public void run() { // task to execute
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d@ ", i);
        }
        System.out.printf("\n %s Thread: Task Complete\n", Thread.currentThread().getName());
    }
}

public class A_Extends_ThreadClass {
    public static void main(String[] args) { // main thread

        // step 3:Create an Instance of Class
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();

        System.out.println("Start Task1");
        t1.start(); // start First thread
        System.out.println("Start Task2");
        t2.start();// start Second thread
        System.out.println("Start Task3");
        t3.start();// Start Third thread
        System.out.printf("\n %s  Thread:Task Complete\n", Thread.currentThread().getName());

    }
}
