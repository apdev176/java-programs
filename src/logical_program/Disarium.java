package logical_program;
import java.util.Scanner;
public class Disarium {
	public static boolean isDisarium(int num)
	{
		int temp=num;
		int temp2=num;
		int count=0;
		int sum=0;
		
		//count
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		
		//operation
		while(temp2>0)
		{
			int product=1;
			int last_digit=temp2%10;
			temp2=temp2/10;
			
			for(int i=1;i<=count;i++) {
				product=product*last_digit;
			}
			sum=sum+product;
			count--;
		}
		if(sum==num)
			return true;
		else 
			return false;
		
  }
public static void main(String[] args) {
	System.out.println("Enter the number:");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	boolean res=isDisarium(num);
	System.out.println(res);
}
}
