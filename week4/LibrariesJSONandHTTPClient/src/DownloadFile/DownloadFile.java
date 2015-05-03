/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DownloadFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author root
 */


public class DownloadFile {
   public static void main(String[] args) throws MalformedURLException, IOException{
   URL website = new URL(args[0]); 
   String target = args[1];
   try(InputStream in = website.openStream()){
       Files.copy(in,new File(target).toPath(),StandardCopyOption.REPLACE_EXISTING);
       System.out.println("Image downloaded!");
   }
   }
}
