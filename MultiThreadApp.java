/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadapp;

/**
 *
 * @author student
 */
public class MultiThreadApp {

    /**
     * @param args the command line argumentsS
     */
    public static void main(String[] args)throws InterruptedException {
        counter counter = new counter();

// Create and start multiple threads
Thread thread1 = new SynchronizedExample(counter);
Thread thread2 = new SynchronizedExample(counter);
thread1.start();
thread2.start();
// Wait for threads to finish
thread1.join();
thread2.join();
System.out.println("Final counter value: " + counter.getCount());

}

}
    
    

