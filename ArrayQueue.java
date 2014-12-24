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
public class ArrayQueue<E> implements Queue<E> {
    
    E [] Q; //the array to store the elements of the queue
    int f,r;//roughly, the front and rear of the queue, but see 5.2.2 of text
    int size;//the number of elements in the queue

    static final int CAPACITY = 10; //default length of array Q
    int capacity; // actual length of array  Q

    public ArrayQueue() {
        this(CAPACITY);
    }

    public ArrayQueue(int cap){
        capacity = cap;
        Q = (E []) new Object[capacity];
        f = 0;
        r = 0;
        size = 0;
    }
    public int size(){return size;} //return the size
        
    @Override
    public boolean isEmpty(){return size == 0;} //check if it's zero
    
    @Override
    public E front() throws EmptyQueueException {
        if (isEmpty()) //check queue to see if it's empty 
                throw new EmptyQueueException("Queue is empty.");  //throw an exception
        return Q[f]; //return where the front is
    }
    
    @Override
    public void enqueue(E element) throws FullQueueException {
        if (size == capacity) //check if size is equal to the capacity (if the queue is full)
            throw new FullQueueException("Queue is full."); //throw an exception
        Q[r] = element; //set the rear to the element
        r = (r+1)% capacity; //use mod because this is a circular array
        size = size + 1;  //increase the queue's size
    }
    
    @Override
    public E dequeue() throws EmptyQueueException {
        if (isEmpty()) //if the queue is empty
           throw new EmptyQueueException("Queue is empty."); //throw an exception
        E temp = Q[f]; //set temp to the front
        Q[f]= null; //set the front to null
        f = (f+1)% capacity; 
        size = size - 1; //decrease size
        return temp; //rturn the front which was stored as temp
        
     
    } 
    
    public static void main(String[] args) {
       ArrayQueue <Integer> arrayTest =  new ArrayQueue <>(); 
       arrayTest.enqueue(100);
       arrayTest.enqueue(100);
       arrayTest.enqueue(100);
       arrayTest.enqueue(120);
       arrayTest.enqueue(220);
       arrayTest.enqueue(220);
       System.out.print(arrayTest.dequeue());
  }
