package fractions;

public class Fraction {

	private int numerator;
	private int denominator;
	
	//non parameterized constructor
	public Fraction() {
		
	}
	public Fraction(int numerator,int denominator) {
		this.numerator=numerator;
		this.denominator=denominator;
		simplify();//can use this.simplify but not requires because it is already method calling of a current calling object;
	}
	
	public int getNumerator() {
		return numerator;
	}
	public void setNeumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public void simplify() {
		int gcd=1;
		int smaller=Math.min(numerator,denominator);
		for(int i=1;i<=smaller;i++) {
			if(numerator%i==0&&denominator%i==0) {
				gcd=i;
			}
		}
		numerator=numerator/gcd;
		denominator=denominator/gcd;
	}
	
	public void sumOfTwoFractionInput(Fraction f1,Fraction f2) {
		//Fraction f3=new Fraction();
		numerator=f1.numerator*f2.denominator+f1.denominator*f2.numerator;
		denominator=f1.denominator*f2.denominator;
//		f3.setNeumerator(numerator);
//		f3.setDenominator(denominator);
//		return f3;
	}
	
	public void printSimplifiedFraction() {
		System.out.println(numerator+"/"+denominator);
	}
}
