package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {3,25,45,62,38,43,1,5,2,23};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k=0;k<a.length;k++) {
			System.out.print(a[k]+" ");
		}

	}

}
