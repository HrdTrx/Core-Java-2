/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UncheckedException;

/**
 *
 * @author root
 */
public class DatabaseCorruptedException extends RuntimeException {
    private static final String WarningMessage = "Username field can't be empty.";
    
        private String ExceptionMessage;
    
    public DatabaseCorruptedException(String ErrorMessage) {
        this.ExceptionMessage = ErrorMessage;
    }
    
    public DatabaseCorruptedException() {
        this(WarningMessage);
    }

    @Override
    public String getMessage() {        
        return this.ExceptionMessage;
    } 
}
