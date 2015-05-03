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
public abstract class Car {
    
    protected String Model;
    protected String Color;
    protected String TransmissionType;
    protected int YearOfMaking;
    protected String RegistrationNumber;
    
    protected Car(String Model,String Color,String TransmissionType,int YearOfMaking,String RegistrationNumber){
        this.Color = Color;
        this.TransmissionType = TransmissionType;
        this.YearOfMaking = YearOfMaking;
        this.RegistrationNumber = RegistrationNumber;
        this.Model = Model;
    
    
    
    }

   protected String getModel(){
       return Model;
   }
    
    protected String getColor(){
        return Color;
    }
    
    protected String getTransmissionType(){
        return TransmissionType;
    }
    
    protected int getYearOfmaking(){
        return YearOfMaking;
    }
    
    protected String getRegistrationNumber(){
        return RegistrationNumber;
    }
    
    protected void printInfo(){
        System.out.println("Car Model is " +getModel() + " it's color is " + getColor() + ". The transmission type is " + getTransmissionType() + " the year of making is" + getYearOfmaking() + " and the registration number is "  +  getRegistrationNumber());
    }
    
    @Override
    public String toString(){
        return (getClass().getName() + "@" + Integer.toHexString(hashCode())+" .")+" " + ("Car Model is " +getModel() + " ,it's color is " + getColor() + ". The transmission type is " + getTransmissionType() + " ,the year of making is " + getYearOfmaking() + " and the registration number is "  +  getRegistrationNumber()+".");
    }
    
    
    
}
