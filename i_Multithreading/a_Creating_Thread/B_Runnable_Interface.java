package i_Multithreading.a_Creating_Thread;

//Step-1: Define a class implements Runnable
class Task1 implements Runnable {

    // Step-2 : Override the run() Method
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.printf("\n %s Thread: Task Complete\n", Thread.currentThread().getName());
        // throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

}

class Task2 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.printf("\n %s Thread: Task Complete\n", Thread.currentThread().getName());
        // throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

}

class Task3 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d& ", i);
        }
        System.out.printf("\n %s Thread: Task Complete\n", Thread.currentThread().getName());
        // throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

}

public class B_Runnable_Interface {
    public static void main(String[] args) {
        // Step-3: Create an instance of class
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        // Step-4: Wrap the class with thread

        Thread t1 = new Thread(task1);
        t1.start(); // start first thread

        Thread t2 = new Thread(task2);
        t2.start(); // start second thread

        Thread t3 = new Thread(task3);
        t3.start(); // start third thread

    }
}
