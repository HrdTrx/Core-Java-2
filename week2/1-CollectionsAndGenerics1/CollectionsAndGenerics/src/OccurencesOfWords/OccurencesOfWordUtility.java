/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OccurencesOfWords;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author root
 */
public class OccurencesOfWordUtility {
    public static Map<String,Integer> countOccurences(String text){
        Map<String,Integer> readingMap = new LinkedHashMap<>();
        
        String[] seperatedWords = text.split(" ");
    
        for(String str: seperatedWords){
            if(readingMap.containsKey(str)){
                int occurences = readingMap.get(str)+1;
                readingMap.put(str,occurences);
                
            } else { 
                readingMap.put(str,1);
            }
        }
        return readingMap;
    }
}
