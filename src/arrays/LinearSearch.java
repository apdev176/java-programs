package arrays;

public class LinearSearch {

	
//	Algorithm:
//
//		Step 1: Traverse the array
//		Step 2: Match the key element with array element
//		Step 3: If key element is found, return the index position of the array element
//		Step 4: If key element is not found, return -1
	
	public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }   
	public static void main(String[] args) {
		int[] a1= {10,23,50,30,75,90};    
        int key = 50; 
        int index=linearSearch(a1, key);
        if(index==-1)
        System.out.println(key+" is not present"); 
        else 
        	System.out.println(key+" is found at index: "+index);
		
	}

}

//but linear search good only if data is small if data is big than we go for binary search
