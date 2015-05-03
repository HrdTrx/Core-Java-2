/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuplicatingSets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author root
 */
public class DuplicatingSetsMain {
    public static void main(String[] args){
        Set<Integer> A = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> B = new HashSet<>(Arrays.asList(1,4,5,6));
        Set<Integer> C = new HashSet<>(Arrays.asList(1,4,5,6,7,8));
        Set<Integer> D = new HashSet<>(Arrays.asList(1,4,5));
        new DuplicatingSetsUtility().duplicatingSets(A, B, C, D);
    }
}
