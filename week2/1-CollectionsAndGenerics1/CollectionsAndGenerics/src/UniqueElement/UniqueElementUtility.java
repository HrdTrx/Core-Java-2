/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniqueElement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author root
 */
public class UniqueElementUtility {
    
        public int uniqueElement(Collection<Integer> collection){
        List<Integer> list = new ArrayList<>();
        
        int occurences = 0;
        Iterator iterator = collection.iterator();
        
         while(iterator.hasNext()){
             Object element = iterator.next();
             list.add((Integer) element); 
         }
         
         for(int i = 0 ; i < list.size(); i++){
             occurences ^= list.get(i);
         }
  
         return occurences;
    }
}
