package programs;

public class MissingNumber {

	public static void main(String[] args) {
		int a[]= {10,20,9,10,40};
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
		
		int b[]= {10,20,10,40};
		int sum2=0;
		for(int i=0;i<b.length;i++) {
			sum2=sum2+b[i];
		}
		
		System.out.println(sum1-sum2);

	}

}


