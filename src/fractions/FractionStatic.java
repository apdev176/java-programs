package fractions;

public class FractionStatic {
	private int numerator;
	private int denominator;
	
	//Constructor
	public FractionStatic(int numerator,int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;	
	}
	public FractionStatic() {
		
	}


	public int getNumerator() {
		return numerator;
	}


	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}


	public int getDenominator() {
		return denominator;
	}


	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	//  non static method
	public void simplify() {
		int gcd =1;
		int smaller = Math.min(numerator, denominator);
		for(int i =1;i<=smaller;i++) {
			if(numerator%i == 0 && denominator%i == 0) {
				gcd = i;
			}
		}
		numerator = numerator/gcd;
		denominator = denominator/gcd;
	}
	public void increment() {
		numerator = numerator+denominator;
		simplify();
	}
	public void sumOfFraction(FractionStatic f2) {
		numerator = this.numerator*f2.denominator+this.denominator*f2.numerator;
		denominator = this.denominator*f2.denominator;
		simplify();
	}
	
	public static FractionStatic sumOfTwoFractionInput(FractionStatic f1,FractionStatic f2) {
        FractionStatic f3=new FractionStatic();
        //	Logic 
		f3.numerator = f1.numerator*f2.denominator+f2.numerator*f1.denominator;
		f3.denominator = f1.denominator*f2.denominator;
		f3.setNumerator(f3.getNumerator());
		f3.setDenominator(f3.getDenominator());
		return f3;
	}
	public void printSimplifiedFraction() {
		//simplify();
		System.out.println(numerator + "/" + denominator);
		
	}
}
