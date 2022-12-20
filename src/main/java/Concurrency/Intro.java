package Concurrency;

public class Intro {
    /**
     * concurrency 并发
     * a process is a unit of execution that has its own memory space.
     * Each instance of a java virtual machine runs as a process (this isn't true for all jvm implementations, but for most of them)
     * when we run a java console application, we're kicking off a process, when we run a javaFx application,
     * we're kicking off a process.
     *
     * if one java application is running, and we run another one, each application has its own
     * memory space of heap.
     * The first java application cannot access the heap that belongs to the second java application.
     * the heap isn't shared between them. each of they have their own heaps(memory space).
     *
     * a thread is a unit of execution within a process.
     * each process can have multiple threads.
     * in java, every process or application has at least one thread, the main thread.
     * in fact, just about every java process also has multiple system threads that handle tasks like
     * memory management and I/O.
     *
     * creating a thread doesn't require as many resources as creating a process
     * Every thread created by a process shares the process's memory and files.
     *
     * W : Every java application runs as a single process, and each process can have multiple threads
     * Every process has a heap or memory space, and every thread has a thread stack.
     *
     */
}
