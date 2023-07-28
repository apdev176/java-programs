package patterns;

import java.util.Scanner;

public class P17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			char ch='A';
			for(int j=1;j<=i;j++) {
				if(i==j||j==1||i==n)
				{
				System.out.print(ch);
				
				}
				else {
					System.out.print('_');
				}
				ch++;
			}
			System.out.println();
		}
	}

}
