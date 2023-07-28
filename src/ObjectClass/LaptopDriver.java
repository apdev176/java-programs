package ObjectClass;

public class LaptopDriver {
public static void main(String[] args) {
	
		Laptop l1 =  new Laptop("Ideal pad","Lenevo",5.94,45000);
		Laptop l2 =  new Laptop("Ideal pad","Lenevo",5.94,45000);
	
		System.out.println(l1==l2);
		System.out.println(l1.equals(l2));
		
		int a =l1.hashCode();
		int b =l2.hashCode();
		System.out.println(a);
		System.out.println(b);
	}
}

