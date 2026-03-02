package com.nit.predicate;

import java.util.function.Predicate;

public class NameStartsWIths {

	public static void main(String[] args) {
		Predicate<String>p2=name->name.startsWith("A");
		String name=IO.readln("Enter a Name:");
		boolean isStart=p2.test(name);
		if(isStart) {
			IO.println("Starts with A");
		}
		else {
			IO.println("Not starts with");
		}
	}
}
