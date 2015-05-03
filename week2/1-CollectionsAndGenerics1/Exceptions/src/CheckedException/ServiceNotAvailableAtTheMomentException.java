/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CheckedException;

/**
 *
 * @author root
 */
public class ServiceNotAvailableAtTheMomentException extends Exception {
    private static final String WarningMessage = "Service currently unavailable." + 
" Try again later or contact your system administrator.";
    
    private String ExceptionMessage;
    
    public ServiceNotAvailableAtTheMomentException(String message) {
        this.ExceptionMessage = message;
    }
    
    public ServiceNotAvailableAtTheMomentException() {
        this(WarningMessage);
    }

    @Override
    public String getMessage() {        
        return this.ExceptionMessage;
    }  
}
