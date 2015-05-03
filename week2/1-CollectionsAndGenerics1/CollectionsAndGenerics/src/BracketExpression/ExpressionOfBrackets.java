/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BracketExpression;



import java.util.Stack;

/**
 *
 * @author root
 */
public class ExpressionOfBrackets {
    
    public String expression;
    
    public ExpressionOfBrackets(){
        
    }
    
    public static boolean expressionOfBrackets(String expression){
       Stack<Character> stack = new Stack<Character>();

        for(char chr : expression.toCharArray())
        {
            switch(chr) {
                case '(':
                    stack.push(chr);
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
    
}
