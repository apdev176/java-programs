package patterns;

import java.util.Scanner;

public class P15 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of n");
	int n=sc.nextInt();
	
	for(int i=1;i<=n;i++) {
		char ch='A';
		for(int j=1;j<=i;j++) {
			System.out.print(ch);
			ch++;
		}
		System.out.println();
	}
}
}
