/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoundedQueue;

/**
 *
 * @author root
 */
public class BoundedQueueMain {
    public static void main(String[] args){
        BoundedQueue queue = new BoundedQueue(3);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        System.out.println(queue.toString());
    }
}
