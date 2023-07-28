package arrays;

import java.util.Arrays;


public class BinarySearch {

	public static void main(String[] args) {
	 int arr[]= {7,4,2,1,9,8};
	 int key=9;
	Arrays.sort(arr);
	 int low=0;
	 int high=arr.length-1;
	 while(low<=high) {
		 int mid=(low+high)/2;
		 if(key==arr[mid]) {
			 System.out.println("found "+key+" at index "+mid);
			 break;
		 }
		 else if(key>arr[mid]) {
			 low=mid+1;
		 }
		 else //key<arr[mid]
			 high=mid-1;
	 }
	 if(low>high)
		 System.out.println(key+" not found");

	}

}
