package ObjectClass;

import java.util.Objects;

public class Laptop {

	String name;
	String brand;
	double ram_capacity;
	int price;
	
	Laptop(String name,String brand,double ram_capacity,int price){
		this.name = name;
		this.brand = brand;
		this.ram_capacity = ram_capacity;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + " " +brand +" "+ram_capacity+" "+price;
	}
	public boolean equals(Object obj) {
		Laptop lap = (Laptop)obj;
		if(this.name == lap.name && this.brand == lap.brand) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,brand,ram_capacity,price);
		
	}

}
