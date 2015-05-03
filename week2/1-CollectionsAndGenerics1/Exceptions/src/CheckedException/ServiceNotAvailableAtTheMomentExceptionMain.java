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
public class ServiceNotAvailableAtTheMomentExceptionMain {
        public static void main(String args[]) {
        try {
            throwANewServiceNotAvailableAtTheMomentException();
        } catch (ServiceNotAvailableAtTheMomentException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void throwANewServiceNotAvailableAtTheMomentException() throws ServiceNotAvailableAtTheMomentException {
        throw new ServiceNotAvailableAtTheMomentException("No connection to the internet.Try again later.");
    }
}
