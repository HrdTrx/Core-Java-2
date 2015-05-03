/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuplicatingSets;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author root
 */
public class DuplicatingSetsUtility {
    
        public  void duplicatingSets(Set... sets){ 
            Set<Integer> set = new HashSet<>();
            
            for(Set s1 : sets){
                set.addAll(s1);
                break;
            }
            for(Set s : sets){
                set.retainAll(s);
                
            }
        System.out.println(set);
      
    }
}
