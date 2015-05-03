/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FixSubtitles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author root
 */
public class FixEncodingUtil {

    public void fixEncoding(Path path) throws FileNotFoundException, IOException{
      
        File file = new File(path.toString());
        byte[] encoded = Files.readAllBytes(Paths.get(file.getAbsolutePath()));
                try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(path.toString())), "UTF-8"))) {
                        bw.write(new String(encoded, "Windows-1251"));
                }
    }
}
