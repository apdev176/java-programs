package patterns;

import java.util.Scanner;

public class P28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j>=i) 
				System.out.print("*");
				else 
				System.out.print(" ");
			}
			System.out.println();
			}
	}
}


//OR
/*

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int space=1;space<i;space++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print("*");
				
			}
			
			System.out.println();
	}

	}

*/