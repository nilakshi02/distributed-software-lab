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
public class SimpleThread extends Thread {
    @Override
    public void run() {
System.out.println(Thread.currentThread().getId() + " is executing the thread.");
}
    
}
    

