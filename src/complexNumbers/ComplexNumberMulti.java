package complexNumbers;

public class ComplexNumberMulti {
	private int real;
	  private int imaginary;
	  
	  public ComplexNumberMulti(int real,int imaginary) {
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
	
	
	//(2+9i)(3-9i)=2(3)-2*9i+9i*3-81(-1);
	public void multiply(int real2,int imaginary2) {
		int real=this.real*real2+this.imaginary*imaginary2*(-1);
		//Don't use this.real to store   the output because that output will be used by imaginary number which will give wrong output
		int imaginary=this.real*imaginary2+this.imaginary*real2;
		this.setReal(real);
		this.setImaginary(imaginary);
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
