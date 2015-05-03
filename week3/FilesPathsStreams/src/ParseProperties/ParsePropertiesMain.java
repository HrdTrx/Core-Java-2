/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParseProperties;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author root
 */
public class ParsePropertiesMain {
    public static void main(String[] args) throws IOException{
       File file = new File("/root/TestingFiles/testing.properties");
       System.out.println(new ParsePropertiesUtil().parseProperties(file));
    }
}
