/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoublyLinkedListPackage;

import java.util.NoSuchElementException;

/**
 *
 * @author root
 */
public class DoublyLinkedList implements DoublyLinkedListInterface {
    
     private Node head;
     private Node tails;
     private int size;
     
     public DoublyLinkedList(){
         size = 0;
     }
     
     private class Node{
         Object element;
         Node next;
         Node prev;
         
         public Node(Object element,Node next,Node prev){
             this.element = element;
             this.next = next;
             this.prev = prev;
         }
         
         
     }
     
     @Override
     public int size(){
         return size;
     }
     
     @Override
     public boolean isEmpty(){
         return size == 0;
     }
    
    @Override
     public void add(Object element){    
         Node tmp = new Node(element,null,tails);
         if( tails != null){
             tails.next = tmp; 
         }
         
         tails = tmp;
   
         if(head == null){
             head = tmp;  
         }
         
         size++;
         System.out.println("adding " + element);
     }
     
     
     @Override
      public Object remove(){
         if(size == 0) {throw new NoSuchElementException();}
         Node tmp = tails;
         tails = tails.prev;
         tails.next = null;
         size--;
         System.out.println("deleted " + tmp.element);
         return tmp.element;
     }
      
     @Override
      public void getHead(){
          if(size == 0) {throw new NoSuchElementException();}
          Node tmp = head;
          System.out.println("First element is : " +tmp.element);
          
      }
      
     @Override
      public void getTails(){
          if(size == 0) {throw new NoSuchElementException();}
          Node tmp = tails;
          System.out.println("Last element is : " +tmp.element);
      }
      
     @Override
      public Object getIndexAt(int indexAt){
          Node tmp = head;
          int counter = 0;
          while(counter != indexAt){
              tmp = tmp.next;
              counter++;
          }
          return  tmp.element;
      }
      
     @Override
      public void clearList(){
          head = null;
          tails = null;
          size = 0;
          
      }
      
     @Override
      public void printList(){
          if(size == 0) {throw new NoSuchElementException();}
          Node tmp = head;
          while(tmp != null){
              System.out.println(tmp.element);
              tmp = tmp.next;
          }
      }
     
     public static void main(String[] args){
         DoublyLinkedList DLL = new DoublyLinkedList();
         
         DLL.add(12);
         DLL.add(13);
         DLL.add(14);
         DLL.add(15);
         System.out.println(DLL.getIndexAt(0));
         DLL.clearList();
         System.out.println(DLL.isEmpty());
         
        // System.out.println(DLL.getIndexAt(2));
        /* DLL.getHead();
         DLL.getTails();
         DLL.remove();
         DLL.getHead();
         DLL.getTails();
         DLL.printList(); */
     }
}
