/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FindBrokenSymLinks;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author root
 */
public class FindBrokenLinksUtil {
    
    public void findBrokenLinks(Path path) throws IOException{
        
        File folder = new File(path.toString());
        boolean isSymbolicLink;
        
        
        for(File fileEntry : folder.listFiles()){
            if(fileEntry.isDirectory()){      
                findBrokenLinks(fileEntry.toPath());         
            } else if(isSymbolicLink = Files.isSymbolicLink(fileEntry.toPath())) { 
                
                if(Files.notExists(Files.readSymbolicLink(fileEntry.toPath()))){                
                    System.out.println(fileEntry.toPath() + " is broken link.");              
                } 
            }
        }
        
    }
}
