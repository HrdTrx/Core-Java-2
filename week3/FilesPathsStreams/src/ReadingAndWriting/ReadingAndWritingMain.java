/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadingAndWriting;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author root
 */
public class ReadingAndWritingMain {
    public static void main(String[] args) throws IOException{
        FileUtils testing = FileUtils.getInstace();
        File testingFile = new File("/root/TestingFiles/testing.properties");
        System.out.println(testing.readFrom(testingFile));
        Path testingPath = Paths.get("/root/TestingFiles/testing.properties");
        System.out.println(testing.readFrom(testingPath));
        Path writingPath = Paths.get("/root/TestingFiles/testing.txt");
        testing.writeToFile("This is just a random test.", writingPath);
    }
}
