/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConvertHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 *
 * @author root
 */
public class ConvertHashMapMain {
    public static void main(String[] args){
        HashMap<String,Integer> sup = new LinkedHashMap<>();
        sup.put("Test", 1);
        sup.put("Second Test",2);
        sup.put("Final Test",3);
        String string = new HashMapUtility().mapString(sup);
        System.out.println(string );
    }
}
