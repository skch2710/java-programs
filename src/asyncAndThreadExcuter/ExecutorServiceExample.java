package asyncAndThreadExcuter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {

    public static void main(String[] args) {
        // Create an ExecutorService with a thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // List to hold the Callable tasks
        List<Callable<String>> tasks = new ArrayList<>();

        // Create Callable tasks for each method
        tasks.add(() -> method1());
        tasks.add(() -> method2());
        tasks.add(() -> method3());

        try {
            // Submit all tasks and get a list of Future objects
            List<Future<String>> results = executorService.invokeAll(tasks);

            // Shutdown the ExecutorService
            executorService.shutdown();

            // Wait for all tasks to complete and retrieve their results
            List<String> resultsList = new ArrayList<>();
            for (Future<String> result : results) {
                resultsList.add(result.get());
            }

            // Combine the results of method1, method2, and method3
            String finalResult = combineMethods(resultsList.get(0), resultsList.get(1), resultsList.get(2));
            System.out.println("Final Result: " + finalResult);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    // Independent method 1
    private static String method1() throws InterruptedException {
    	System.out.println("started ... m1--->");
    	Thread.sleep(8000);
    	System.out.println("m1--->");
        return "Result from method 1";
    }

    // Independent method 2
    private static String method2() throws InterruptedException {
    	System.out.println("started ... m2--->");
        Thread.sleep(5000);
        System.out.println("m2--->");
        return "Result from method 2";
    }

    // Independent method 3
    private static String method3() throws InterruptedException {
    	System.out.println("started ... m3--->");
    	Thread.sleep(6000);
    	System.out.println("m3--->");
        return "Result from method 3";
    }

    // Dependent method combining results of method1, method2, and method3
    private static String combineMethods(String result1, String result2, String result3) {
        return result1 + " + " + result2 + " + " + result3;
    }
}


