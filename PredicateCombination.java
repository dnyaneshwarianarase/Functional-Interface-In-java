package com.nit.predicate;

import java.util.function.Predicate;

public class PredicateCombination {

	public static void main(String[] args) {
		Predicate<String>startsWith=name->name.startsWith("R");
		Predicate <String>nameLength=name->name.length()>3;
		
		Predicate<String>p1=startsWith.and(nameLength);
		boolean isValid=p1.test("Ravi");
		IO.println(isValid);
	}
}

