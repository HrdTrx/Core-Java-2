/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortStudents;

import SortStudents.Student;
import java.util.Comparator;

/**
 *
 * @author root
 */
public class CompareStudents implements Comparator<Student> {
    
 @Override
 public int compare(Student studentOne,Student studentTwo){
        if(studentOne.grade < studentTwo.grade){
            return 1;
        }
        else if(studentOne.grade > studentTwo.grade) { 
            return -1; 
        }
        else return studentOne.name.compareTo(studentTwo.name);
    }

  
   
}
