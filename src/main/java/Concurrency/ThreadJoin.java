package Concurrency;

public class ThreadJoin {
    public static void main(String[] args){
        Thread firstOne = new FirstThread();
        firstOne.start();

        Thread joinMethod = new Thread(new JoinMethod() {
            @Override
            public void run() {
                super.run();
                try{
                    firstOne.join();
                }catch (InterruptedException e){
                    System.out.println("I couldn't wait after all, i was interrupt for some reason.");
                }
            }
        });
        joinMethod.start();
    }
}
class JoinMethod implements Runnable{

    @Override
    public void run() {
        System.out.println("thread from implemented runnable interface");
    }
}
class FirstThread extends Thread{
    @Override
    public void run() {
        System.out.println("=====First Thread=====");
    }
}
