/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackPackage;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Scanner;


/**
 *
 * @author root
 */

public class StackImpl implements Stack{
    
    /**
     * Constructs an empty stack.
     */
    public StackImpl()
    {
        items = new ArrayList();
    }
    

    @Override
    public Object push(Object x)
    {
            if(items.contains(x)){
                System.out.println("Can't add same element again.");
                
            } else {
               items.add(x); 
            } 
        
        return x;           
    }
    

    @Override
    public Object pop()
    {
        if(isEmpty())
            throw new EmptyStackException();
            
        return items.remove(items.size()-1);
    }
    

    @Override
    public Object peek()
    {
        if( isEmpty())
            throw new EmptyStackException();
            
        return items.get(items.size() - 1);
    }
    

    @Override
    public boolean isEmpty()
    {
        return length() == 0;
    }
    

    @Override
    public int length()
    {
        return items.size();
    }
    
    @Override
    public void clear()
    {
        items.clear();
    }
    
    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder();
        for(int i = 0;i <= length()-1;i++)
            result.append(items.get(i));
        return result.toString();    
    }
    
    private ArrayList items;

    
public static void main(String[] args){
    StackImpl stack = new StackImpl();
    Scanner input = new Scanner(System.in);
    int numberOfElements = 5;
   
    System.out.println("Enter 5 elements : " );
    for(int i = 0 ; i < 5;i++){
        stack.push(input.nextInt());
    }
    
    System.out.println(stack.toString());
    System.out.println(stack.length());
    stack.clear();
    System.out.println(stack.toString());
    
}
    
}
