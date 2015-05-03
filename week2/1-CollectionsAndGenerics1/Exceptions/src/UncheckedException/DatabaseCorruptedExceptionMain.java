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
public class DatabaseCorruptedExceptionMain {
    
        public static void main(String[] args) {        
        throwANewDatabaseCorruptedException();
    }
    
    public static void throwANewDatabaseCorruptedException() {
        throw new DatabaseCorruptedException();
    }
}
