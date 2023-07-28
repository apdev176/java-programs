package programs;
public class SecondLargestElement {
   

    public static void main(String[] args) {
        int[] arr = { -10,-1,-5,-1,1};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        		
        
        for (int i = 0; i < arr.length; i++) {
        	if(arr[i] != largest) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && secondLargest<largest ) {
                secondLargest = arr[i];
            }
        }
        }
       
        System.out.println(largest+" " + secondLargest);
    }
}
