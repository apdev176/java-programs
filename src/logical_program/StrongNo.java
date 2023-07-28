package logical_program;
import java.util.Scanner;

public class StrongNo {
	public static boolean isStrongNo(int num)
	{
		int temp=num;
		int sum=0;
		while(temp>0)
		{   int fact=1;
			int last_digit=temp%10;
			for(int i=1;i<=last_digit;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		if(sum==num) {
			return true;
		}
		else {
			return false;
		}
		
	}
public static void main(String[] args) {
	System.out.println("enter the number:");
	Scanner sc=new Scanner(System.in);
	 int num=sc.nextInt();
	 boolean res=isStrongNo(num);
	 System.out.println(res);
}
}
