/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoublyLinkedListStackPackage;

import DoublyLinkedListPackage.DoublyLinkedList;

/**
 *
 * @author root
 */
public class DoublyLinkedListStack implements DoublyLinkedListStackInterface  {
        private DoublyLinkedList stack = new DoublyLinkedList();
    
        @Override
    public void push(Object item){
        stack.add(item);
    }
    
        @Override
    public Object pop(){
        return stack.remove();
    }
    
        @Override
    public void peek(){
         stack.getTails();
    }
    
        @Override
    public int size(){
        return stack.size();
    }
    
        @Override
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    
        @Override
    public void printStack(){
        stack.printList();
    }
    
        @Override
    public void clear(){
        stack.clearList();
    }
    
    public static void main(String[] args){
        DoublyLinkedListStack s = new DoublyLinkedListStack();
        
        s.push("Sup bro");
        s.push("How's it going?");
        s.push("This is really retarded.");
        s.push("I think i'm kinda failing this shit.");
        System.out.println(s.isEmpty());
        s.printStack();
        System.out.println(s.size());
        s.pop();
        s.peek();
        s.printStack();
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        

    }
}
