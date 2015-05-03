/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParseProperties;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author root
 */
public class ParsePropertiesUtil {
    
    public ParsePropertiesUtil(){
        
    }
    
    public String getKey(String line){
        String key ="";
        for(int i = 0; i < line.length(); i++){
            if(line.charAt(i)=='='){
                key = line.substring(0,i);
            }
        }
        String finalKey = key.replaceAll("\\s+","");
        
        return finalKey;
    }
    
    
    public String getValue(String line){
        String value = "";
        for(int i = 0;i < line.length(); i++){
            if(line.charAt(i) == '='){
                value = line.substring(i+1);
            }
        }
        
        String finalValue = value.replaceAll("\\s","");
        
        return finalValue;
    }
    
    public Map<String,String> parseProperties(File file) throws FileNotFoundException, IOException{
        Map<String,String> map = new HashMap<>();
        String key;
        String value;
        
        String readLine;
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        while((readLine = br.readLine()) != null){
            if(!readLine.startsWith("#")){
                key = getKey(readLine);
                value = getValue(readLine);
                map.put(key,value);
            }
        }
        
        return map;
    }
}
