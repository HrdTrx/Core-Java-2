/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConvertHashMap;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author root
 */
public class HashMapUtility {
    
    public String mapString(HashMap<? extends Object, ? extends Object> map){
        Set<?> keySet = map.keySet();
        
        StringBuilder stringBuilder = new StringBuilder();
        
        for (Object key : keySet) { 
        Object entry = map.get(key);
        stringBuilder.append(String.format("%s:%s, ", key.toString(), entry.toString()));
        }
       
        

        return "{" + stringBuilder.toString() + "}";
    }
}
