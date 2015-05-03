/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniqueElement;

import java.util.Arrays;
import java.util.Collection;

/**
 *
 * @author root
 */
public class UniqueElementMain {
    public static void main(String[] args){
        Collection<Integer> ints = Arrays.asList(1,2,3,4,5,5,4,3,1,2,6);
        System.out.println(new UniqueElementUtility().uniqueElement(ints));
    }
}
