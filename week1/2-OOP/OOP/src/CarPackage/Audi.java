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
public class Audi extends Car {
    
    protected int Mileage;

    public Audi(String Model, String Color, String TransmissionType, int YearOfMaking, String RegistrationNumber,int Mileage) {
        super(Model, Color, TransmissionType, YearOfMaking, RegistrationNumber);
        this.Mileage = Mileage;
    }
    

    

   
    
    protected int getMileage(){
        return Mileage;
    }
    
    @Override
    public String toString(){
        return (getClass().getName() + "@" + Integer.toHexString(hashCode())+" .")+" " + ("Car Model is " +getModel() + " ,it's color is " + getColor() + ". The transmission type is " + getTransmissionType() + " ,the year of making is " + getYearOfmaking() + " ,the registration number is "  +  getRegistrationNumber() + " and it has been driven for "+getMileage()+" miles.");
    }
    
    
    
}
