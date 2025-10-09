package multithreading;

public class MultiThread1 extends Thread {
    public static void main(String[] args) {
        MultiThread1 thread1 = new MultiThread1();
        MultiThread1 thread2 = new MultiThread1();
        MultiThread1 thread3 = new MultiThread1();
        thread1.start();
        thread2.start();
        thread3.start();
    }
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is running");
        for(int i=0; i<4; i++){
            System.out.println("Thread " + Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
//Output:
//Thread Thread-1 is running
//Thread Thread-0 is running
//Thread Thread-2 is running
//Thread Thread-2 - Count: 0
//Thread Thread-0 - Count: 0
//Thread Thread-1 - Count: 0
//Thread Thread-2 - Count: 1
//Thread Thread-2 - Count: 2
//Thread Thread-1 - Count: 1
//Thread Thread-0 - Count: 1
//Thread Thread-2 - Count: 3
//Thread Thread-1 - Count: 2
//Thread Thread-0 - Count: 2
//Thread Thread-0 - Count: 3
//Thread Thread-1 - Count: 3