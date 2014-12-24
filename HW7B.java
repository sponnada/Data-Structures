/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw7b;
import java.util.*;

/**
 *
 * @author Sri
 */
public class HW7B {

    
    public static boolean haveCommonElements(ListIterator<Integer> itr1, ListIterator<Integer> itr2) { //O(n^3)
        while (itr1.hasNext()) { //check to see if the list has more elements
            Integer n1 = itr1.next(); //if so, create a variable to hold the next element
            //System.out.println(n1); 
            while (itr2.hasNext()) { //check to see if second list has more elements
                Integer n2 = itr2.next(); //if so, create a variable to hold the next element
              //  System.out.println(n2);
                if (n1 == n2) //if the elements are the same
                    return true; //return true
                
            }
            
            while(itr2.hasPrevious()) { //reset the iterator for the second list
                    Integer n2 = itr2.previous(); //check to see if the list has more elements and get it
                //    System.out.println(n2);
                    if (n1 == n2) //if the elements are the same
                        return true; //return true
                }
            
        }
        return false; //or else return false
    }
    
    
  public static void main(String[] args) {
      ArrayList<Integer> list1 = new ArrayList<Integer>();
      ArrayList<Integer> list2 = new ArrayList<Integer>();
      list1.add(10);
      list1.add(13);
      list1.add(24);
      list1.add(24);
      ListIterator<Integer> itr1 = list1.listIterator();
      
      list2.add(11);
      list2.add(22);
      list2.add(24);
      list2.add(20);
      ListIterator<Integer> itr2 = list2.listIterator();
      System.out.println(haveCommonElements(itr1, itr2));
   
  }
}