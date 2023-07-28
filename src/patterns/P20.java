package patterns;

import java.util.Scanner;

public class P20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int start=1;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n;j++) {
				if(j>=i) {
					System.out.print(start);
					start++;
				}
				if(j<i)
					System.out.print(" "); 
			}
			System.out.println();
		}

	}

}
//OR
/*
int n=5;
int temp=1;
for(int i=1;i<=n;i++) {
  for(int space=1;space<=n-1;space++){
   System.out.print(" ");
   }
   for(int j=1;j<=i;j++) {
	System.out.print(temp);
	temp++;
	}
	System.out.println();
 
 }


*/
