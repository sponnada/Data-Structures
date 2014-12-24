/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayqueue;

/**
 *
 * @author Sri
 */
public interface Queue<F> {
    
    
    public int size();
    public boolean isEmpty();
    public F front() throws EmptyQueueException;
    public void enqueue(F element);
    public F dequeue() throws EmptyQueueException;
    
}