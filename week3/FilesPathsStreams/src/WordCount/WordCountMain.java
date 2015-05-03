/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WordCount;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author root
 */
public class WordCountMain {
    public static void main(String[] args) throws IOException{
        
       Path testingThirdPath = Paths.get("/root/TestingFiles/TestingNumbers.txt");
       System.out.println(new WordCountUtil().wordCount(testingThirdPath));
       
       File testingThirdFile = new File("/root/TestingFiles/TestingNumbers.txt");
       System.out.println(new WordCountUtil().wordCount(testingThirdFile));
    }
}
