package Interview.Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
class MyCallable implements Callable {
        int num;
        MyCallable(int num) {
          this.num = num;
        }

        public Object call() throws Exception
        {
             int sum = 0;
             for(int i=0; i<num; i++) {
                sum = sum+i;
              }
             return sum;
        }

        }
public class CallableFutureDemo {
    public static void main(String args[]) throws Exception {
        MyCallable[] jobs = {
                new MyCallable(10),
                new MyCallable(20),
                new MyCallable(30),
                new MyCallable(40),
                new MyCallable(50),
                new MyCallable(60)
        };

        ExecutorService service = Executors.newFixedThreadPool(3);

        // Submit tasks to the ExecutorService and store the Future objects
        Future<Integer>[] futures = new Future[jobs.length];
        for (int i = 0; i < jobs.length; i++) {
            futures[i] = service.submit(jobs[i]);
        }

        // Retrieve and print results from Future objects
        for (Future<Integer> future : futures) {
            int result = future.get(); // This will block until the result is available
            System.out.println("Result: " + result);
        }

        service.shutdown();
    }
}
