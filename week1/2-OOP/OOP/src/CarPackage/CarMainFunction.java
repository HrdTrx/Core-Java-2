/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarPackage;

/**
 *
 * @author root
 */
public class CarMainFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        Audi audiS3 = new Audi("Audi S3","Blue","Automatic",1999,"C38282",123282);
        BWM bmwX5 = new BWM("BMW X5","Black","Automatic", 2010, "B23828");
        Wolkswagen wolkswagenPassat = new Wolkswagen("Wolkswagen Passat","Blue","Semi-Automatic", 2006, "A19291");
        Jaguar jaguarS3 = new Jaguar("Jaguar S3","Black","Automatic", 2014, "H383882");
        
        System.out.println(audiS3.toString());
        System.out.println(bmwX5.toString());
        System.out.println(wolkswagenPassat.toString());
        System.out.println(jaguarS3.toString());
        
        
        
        
    }
    
}
