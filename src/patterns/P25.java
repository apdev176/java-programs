package patterns;

import java.util.Scanner;

public class P25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int temp=n;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				char ch=(char)('A'+temp+(j-2));
				System.out.print(ch);
				
			}
			temp--;
			System.out.println();
	}
	}

	
}
