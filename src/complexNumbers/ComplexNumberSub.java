package complexNumbers;

public class ComplexNumberSub {
	 private int real;
	  private int imaginary;
	  
	  public ComplexNumberSub(int real,int imaginary) {
		  this.real=real;
		  this.imaginary=imaginary;
	  }

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImaginary() {
		return imaginary;
	}

	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	  
	public void sub(int real2,int imaginary2)
	{
	  this.real=this.real-real2;
	  this.imaginary=this.imaginary-imaginary2;
	  print();
	}

	public void print() {
		if(this.imaginary>=0)
			System.out.println(this.real+"+"+"i"+this.imaginary);
		else {
			System.out.println(this.real+"-"+"i"+this.imaginary*(-1));
		}
	}
}
