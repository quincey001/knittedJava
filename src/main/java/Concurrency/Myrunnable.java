package Concurrency;

import static Concurrency.ThreadColor.ANSI_GREEN;

public class Myrunnable implements Runnable{
    /**
     * implementing runnable interface, which is a way to create threads.
     */
    @Override
    public void run() {
        System.out.println(ANSI_GREEN + "hello from Myrunnable's implementation of run()");
    }
}

class Main{
    public static void main(String[] args){
        //implemented the Runnable interface and pass an instance of the class to a thread's object's constructor
        Thread myrunnaleThread1 = new Thread(new Myrunnable());
        myrunnaleThread1.start();
        /**
         * creating threads by subclassing the thread class.
         * we can also have an anonymous class implement runnable and pass an instance of it to the
         * thread constructor.
         */
        Thread myrunnaleThread2 = new Thread(new Myrunnable(){
            @Override
            public void run() {
                super.run();
            }
        });
        myrunnaleThread2.start();
    }
}
