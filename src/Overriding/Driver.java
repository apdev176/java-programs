package Overriding;

public class Driver {

	public static void main(String[] args) {
		Child ch= new Child();
		ch.m1();
		Parent p=new Child();
		p.m1();

	}

}
