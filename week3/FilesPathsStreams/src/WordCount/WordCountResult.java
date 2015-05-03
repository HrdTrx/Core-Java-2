/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WordCount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author root
 */
public class WordCountResult {
    

    public WordCountResult(File file) throws IOException{
       System.out.println(getLineCount(file));
       System.out.println(getWordCount(file));
       System.out.println(getCharacterCount(file));
       
    }
    
    public static int getLineCount(File file) throws FileNotFoundException, IOException{
        String lineReader;
        int numberOfLines = 0;
        
        BufferedReader br = new BufferedReader(new FileReader(file));
        while((lineReader = br.readLine()) != null){
            numberOfLines++;
        }
        
        return numberOfLines;
    }
    
    public static int getWordCount(File file) throws FileNotFoundException, IOException{
        String lineReader;
        int numberOfWord = 0;
        
        BufferedReader br = new BufferedReader(new FileReader(file));
        while((lineReader = br.readLine()) != null){
            numberOfWord += lineReader.split("\\W+").length;
        }
        
        return numberOfWord;
    }
    
        public static int getCharacterCount(File file) throws FileNotFoundException, IOException{
        String lineReader;
        int numberOfCharacters = 0;
        
        BufferedReader br = new BufferedReader(new FileReader(file));
        while((lineReader = br.readLine()) != null){
            numberOfCharacters += (lineReader.length()-lineReader.replaceAll("[+-=!@#$%^&*()?><.,:;]","").length());
        }
        
        return numberOfCharacters;
    }
}
