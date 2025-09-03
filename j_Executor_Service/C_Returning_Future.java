package j_Executor_Service;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class GetName implements Callable<String> {

    private final String name;

    public GetName(String name) {
        this.name = name;

    }

    @Override
    public String call() throws Exception {
        System.out.printf("\n%s From Server", name);
        Thread.sleep(4000);
        return name;
        // throw new UnsupportedOperationException("Unimplemented method 'call'");
    }

}

public class C_Returning_Future {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService service = Executors.newFixedThreadPool(1);
        GetName task1 = new GetName("Alamgir");
        GetName task2 = new GetName("Hosain");
        GetName task3 = new GetName("JK");

        // Submit tasks to ExecutorService(name is )
        Future<String> name1 = service.submit(task1);
        Future<String> name2 = service.submit(task2);
        Future<String> name3 = service.submit(task3);

        // Get results from tasks (blocking calls)
        // name doesn't hold anything  until finish the task.
        System.out.println("Name :" + name1.get());
        System.out.println("Name :" + name2.get());
        System.out.println("Name :" + name3.get());
        service.shutdown();

    }
}
