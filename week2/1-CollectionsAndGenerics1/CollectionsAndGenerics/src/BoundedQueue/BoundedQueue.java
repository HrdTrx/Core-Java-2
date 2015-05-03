/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoundedQueue;

import java.util.LinkedList;




/**
 *
 * @author root
 */
public class BoundedQueue implements Queue  {

    private LinkedList<Object> data = new LinkedList<>();
    private int maxSize;

    
    public BoundedQueue(int maxSize){
        this.maxSize = maxSize;
    }
    
    @Override
    public void offer(Object item) {
        if(data.size() == maxSize){
        data.removeFirst();
        data.addLast(item);
        }else{
        data.addLast(item);
        }
    }
    
    @Override
    public Object dequeue() {
        return data.removeFirst();
    }
    
    @Override
    public Object peek() {
        return data.getFirst();
    }
    
    @Override
    public int size() {
        return data.size();
    }
    
    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }
    
    @Override
    public String toString(){
        String holder = "";
        for(int i = 0 ; i < maxSize; i++){
            holder += data.get(i)+ " ";
            
        }
        
        return holder;
    }

    
 

    
}
