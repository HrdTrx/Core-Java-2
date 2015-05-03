/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadingAndWriting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

/**
 *
 * @author root
 */
public class FileUtils {
        
    private static FileUtils instance = null;
    
    public static FileUtils getInstace(){
        
        if(instance == null){
            instance = new FileUtils();
        }
        return instance;
    }
    
    
    public FileUtils(){
        
    }
    
    public String readFrom(File file) throws FileNotFoundException, IOException{
       String readingCurrentLine;
       StringBuilder wholeFile = new StringBuilder();
       
       BufferedReader br = new BufferedReader(new FileReader(file));
       while((readingCurrentLine = br.readLine()) != null){
           wholeFile.append(readingCurrentLine);
           wholeFile.append("\n");
       }
       
       return wholeFile.toString();
    }
    
    
    public String readFrom(Path path) throws IOException{
      File fr = new File(path.toString());
      
      String wholeFile = readFrom(fr);
      
      return wholeFile;
    }
    
    public void writeToFile(String textToWrite,Path pathToWrite) throws IOException{
        
        File file = new File(pathToWrite.toString());
        
        if(!file.exists()){
            file.createNewFile();
        }
        
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        try (BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(textToWrite);
        }
        
    }
}
