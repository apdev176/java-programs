package arrays;

public class SmallLargeElement {

	public static void main(String[] args) {
		int a [] = {100,5,3,7,8,98,45,65};
		int smallest =returnSmallest(a);
		System.out.println("smallest number in array " + 
		smallest);
		int largest =returnLargest(a);
		System.out.println("largest number in array " + largest);
	}
	public static int returnSmallest(int arr[]) {
		int small = arr[0];
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]<small) {
				small = arr[i];
			}
		}
		return small;
		
	}
	public static int returnLargest(int arr[]) {
		int large = arr[0];
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>large) {
				large = arr[i];
			}
		}
		return large;
		
	}

}
