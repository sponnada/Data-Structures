/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmapwordbag;
import java.util.*;
/**
 *
 * @author Sri
 */
public class HashMapWordBag {
    HashMap<String,Integer> hm;

    public HashMapWordBag() {
        hm = new HashMap<String,Integer>();
    }

    //add an occurance of word to the bag
    public void addOccurance(String word) { //O(1)
        if (hm.containsKey(word)) { //check to see if hashmap contains the word
            int value = hm.get(word); //if it does, get the value/frequency
            value = value + 1; //increment the frequency
            hm.put(word, value); //put the key, value pair back into the hashmap
        }
        
        else {
            hm.put(word, 1); //or make a new key, value pair for the word and its frequency
        }
    }
    
    //remove an occurance of word from the bag
    public void removeOccurance(String word) { //O(1)
        if (hm.containsKey(word)) { //check to see if hashmap contains the word
            int value = hm.get(word); //if it does, get the value/frequency
            if (value == 1) { //if the value is one
                hm.remove(word); //remove the word since it'll have 0 frequency when this occurance is removed
            }
            else{
                value = value - 1; //else decrement the frequency by 1
                hm.put(word, value); //put the key, value pair back into the hashmap
            }
        }
    }
    
    //return the most frequent string in the bag
    public String mostFrequent(){ //O(n)
        String mF = ""; //set a variable to keep track of the most frequent word
        int maxfreq = 0; //set a variable to keep track of the highest frequency
        for (String s : hm.keySet()) { //iterate through the set of keys
            if (hm.get(s) > maxfreq) { //get the value for each key and compare it to the max frequency
                maxfreq = hm.get(s); //change the max frequency based on the results of the comparison
                mF = s; //change the most frequent word
            }
            
            
        }
        return mF; //return the most frequent word
    }
   
    //return number of distinct words
    public int numberOfWords() { //O(1)
        return hm.size(); //return the size
    }
    
    //return number of occurances of word in bag
    public int getFrequency(String word) { //O(1)
        Integer integer = hm.get(word); //get the value of the key
        if (integer == null) { //if the value is null, then the frequency is 0
            return 0; //return 0
        }
        return integer; //or else return the value/frequency
    }
       
    
    public static void main(String[] args) {
        HashMapWordBag map = new HashMapWordBag();
        
        map.addOccurance("boo");
        map.addOccurance("loo");
        map.addOccurance("boo");
        map.addOccurance("loo");
        map.addOccurance("loo");
        map.addOccurance("woo");
        map.addOccurance("doo");
        map.addOccurance("poo");
        System.out.println(map.getFrequency("boo"));
        System.out.println(map.getFrequency("woo"));
        System.out.println(map.getFrequency("loo"));
        System.out.println(map.mostFrequent());
        map.removeOccurance("loo");
        map.removeOccurance("loo");
        System.out.println(map.mostFrequent());
        map.removeOccurance("woo");
        System.out.println(map.getFrequency("woo"));
        
        
        
    }
}