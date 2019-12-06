package sort;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class sorting 
{ 
    void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                   
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 
  
  

  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
    	sorting ob = new sorting(); 
        int arr[] = {2,3,0,-2,-2,4,4,2,2}; 
        ob.sort(arr); 
       
        
        Map<Integer , Integer> data= new HashMap<Integer , Integer>();
        
        for (int i : arr) {
			if (data.containsKey(i)) {
				data.put(i, data.get(i)+1);
			}else {
				data.put(i, 1);
			}
		}
        
        Set< Map.Entry< Integer,Integer> > st = data.entrySet();    
        
        for (Map.Entry< Integer,Integer> me:st) 
        { 
            System.out.println("occurnce of  =>"+me.getKey()+":"+me.getValue()); 
           
        } 
        
        
        
    } 
} 