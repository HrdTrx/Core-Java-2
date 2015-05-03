/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReverseACollection;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author root
 */
public class ReverseCollectionMain {
    public static void main(String[] args){
        List listTestReverse = Arrays.asList("This is a random test for reverse".split(" "));    
        new ReverseGenericCollection().reverse(listTestReverse);
        
        Collection<Integer> intsTesting = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
        new ReverseGenericCollection().reverse(intsTesting);
    }
}
