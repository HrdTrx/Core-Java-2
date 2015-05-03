/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NullKeyException;

/**
 *
 * @author root
 */
public class NullKeyException extends IllegalArgumentException {
    private static final String WarningMessage = "The Extended HashMap doesn't allow null key by default.If you want to use such value,activate it using the setNullAllowed method! ";
    
    private String ExceptionMessage;
    
    public NullKeyException(String message) {
        this.ExceptionMessage = message;
    }
    
    public NullKeyException() {
        this(WarningMessage);
    }

    @Override
    public String getMessage() {
        return this.ExceptionMessage;
    } 
}
