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
public interface Queue {
/**
     * Adds the given item to the rear of the queue.
     * @param item
     */
    void offer(Object item);

    /**
     * Removes the front item from the queue and returns it.
     * @return 
     */
    Object dequeue();

    /**
     * Returns the front item from the queue without popping it.
     * @return 
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    Object peek();

    /**
     * Returns the number of items currently in the queue.
     * @return 
     */
    int size();

    /**
     * Returns whether the queue is empty or not.
     * @return 
     */
    boolean isEmpty();
}