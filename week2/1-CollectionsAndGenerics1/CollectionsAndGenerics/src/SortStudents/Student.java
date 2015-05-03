/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortStudents;

/**
 *
 * @author root
 */
public class Student  {
    
    public String name;
    public int grade;
    
    public Student(String name,int grade){
        this.name = name;
        this.grade = grade;
        
    }
    
    @Override
    public String toString(){      
        return "Name : " + this.name + " grade : " + this.grade;
    }

   
  
    
    
}
