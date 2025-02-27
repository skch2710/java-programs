package asyncAndThreadExcuter;

import java.util.concurrent.atomic.AtomicInteger;

public class NumberLetterPrinter {
	
    private static final int LIMIT = 26;
    private static final AtomicInteger counter = new AtomicInteger(1);
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread numberThread = new Thread(() -> {
            for (int i = 1; i <= LIMIT; i++) {
                synchronized (lock) {
                    while (counter.get() % 2 == 0) { // Wait for letter thread
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.print(i); // Print number
                    counter.incrementAndGet();
                    lock.notify(); // Notify letter thread
                }
            }
        });

        Thread letterThread = new Thread(() -> {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                synchronized (lock) {
                    while (counter.get() % 2 == 1) { // Wait for number thread
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.print(ch + " "); // Print letter
                    counter.incrementAndGet();
                    lock.notify(); // Notify number thread
                }
            }
        });

        numberThread.start();
        letterThread.start();
    }
}

