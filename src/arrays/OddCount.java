package arrays;
import java.util.Scanner;
public class OddCount {

Scanner sc = new Scanner(System.in);
	
	public void addElement(int arr[]) {
		for(int i =0;i<arr.length;i++) {
			System.out.println("Enter the element");
			arr[i] = sc.nextInt();
		}
		int a = oddCount(arr);
		System.out.println(a);
	}
	
	//step 1

	public int oddCount(int arr[]) {
		int count =0;
		for(int i =0;i<arr.length;i++) {
			if(!(arr[i]%2==0)) {
				count++;
			}
		}
		return count++;
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the array size");
		Scanner sc = new Scanner(System.in);
		OddCount oddcount = new OddCount();
		int n = sc.nextInt();
		int a[] = new int[n];
		oddcount.addElement(a);

}
}
