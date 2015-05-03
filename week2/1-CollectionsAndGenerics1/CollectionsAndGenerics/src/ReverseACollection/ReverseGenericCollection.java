/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReverseACollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author root
 */
public class ReverseGenericCollection {
    
    public  void reverse(Collection<Integer> collection){
        List<Object> list = new ArrayList<>();
        
        Iterator iterator = collection.iterator();
         while(iterator.hasNext()){
             Object element = iterator.next();
             list.add(element); 
         }
         
         List<Object> reversedStack = new ArrayList<>();
         
             for(int i = 1 ; i <= list.size() ; i++){
                Object elementToAdd = list.get(list.size() - i);
                reversedStack.add(elementToAdd);
             }
             
             for(int i = 0 ; i  < reversedStack.size() ; i++){
                 System.out.print(reversedStack.get(i) + " ");
             }
             
             System.out.println();
    }
    
}
