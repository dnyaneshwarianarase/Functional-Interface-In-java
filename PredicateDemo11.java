package com.nit.predicate;

import java.util.function.Predicate;

public class PredicateDemo11 {

	public static void main(String[] args) {
		Predicate<Integer>p1=age->age>=18;
		int age=Integer.parseInt(IO.readln("Enter a age: "));
		boolean isEligible =p1.test(age);
		if(isEligible) {
			IO.println("Eligible for Vote");
			
		}
		else {
			IO.println("No Eligible for Vote");
		}
		
		

	}

}
