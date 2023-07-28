package fractions;

public class FractionDriver {

	public static void main(String[] args) {
		Fraction f1=new Fraction(6,4);
		
		Fraction f2=new Fraction(3,2);
		
		Fraction f3=new Fraction();
	
		f3.sumOfTwoFractionInput(f1, f2);
		f3.simplify();
		f3.printSimplifiedFraction();
	
	}

}
