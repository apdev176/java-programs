package patterns;

import java.util.Scanner;




public class P33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		
		for(int i=n;i>=1;i--) {
			int temp=i;
			for(int j=1;j<=i*i;j++) {
				System.out.print(temp);
				if(j%i==0)
					temp--;
		}
			System.out.println();
	}
}
}
