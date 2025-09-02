package i_Multithreading.D_synchronized;

class Counter {
    private int count = 1;

    // Not synchronized -> Race condition
    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class Task extends Thread {
    private Counter counter;

    public Task(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            counter.increment();
        }
    }

}

public class A_receCondition {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        // Two threads incrementing the same counter
        Task t1 = new Task(c);
        Task t2 = new Task(c);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        // Expected 2000, but usually less
        System.out.println(c.getCount());

    }
}
