/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TimePackage;

/**
 *
 * @author root
 */
public class Time  {
    
    private int Hour;
    private int Minute;
    private int Second;
    
    private int Day;
    private int Month;
    private int Year;

    protected Time(int Hour,int Minute,int Second,int Day,int Month,int Year){
        this.Hour = ((Hour >= 0 && Hour<24) ? Hour : 0);
        this.Minute = ((Minute >= 0 && Minute < 60) ? Minute : 0);
        this.Second = ((Second >= 0 && Second < 60) ? Second : 0);
        
        this.Day = ((Day >= 1  && Day<31) ? Day : 0);
        this.Month = ((Month >= 1 && Month<=12) ? Month : 0);
        this.Year = Year%100;
    }
    
    
    
    
    
    

    
    @Override
    public String toString(){
        return String.format("The time is %02d:%02d:%02d and the date is  %02d:%02d:%02d", Hour,Minute,Second,Day,Month,Year);
    }
    
   
    
    
      public static void main(String[] args) {
        
      Time currentTime = new Time(22, 1, 23, 1, 1, 2015);
      System.out.println(currentTime.toString());
        
        
    }
}


