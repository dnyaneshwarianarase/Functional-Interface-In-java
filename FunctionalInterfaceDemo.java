package com.nit.predicate;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		Predictable p=num->num%2==0;
		int num=24;
		IO.println(p.verify(num));
	}

}
interface Predictable{
	boolean verify(int num);
}

