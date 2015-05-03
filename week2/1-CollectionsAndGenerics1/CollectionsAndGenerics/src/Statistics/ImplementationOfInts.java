/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Statistics;

import Statistics.Statistics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author root
 */
public class ImplementationOfInts implements Statistics,Iterable<Integer> {
    public List<Integer> integers;
    
    
    public ImplementationOfInts(){
        this.integers = new ArrayList<>();
    }
    
    public ImplementationOfInts(List<Integer> integers){
        this.integers = integers;
    }
    
    public void add(int number){
        this.integers.add(number);
    }
    
    @Override
    public double getMean() {
       int sum = 0;
       
       for(int i = 0 ; i < integers.size();i++){
           sum += integers.get(i);
       }
       return (double)sum/integers.size();
    }

    @Override
    public double getMedian() {
        Collections.sort(this.integers);
    if(integers.size() == 0) { 
        return 0;
    } 
    
    if(integers.size() == 1){
        return 1;
    }
    if (integers.size() % 2 == 1)
        
	return integers.get((integers.size()+1)/2-1);
    else
    {
	double lower = integers.get(integers.size()/2-1);
	double upper = integers.get(integers.size()/2);
 
	return (lower + upper) / 2.0;
    }	
    }

   
    @Override
    public int getMode() {
        int maxValue = 0; 
        int maxCount = 0;
        
        for(int i = 0; i < integers.size(); i++){
            int count = 0;
            for(int j = 0 ; j < integers.size(); j++){
                if(integers.get(j) == integers.get(i)){
                    count++;
                }
            }
            if(count > maxValue){
                maxCount = count;
                maxValue = integers.get(i);
            }
        }
        return maxValue;
    }


    @Override
    public int getRange() {
        return Collections.max(this.integers) - Collections.min(this.integers);
    }

    @Override
    public Iterator<Integer> iterator() {
         return this.integers.iterator();
    }
    
     public static void testingIntegers(List<Integer> integers){
            ImplementationOfInts testing = new ImplementationOfInts(integers);
            
             System.out.println(testing.getMean());
             System.out.println(testing.getMedian());
             System.out.println(testing.getMode());
             System.out.println(testing.getRange());
             
        }
    
    
}
