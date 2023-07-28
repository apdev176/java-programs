package arrays;

public class SwapPosition {

	public static void main(String[] args) {
		int a[]= {1,4,6,8,2};
		int b=a.length-1;
		for(int i=0;i<a.length/2;i++) {
			int temp=a[i];
			a[i]=a[b];
			a[b]=temp;
			b--;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
	}

}

//you can use it to do reverse of an array
