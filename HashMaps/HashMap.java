// Does'nt keep the order of data, keeps the data in key value pairs where keys are unique.

import java.util.Set;
import java.util.Map;
import java.util.HashMap;


public class Main{
	public static void main(String[] args){
	    
	    HashMap<String , Integer> map = new HashMap<>(); // <Key , Value>
	    
	    //Add to HashMap O(1)
	    map.put("Levrone" , 0);
	    map.put("Arnold" , 7);
	    map.put("Ronnie" , 8);
	    map.put("Cutler" , 4);
	    System.out.println(map);
	    
	    
	    //Search in HashMap O(1)
	    System.out.println(map.get("Cutler")); // returns null if key is not present.
	    System.out.println(map.containsKey("Levrone")); // returns bool.
	    
	    
	    //Remove from HashMap O(1)
	    map.remove("Arnold");
	    System.out.println(map);	

		
	    //Update in HashMap O(1)
	    map.put("Levrone" , 2); // Adding again with same key updates the entry.
	    System.out.println(map);
	    
	    
	    //Printing using entrySet O(n)
        for(Map.Entry<String , Integer> i : map.entrySet()){ // for(type variable : collection)
            System.out.print(i.getKey() + "  ");
            System.out.print(i.getValue() + "   ");
        }	   
        System.out.println();
        
        
        //Printing using keySet O(n)
        Set<String> keys = map.keySet(); // making a Set of keys.
        
        for(String key : keys){
            System.out.print(key + "  " + map.get(key) + "   ");
        }
	System.out.println();
        
        
        //Size of HashMap
        System.out.println(map.size());

		
	//Copying one map in another map.
        HashMap<String , Integer> map2 = new HashMap<String , Integer>(map);
        System.out.println(map2);
	    	
	        
	}
}
