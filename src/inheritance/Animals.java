package inheritance;

public class Animals {
 public Animals() {
	super();
   System.out.println("Animal Constructor is called");
}  

 //non static method
 public void eat() {
	System.out.println("Animal is eating");
}
 
 //static method
 public static void drink()
 {
	 System.out.println("Animal is drinking");
 }
}
