// Does'nt keep the order of data, don't stores duplicates.

import java.util.HashSet;
import java.util.Iterator; // Conceptual thing, rarely used in real world programming.

public class Main{
	public static void main(String[] args){
	    
	    HashSet<Integer> hashset = new HashSet<>();  
	    
	    //Add to HashSet O(1)
	    hashset.add(10);
	    hashset.add(14);
	    hashset.add(10);
	    hashset.add(12);
	    hashset.add(14);
	    hashset.add(11);
	    hashset.add(17);
	    hashset.add(18);
	    hashset.add(17);
	    System.out.println(hashset);
	    
	    
	    //Search in HashSet O(1)
	    System.out.println(hashset.contains(10));
	    System.out.println(hashset.contains(20));
	    
	    
	    //Remove from HashSet O(1)
	    hashset.remove(11);
	    System.out.println(hashset);
	    
	    
	    //Iterating over HashSet O(n)
	    Iterator i = hashset.iterator(); // A cursor from the collections framework.
	    
	    System.out.println(i.next());    // prints next element, gives NoSuchElementException if i is at the end.(next = null basically).
	    System.out.println(i.hasNext()); // returns bool.
	    
	    // Iterators can't be reset so it is printing from 2nd element.
	    while(i.hasNext() != false){
	        System.out.print(i.next() + "   "); // automatically dos that i++ thing.
	    }
	    System.out.println();
        
        
        	//Size of HashSet
	        System.out.println(hashset.size());
	       
	}
}
