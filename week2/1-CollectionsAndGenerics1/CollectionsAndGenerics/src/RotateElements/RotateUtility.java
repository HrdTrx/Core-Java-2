/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RotateElements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;




/**
 *
 * @author root
 */
public  class RotateUtility {
    
    public RotateUtility(){
        
    }
 
    
    public void rotate(Collection<Object> collection, int rotateStep){
        List<Object> list = new ArrayList<>();
        
        Iterator iterator = collection.iterator();
         while(iterator.hasNext()){
             Object element = iterator.next();
             list.add(element); 
         }
         
         if( rotateStep > 0){
             while(rotateStep > 0){
                 Object last = list.get(list.size()-1);
                 list.remove(list.size()-1);
                 list.add(0,last);
                 rotateStep--;
             }
         } else if (rotateStep < 0 ){
             while(rotateStep < 0){
                 Object first = list.get(0);
                 list.remove(0);
                 list.add(list.size(),first);
                 rotateStep++;
             }
         }
        
         for(int i = 0 ; i < list.size(); i++){
             System.out.print(list.get(i)+ " ");
         }
         System.out.println();
    }
    
    
}
