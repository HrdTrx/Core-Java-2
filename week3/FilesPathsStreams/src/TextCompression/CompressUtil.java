/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextCompression;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author root
 */
public class CompressUtil {
    
    public String replaceWords(String string){
        String[] wordsSplit = string.split(" ");
        
        Set<String> words = new LinkedHashSet<>();
        
        for (String wordsSplit1 : wordsSplit) {
            if (!(words.contains(wordsSplit1))) {
                words.add(wordsSplit1);
            }
        }
        int counter = 0;
        
        for(String readingWords :words){
         string = string.replaceAll(readingWords,"~" + Integer.toString(counter));
         counter++;
        }
        
        
        return string;
    }
    public void compress(Path filePath) throws FileNotFoundException, IOException{
        String readingCurrentLine;
        StringBuilder holderString = new StringBuilder();
        
        File file = new File(filePath.toString());
        
        BufferedReader br = new BufferedReader(new FileReader(file));
        while((readingCurrentLine = br.readLine()) != null){
            
         String[] words = readingCurrentLine.split(" ");
            for (String word : words) {     
                holderString.append(word).append(" ");          
            } 
        }
        
        File fileTwo = new File(filePath.toString()+".compr");
        if(!fileTwo.exists()){
            fileTwo.createNewFile();
        }
        
        FileWriter fw = new FileWriter(fileTwo.getAbsoluteFile());
        try (BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(replaceWords(holderString.toString()));
        }
        
        
    }
}
