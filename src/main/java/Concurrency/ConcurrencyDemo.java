package Concurrency;

import static Concurrency.ThreadColor.*;

public class ConcurrencyDemo {
    /**
     * in java, a thread is a separate flow of execution within a process.
     * each thread has its own stack(memory space) and operates independently of other threads.
     * allowing multiple thread to run concurrently within a single program.
     *
     * why we use thread in programming?
     * Threads are used to improve the performance of a program by allowing it to perform
     * multiple tasks concurrently and make better use of the available processing power.
     *
     * Threads are created and controlled using the Thread class and the Runnable interface in java.
     * (1) To create a new thread, we can extend the "Thread" class and override the run() method
     * (2) we can also implement the "Runnable" interface and pass an instance of the class to a
     * Thread's object's constructor.
     *
     */
    public static void main(String[] args){
        System.out.println(ANSI_PURPLE + "Hello from the main thread.");
        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        //create an anonymous class
        new Thread() {
            public void run(){
                System.out.println(ANSI_GREEN + "Hello from the anonymous thread.");
            }
        }.start();

        Thread myrunnaleThread = new Thread(new Myrunnable());
        myrunnaleThread.start();

        System.out.println(ANSI_PURPLE + "Hello again from the main thread.");
//        anotherThread.start();// cannot reuse the instance many times
        /**
         * when use an anonymous class, we have to start the thread immediately
         * this is another consideration when deciding whether to use a named or an anonymous class.
         * the named class is the one that we have already defined using the anotherThread there.
         *
         */

    }
}
class AnotherThread extends Thread{
    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from the Another thread.");
    }
}
