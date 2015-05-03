/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReduceFilePath;

import java.nio.file.Path;

/**
 *
 * @author root
 */
public class NormalizePathUtil {
    
    public Path normalizePath(Path path){  
        return path.normalize();
    }
}
