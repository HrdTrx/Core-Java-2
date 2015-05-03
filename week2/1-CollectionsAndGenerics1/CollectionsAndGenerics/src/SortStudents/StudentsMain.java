/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortStudents;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author root
 */
public class StudentsMain {
    public static void main(String[] args){
        Student studentOne = new Student("Android",6);
        Student studentTwo = new Student("AndroidTwo",3);
        Student studentThree = new Student("NotSoAndroid",6);
        Student studentFour= new Student("TestingName",3);
        Student studentFive = new Student("Random",4);
        
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(studentOne);
        listStudent.add(studentTwo);
        listStudent.add(studentThree);
        listStudent.add(studentFour);
        listStudent.add(studentFive);
        
        Collections.sort(listStudent,new CompareStudents());
        
        System.out.println(listStudent.toString());
    }
}
