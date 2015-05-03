/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BracketExpression;

/**
 *
 * @author root
 */
public class BracketExpressionMain {
    public static void main(String[] args){
        String stringTest = "((()))()()";
        System.out.println(ExpressionOfBrackets.expressionOfBrackets(stringTest));
    }
}
