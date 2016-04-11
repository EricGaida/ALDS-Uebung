package ALDS;

public class ComplexNumber 
{
	/**
	* real and imaginary part
	*/
	protected double re, im;
	
	/**
	* constructor, default
	*/
	public ComplexNumber() 
	{
	}
	
	/**
	* constructor
	* @param x real part
	* @param y imaginary part
	*/
	public ComplexNumber(double x, double y) 
	{
		re=x;
		im=y;
	}
	
	 
	/**
	* constructor
	* @param a another ComplexNumber
	*/
	public ComplexNumber(ComplexNumber a) 
	{
		this.re=a.re;
		this.im=a.im;
	}

	public String toString() 
	{
		String z=re + " + " + im + " * i";
		return z;
	}
	
	/**
	* adds another complex number
	* @param a another ComplexNumber
	*/
	public void add(ComplexNumber a) 
	{
		this.re+=a.re;
		this.im+=a.im;
	}
	/**
	* subtracts another complex number
	* @param a another ComplexNumber
	* (a+i*b) - (c+i*d) = (a-c) + i*(b-d)
	*/
	public void sub(ComplexNumber a) 
	{
		this.re-=a.im;
		this.re-=a.im;
	}
	
	/**
	* multiplies another complex number
	* @param a another ComplexNumber
	* (a+i*b) * (c+i*d) = (a*c - b*d) + i*(a*d + b*c)
	*/
	public void mul(ComplexNumber a) 
	{
		this.re=this.re*a.re-this.im*a.im;
		this.im=this.re*a.im+this.im*a.re;
	}
	
	/**
	* divides by another complex number
	* @param a another ComplexNumber
	*   ((a*c) + (b*d)) / (c^2 + d^2)
	* + ((b*c) - (a*d))  / (c^2 + d^2))*i
	*/
	public void div(ComplexNumber a) 
	{
		this.re=(this.re*a.re+this.im*a.im)/(a.re*a.re+a.im*a.im);
		this.im=(this.im*a.re-this.re*a.im)/(a.re*a.re+a.im*a.im);
	}
	
	/**
	* negates this complex number
	*
	*/
	public void neg() 
	{
		this.re=0;
		this.im=0;
	}
	
	/**
	* calculates squared absolute value <BR>
	* (sum of squared real part and squared imaginary part)
	* @return squared absolute value
	*/
	public double absSquare() 
	{
		return this.re*this.re+this.im*this.im;
	}
	
	 
	/**
	* calculates absolute value <BR>
	* (root of sum of squared real part and
	* squared imaginary part)
	* @return absolute value
	*/
	public double abs() 
	{
		return Math.sqrt(this.re*this.re+this.im*this.im);
	}
	
	/**
	* access function; get real part
	* @return real part
	*/
	public double getReal() 
	{
		return this.re;
	}
	
	/**
	* access function; get imaginary part
	* @return imaginary part
	*/
	public double getImg() 
	{
		return this.im;
	}
	
	/**
	* access function; set real part
	* @param x new real part
	*/
	public void setReal(double x) 
	{
		this.re=x;
	}
	
	/**
	* access function; set imaginary part
	* @param y new imaginary part
	*/
	public void setImg(double y) 
	{
		this.im=y;
	}
	
	/**
	* calculates conjugate complex and
	* returns a corresponding new object
	* @return new ComplexNumber with conjugate complex
	*/
	public ComplexNumber con() 
	{
		ComplexNumber a=new ComplexNumber(this.re,-this.im);
		return a;
	}
	
	/**
	* copy constructor
	* @return copy of this ComplexNumber
	*/
	public ComplexNumber copy() 
	{
		ComplexNumber a=new ComplexNumber(this.re,this.im);
		return a;
	}
	
	
}