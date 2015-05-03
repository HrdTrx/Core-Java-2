/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TimeFoolProof;

/**
 *
 * @author root
 */
public class Time {
    private int Hour;
    private int Minute;
    private int Second;
    
    private int Day;
    private int Month;
    private int Year;

    public Time(int Hour, int Minute, int Second, int Day, int Month, int Year) {
        setMonth(Month);
        setYear(Year);
        setDay(Day);
        setHour(Hour);
        setMinute(Minute); 
        setSecond(Second);
    }

    public int getHour() {
        return Hour;
    }

    public int getMinute() {
        return Minute;
    }

    public int getSecond() {
        return Second;
    }

    public int getDay() {
        return Day;
    }

    public int getMonth() {
        return Month;
    }

    public int getYear() {
        return Year;
    }

    public void setHour(int Hour) {
         if (Hour < 0 || Hour > 23) {
            throw new IllegalArgumentException("Hour can only be between 0 and 23.Enter correct hour!");
        }
        this.Hour = Hour;
    }

    public void setMinute(int Minute) {
        if (Minute < 0 || Minute > 59) {
            throw new IllegalArgumentException("Minutes can only be between 0 and 59.Enter correct minute!");
        }
        this.Minute = Minute;
    }

    public void setSecond(int Second) {
        if (Second < 0 || Second > 59) {
            throw new IllegalArgumentException("can only be between 0 and 59.Enter correct seconds!");
        }
        this.Second = Second;
    }

    public void setDay(int Day) {
                if ((Day < 0 || Day > 31) ||
        (Day == 31 && 
        (this.getMonth() == 2 || 
         this.getMonth() == 4 ||
         this.getMonth() == 6 ||
         this.getMonth() == 9 || 
         this.getMonth() == 11)))  {
            throw new IllegalArgumentException("There is no such day in this month! Enter correct day value!");
        }
        this.Day = Day;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }
    
    @Override
    public String toString(){
        return String.format("The time is %02d:%02d:%02d and the date is  %02d:%02d:%02d", Hour,Minute,Second,Day,Month,Year);
    }
    
}
