/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PairPackage;

/**
 *
 * @author root
 */
public class Pair<First,Second> {
    
    private final  First firstObject;
    private final  Second secondObject;

    public Pair(First firstObject, Second secondObject) {
        this.firstObject = firstObject;
        this.secondObject = secondObject;
    }


    private First getFirstObject() {
        return firstObject;
    }

    private Second getSecondObject() {
        return secondObject;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair pair = (Pair) o;

        if (firstObject != null ? !firstObject.equals(pair.firstObject) : pair.firstObject != null) return false;
        if (secondObject != null ? !secondObject.equals(pair.secondObject) : pair.secondObject != null) return false;

        return true;
    }
    
    @Override
    public String toString(){
        return  getFirstObject() + " " +  getSecondObject();
    }
    
    public static void main(String[] args) {
        
      Pair<String,String> pair = new Pair("This is","a test.");
      System.out.println(pair);
        
        
    }
    
}
