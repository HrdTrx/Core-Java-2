/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoublyLinkedListPackage;

/**
 *
 * @author root
 */
public interface DoublyLinkedListInterface {
    /**
     * returns the size of the linked list
     * @return
     */
    public int size();
     /**
     * returns if the linked list is empty or not.
     * @return
     */
    public boolean isEmpty();
     /**
     * adds element at the end of the linked list.
     * @param element
     */
    public void add(Object element);
     /**
     * removes element from the end of the linked list.
     * @return
     */
    public Object remove();
     /**
     * prints the first element of the linked list.
     */
    public void getHead();
     /**
     * prints the last element of the linked list.
     */
    public void getTails();
     /**
     * returns the element at the index given by the user in the linked list.
     * @param indexAt
     * @return 
     */
    public Object getIndexAt(int indexAt);
     /**
     * clears the list.
     */
    public void clearList();
     /**
     * prints the elements of the list.
     */
    public void printList();
    
}
