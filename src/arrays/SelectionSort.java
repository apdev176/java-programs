package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int a[]= {3,25,45,62,38,43,1,5,2,23};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k=0;k<a.length;k++) {
			System.out.print(a[k]+" ");
		}


	}

}
