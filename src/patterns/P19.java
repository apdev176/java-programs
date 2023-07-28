package patterns;

import java.util.Scanner;

public class P19 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of n");
	int n=sc.nextInt();
	
	for(int i=1;i<=n;i++) {
		int temp=i;
		int temp2=n-1;
         for(int j=1;j<=i;j++) {
			System.out.print(temp+" ");
			temp=temp+temp2;
			temp2--;
		}
         System.out.println();
	}
		
}
}
