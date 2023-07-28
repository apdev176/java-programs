package patterns;
import java.util.Scanner;
public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n =sc.nextInt();
		int x=n;
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=n;j++){

				System.out.print(" "+ x);			
				
				}
			x--;
			System.out.println();
		}
				
		
	}

}

//don't use this approach since this change i's purpose
/* for(int i=n;i>=1;i--){
for(int j=1; j<=n; j++){
System.out.print(i)
}
System.out.println()
}
}*/