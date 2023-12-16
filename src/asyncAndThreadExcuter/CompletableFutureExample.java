package asyncAndThreadExcuter;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {

    public static void main(String[] args) {
        // Create a CompletableFuture for method1
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
			try {
				return method1();
			} catch (InterruptedException e2) {
				e2.printStackTrace();
			}
			return null;
		});

        // Create another CompletableFuture for method2
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                return method2();
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            return null;
        });

        // Create another CompletableFuture for method3
        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
			try {
				return method3();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			return null;
		});

        // Use CompletableFuture.allOf to wait for all three futures to complete
        CompletableFuture<Void> allOf = CompletableFuture.allOf(future1, future2, future3);

        // Combine the results of method1, method2, and method3 and run combineMethods asynchronously
        CompletableFuture<String> finalResultFuture = allOf.thenApply(
                unused -> combineMethods(future1.join(), future2.join(), future3.join())
        );

        try {
            // Get the final result when all three futures are completed
            String finalResult = finalResultFuture.get();
            System.out.println("Final Result: " + finalResult);
            System.out.println("????? Without Async....");
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
