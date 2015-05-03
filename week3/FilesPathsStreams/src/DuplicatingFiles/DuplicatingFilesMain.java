/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuplicatingFiles;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author root
 */
public class DuplicatingFilesMain {
    public static void main(String[] args) throws IOException{
        Path test = Paths.get("/root/TestingDuplicatingFiles");
        new DuplicatingFilesUtil().findDuplicatingFiles(test);
        
    }
}
