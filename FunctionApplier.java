package com.nit.lambda_functional_programming;

import java.util.function.Function;

public class FunctionApplier {
	public static int applyFunction(int value,Function<Integer, Integer>f1) {
		 return f1.apply(value);
	}

	public static void main(String[] args) {
		
		int number=Integer.parseInt(IO.readln("Enter a number: "));
	
		Function<Integer,Integer>add=(num)->{
			return num+5;
		
		};
		Function<Integer,Integer>mult2=(num)->{
			return 2*num;
		};
		
		Function<Integer,Integer>sub=(num)->{
			return num-3;
		};
		IO.println("Original value: "+number);
		IO.println("After adding 5: "+applyFunction(number,add));
		IO.println("After multiplying by 2: "+applyFunction(number,mult2));
		IO.println("After subtracting 3: "+applyFunction(number,sub));
	}
		
}
