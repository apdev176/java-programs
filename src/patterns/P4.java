package patterns;
import java.util.Scanner;
public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n =sc.nextInt();
		for(int i=1; i<=n;i++) {
			for(int j=n; j>=1;j--){
				System.out.print(" "+ j);			
				}
			System.out.println();
		}
				
		
	}

}
/* 
 for(int i=1; i<=n;i++) {
 int k=n;
for(int j=1; j<=n;j++){
	System.out.print(" "+ k);			
	k--;
	}
System.out.println();
}
 */
