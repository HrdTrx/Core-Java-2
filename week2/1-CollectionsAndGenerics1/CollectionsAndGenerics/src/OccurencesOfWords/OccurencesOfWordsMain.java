/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OccurencesOfWords;

import java.util.Map;

/**
 *
 * @author root
 */
public class OccurencesOfWordsMain {
    public static void main(String[] args){
        Map<String, Integer> result = OccurencesOfWordUtility.countOccurences("Ninjas are all over the place! We are all going to die");
        System.out.println(result);
    }
}
