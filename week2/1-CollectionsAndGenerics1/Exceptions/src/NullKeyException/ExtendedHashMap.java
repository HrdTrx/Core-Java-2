/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NullKeyException;

import java.util.HashMap;

/**
 *
 * @author root
 * @param <T>
 * @param <E>
 */
public class ExtendedHashMap<T,E> extends HashMap<T,E> {
    private static final boolean NullAllowed = false;
    private boolean isNullAllowed;
    
    public ExtendedHashMap (boolean isNullAllowed) {
        setNullAllowed(isNullAllowed);
    }
    
    public ExtendedHashMap() {
        this(NullAllowed);
    }
    
    public boolean isNullAllowed() {
        return this.isNullAllowed;
    }

    public void setNullAllowed(boolean isNullAllowed) {
        this.isNullAllowed = isNullAllowed;
    }

    @Override
    public E get(Object key) {
        checkKey(key);
        E output = (E)super.get(key);
        return output;
    }

    @Override
    public E put(T key, E value) {
        checkKey(key);
        E output = super.put(key, value);
        return output;
    }   
    

    private void checkKey(Object key) {
        if (key == null && !this.isNullAllowed()) {
            throw new NullKeyException();
        }
    }
 
    
}
