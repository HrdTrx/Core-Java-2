/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReduceFilePath;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author root
 */
public class ReduceFilePathMain {
   public static void main(String[] args){
       Path testPath = Paths.get("////////////");
       System.out.println(new NormalizePathUtil().normalizePath(testPath));
   } 
}
