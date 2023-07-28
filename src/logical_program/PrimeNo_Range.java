package logical_program;
import java.util.Scanner;
public class PrimeNo_Range {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
  System.out.println("enter first number:");
  int first=sc.nextInt();
  System.out.println("enter last number:");
  int last=sc.nextInt();
  for(int i=first;i<=last;i++) {
	  int count=0;
	  for(int j=1;j<=i;j++) {
		  if(i%j==0)
			  count++;
	  }
	  if(count==2) {
		  System.out.println(i);
	  }
		  
  }
}
}
