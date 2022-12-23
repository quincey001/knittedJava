package Concurrency;

import static Concurrency.ThreadColor.ANSI_BLUE;
import static Concurrency.ThreadColor.ANSI_GREEN;

/**
 * Interrupt a thread when we want it to stop what it is doing and to do something else.
 *
 * there are two ways for threads to notice that they have been interrupted.
 *
 * (1) the first way is to catch the interrupted exception
 * when the run method doesn't call any methods that throw interrupted exception.
 * it should call the interrupted method periodically to check whether it has been interrupted
 * that method will return true when another thread has interrupted it.
 *
 * (2) another way is to call the interrupt method on the thread instance that it wants to
 * interrupt.
 * one thread interrupt the another thread instance when it's sleeping.
 */

public class ThreadMethods extends Thread {
    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "hello from" + currentThread().getName());

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println(ANSI_BLUE + "Thread woke me up");
            return;//
        }
        System.out.println(ANSI_BLUE + "Three seconds have passed and I'm awake");
    }
}
class ThreadMain{
    public static void main(String[] args){
        Thread threadS = new ThreadMethods();
        threadS.setName(" ThreadMain");
        threadS.start();

        Thread anotherRunnable = new Thread(new Another(){
            @Override
            public void run() {
                super.run();
            }
        });
        anotherRunnable.start();
        anotherRunnable.interrupt();//call the interrupt method
    }
}
class Another implements Runnable{
    @Override
    public void run() {
        System.out.println(ANSI_GREEN + "hello from the implemented runnable interface thread");
    }
}