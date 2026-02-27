package com.nit.predicate;

import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String[] args) {
		Predicate <String>startWith=name ->name.startsWith("D");
		Predicate <String>namelength=name->name.length()>3;
		
		Predicate<String>p1=startWith.and(namelength);
		boolean isValid=p1.test("Dnyaneshwari");
		IO.println(isValid);
		
	}

}

