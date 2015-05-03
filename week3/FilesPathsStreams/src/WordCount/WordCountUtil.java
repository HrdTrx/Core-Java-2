/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WordCount;

import WordCount.WordCountResult;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

/**
 *
 * @author root
 */
public class WordCountUtil {
    
    
    public WordCountResult wordCount(Path path) throws IOException{
        File file = new File(path.toString());
        WordCountResult word = new WordCountResult(file);
       
        return word;
    }
    
    public WordCountResult wordCount(File file) throws IOException{
        WordCountResult word = new WordCountResult(file);
        
        return word;
    }
}
