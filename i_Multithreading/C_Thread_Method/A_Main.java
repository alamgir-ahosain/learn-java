package i_Multithreading.C_Thread_Method;
 
class Task extends Thread {
    public Character ch;

    public Task(char c) {
        this.ch = c;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.printf("%d%c ", i, ch);
        }
        System.out.printf("\n %s is Finish\n", Thread.currentThread().getName());
    }

}

public class A_Main {

    public static void main(String[] args) {

    }
}
