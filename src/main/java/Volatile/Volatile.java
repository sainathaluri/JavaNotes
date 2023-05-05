package Volatile;

public class Volatile {
    public static volatile int count = 0;
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            int localCount = count;
            while(localCount < 10) {
                if (localCount != count) {
                    System.out.println("Thread t1 localCount changed");
                    localCount = count;
                }
            }
        });

        Thread t2 = new Thread(() -> {
            int localCount = count;
            while(localCount < 10){
                System.out.println("Thread t2 incremented" + " " +(localCount + 1));
                count = ++localCount;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();

    }
}
