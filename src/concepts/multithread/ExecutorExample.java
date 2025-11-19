package concepts.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    static void main() {
        ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            service.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " executing task " + taskId);
            });
        }
        service.shutdown();

    }
}
