package Concurrency;

public class ConcurrencyDemo {
    public static void main(String[] args){
        System.out.println("Hello from the main thread.");
        Thread anotherThread = new AnotherThread();
        anotherThread.start();
        System.out.println("Hello again from the main thread.");
    }
}
class AnotherThread extends Thread{
    @Override
    public void run() {
        System.out.println("Hello from the Another thread.");
    }
}
