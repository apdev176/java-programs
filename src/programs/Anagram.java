package programs;
import java.util.HashMap;
import java.util.Map;

//worth and throw are anagram
	public class Anagram
	{
		
		
	    public static boolean checkAnagram (String str1,String str2){
	        if(str1.length()!=str2.length()){
	            return false;
	        }
	        else{
	            String same="";
	            for(int i=0;i<str2.length();i++){
	                char st2=str2.charAt(i);
	                for(int j=0;j<str1.length();j++){
	                    if(st2==str1.charAt(j))
	                      same=same+st2;
	                }
	            }
	            System.out.println(same);
	            if(same.equals(str2))
	             return true;
	            else
	             return false;
	        }
	        
	    }
		public static void main(String[] args) {
		    String str1="worth";
		    String str2="throw";
		    boolean check=checkAnagram(str1,str2);
			if(check==true){
			   System.out.println("anagram");
			}
			else{
			    System.out.println("not anagram");
			}
		}
	}


