package complexNumbers;

public class ComplexNumberDiv {
	private float real;
	  private float imaginary;
	  
	  public ComplexNumberDiv(float real,float imaginary) {
		  this.real=real;
		  this.imaginary=imaginary;
	  }

	public float getReal() {
		return real;
	}

	public void setReal(float real) {
		this.real = real;
	}

	public float getImaginary() {
		return imaginary;
	}

	public void setImaginary(float imaginary) {
		this.imaginary = imaginary;
	}
	  
	//to divide complex numbers we need to multiply it with conjugates so that we can remove imaginary number in denominator
	//e.g- 2+3i/(4+6i) * 4-6i/(4-6i);
	//(4+6i)(4-6i)=(4)^2 - (6i)^2   i.e a^2-b^2 = (a-b)(a+b);
	
	public void Divison(float real2,float imaginary2) {
		float divisor=real2*real2-((imaginary2*imaginary2)*(-1));
		float real=(this.real*real2+this.imaginary*imaginary2*(-1)*(-1))/divisor;
	    float imaginary=(this.real*imaginary2*(-1)+this.imaginary*real2)/divisor;
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
