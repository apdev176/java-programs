package fractions;

public class FractionStaticDriver {
	public static void main(String[] args) {
		FractionStatic f1 = new FractionStatic(8,4);
		//f1.increment();
		//f1.printSimplifiedFraction();
		
		FractionStatic f2 = new FractionStatic(3,2);
		FractionStatic f3=FractionStatic.sumOfTwoFractionInput(f1, f2);
		f3.simplify();
		f3.printSimplifiedFraction();
	}
}

