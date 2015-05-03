/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuplicatingFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author root
 */
public class DuplicatingFilesUtil {
    static boolean compareFiles(File f1,File f2) throws IOException{
        
        byte[] b1 = Files.readAllBytes(f1.toPath());
        byte[] b2 = Files.readAllBytes(f2.toPath());
        
        
        if(b1.length != b2.length){
            return false;
        }
        
        for(int i = 0; i < b1.length;i++){
            if(b1[i] != b2[i] ){
                return false;
            }
        }
      
        return true;
    }
    
    public void findDuplicatingFiles(Path path) throws IOException{
        
        File folder = new File(path.toString()); 
        List<File> holder = new ArrayList<>();
        
        for(File fileEntry : folder.listFiles()){
            if(fileEntry.isDirectory()){
                findDuplicatingFiles(fileEntry.toPath());
            }else{
                holder.add(fileEntry);
                int counter = 0;
                while(counter < holder.size()){     
                for(int i = 1; i < holder.size();i++){
                    if(compareFiles(holder.get(counter),holder.get(i)) && counter != i){
                        System.out.println("Files : "+ holder.get(counter) + " and " +holder.get(i) + " are equal.");
                   }
                 }
                counter++;
            }
            }
        }

        
    }
    
}
