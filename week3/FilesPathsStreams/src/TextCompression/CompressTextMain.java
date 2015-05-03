/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextCompression;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author root
 */
public class CompressTextMain {
    public static void main(String[] args) throws IOException{
       Path testingSeventhPath = Paths.get("/root/TestingFiles/TestingBuffalo.txt");
       new CompressUtil().compress(testingSeventhPath);
    }
}
