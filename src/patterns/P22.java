
package patterns;
import java.util.Scanner;
public class P22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			 int temp=i;
			for(int space=1;space<=n-i;space++)
			{
			System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
			System.out.print(temp);
			temp--;
			}
			System.out.println();
	}

	}

}
