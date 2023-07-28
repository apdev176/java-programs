package programs;
import java.util.Scanner;

class Fibbonacci{
	public static void fibonacci(int x) {
		int first_num=0;
		int second_num=1;
		int count=x;
		for(int i=1;i<=count;i++) {
			System.out.print(first_num+" ");
			int temp=first_num+second_num;
			first_num=second_num;
			second_num=temp;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		fibonacci(num);
		
	}
}
