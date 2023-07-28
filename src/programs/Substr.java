package programs;

public class Substr {
	
	public static int substr(String og,String sub) {
		int org=og.length();
		int substr=sub.length();	
	
		for(int i=0;i<=org-substr;i++) {
			int j;
			for(j=0;j<substr;j++)
			if(og.charAt(i+j)!=sub.charAt(j)){
				break;
			}
			if(j==substr)
				return 1;
			
		}
		return -1;
	}
	public static void main(String[] args) {
	   
		int num=substr("helo", "hell0");
		if(num==1) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
	}
}
