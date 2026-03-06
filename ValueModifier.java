package com.nit.lambda_functional_programming;

import java.util.function.Consumer;
public class ValueModifier{
	
	public static void modifyValue(double v,Consumer<Double> c)
	{
		c.accept(v);
	}
			
	public static void main(String[] args) 
	{
		double num=Double.parseDouble(IO.readln("Enter number"));
		IO.println("Original value: "+num);
		
		Consumer<Double>doubleval=(n)->IO.println("After doubling the value: "+2*n);
		Consumer<Double>increamentVal=(n)->IO.println("After incrementing the value by "+3+": "+(n+3));
		Consumer<Double>makeSquare=(n)->IO.println("After squaring the value: "+(n*n));

		modifyValue(num, doubleval);
		modifyValue(num, increamentVal);
		modifyValue(num, makeSquare);
	}
}

	
