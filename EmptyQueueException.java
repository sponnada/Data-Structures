//Sri Ponnada

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayqueue;

/**
 *
 * @author Sri
 */
public class EmptyQueueException extends RuntimeException {
    
    
    /*
     * Creates a new instance of
     * EmptyQueueException without detail message.
     */
    public EmptyQueueException() {
    }

    /*
     * Constructs an instance of
     * EmptyQueueException with the specified detail message.
     *
     * 
     */
    public EmptyQueueException(String msg) {
        super(msg);
    }
}