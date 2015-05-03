/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoublyLinkedListStackPackage;

/**
 *
 * @author root
 */
public interface DoublyLinkedListStackInterface {
     /**
     * Adds an item to the top of the stack.
     * @param item the item to add.
     */
    
    public void  push(Object item);
    
     /**
     * Removes and returns item from the top of the stack.
     * @return the former top item.
     */
    public Object pop();
     /**
     * Returns item from the top of the stack.
     */
    public void peek();
     /**
     * Returns the size of the stack.
     * @return the size of the stack.
     */
    public int size();
    /**
     * Tests if stack is empty.
     * @return true if the stack is empty; false otherwise.
     */
    public boolean isEmpty();
    
    /**
     * Prints the elements of the stack.
     */
    public void printStack();
     /**
     * Clears the stack.
     */
    public void clear();
}
