/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackPackage;

/**
 *
 * @author root
 */
public interface Stack {
    
     /**
     * Adds an item to the top of the stack.
     * @param x the item to add.
     * @return the item added.
     */
    public Object push(Object x);
    
     /**
     * Removes and returns item from the top of the stack.
     * @return the former top item.
     */
    public Object pop();
     /**
     * Returns item from the top of the stack.
     * @return the top item.
     */
    public Object peek();
    /**
     * Tests if stack is empty.
     * @return true if the stack is empty; false otherwise.
     */
    public boolean isEmpty();
    
    /**
     * Returns the size of the stack.
     * @return the size of the stack.
     */
    public int length();
     /**
     * Clears the elements of the stack.
     */
    public void clear();

    /**
     *Prints the elements of the stack.
     * @return the elements of the stack.
     */
    @Override
    public String toString();
}
