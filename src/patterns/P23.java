package patterns;

import java.util.Scanner;

public class P23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int space=1;space<=n-i;space++)
			{
			System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				if(i%2==0)
			      System.out.print("0");
				else 
                   System.out.print("1");
			}
			System.out.println();

	}

}
}
