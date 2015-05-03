/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RotateElements;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author root
 */
public class RotateElementsMain {
    public static void main(String[] args){
        List list = Arrays.asList("one two three four five six seven".split(" "));    
        new RotateUtility().rotate(list,-2);
    }
}
