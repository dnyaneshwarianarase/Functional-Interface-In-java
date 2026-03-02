package com.nit.lamdaMcq;
/*
public class lambadaDemo2 {

	public static void main(String[] args) {
		/*{
			int a = 10;
			Add add = (int b) -> b;
			System.out.println(add.add(a));
		}
		*/
		/*
		{
			int a = 21;
			
			Cube cube = b -> b*b*b;
			System.out.println(cube.cube(a));
		}
		*/
		/*
		{
		

			{
				Str str = (String s) -> 2;
				System.out.println(str.methodStr("2"));
			}
		}
		*/
		/*
		{
			String str=str -> str.equals("goolge");
			System.out.println(str);
		}
		*/

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/*
	public static void main(String[] args) {
		NI nit = (str) -> str +"Welcome to"; // str concatenate to "Welcome to" 
		NI nit1 = (str) -> str + "NARESHIT"; // str1 concatenate to "NARESHIT"
		information("Hai ", nit); // HAI + Welcome to
		information("Hai ", nit1); // HAI + NARESHIT
	}
	public static void information(String str, NI obj) {
		String result = obj.get(str);
		System.out.println(result);
	}
	*//*
	public class lambadaDemo2 implements NIT1{
		 public static void main(String[] args){
		     int a = 25;
		     int b = 5;
		     lambadaDemo2 fun = new lambadaDemo2();
		     int add = fun.add(a,b);
		     int sub = fun.sub(a,b);
		     int mul = NIT1.multiply(a,b);
		     int div = NIT1.divide(a,b);
		     System.out.println(add+" "+sub+" "+mul+" "+div+" "+fun.square(6));
		} 
		 @Override
		 public int square(int x) {
		     return x*x;
		 }
		 
		}
	
	
	*/


	

	

interface Add1
{
	int add(int b);
}

interface Cube
{
	int cube(int b);
}

interface Add
{
	int add(int b);
}

@FunctionalInterface
interface Str
{
	int methodStr(String str);
}


@FunctionalInterface
interface NI
{
	String get(String nit);
}
/*
@FunctionalInterface
interface N
{
	String myInterface(String a);
	String newInterface();
	
}
*/


@FunctionalInterface
interface NIT1{
 int square(int x);
 default int add(int a, int b){
     return a+b;
 }
 default int sub(int a, int b){
     return a-b;
 }
 static int multiply(int a, int b){
     return a*b;
 }
 static int divide(int a, int b){
     return a/b;
 }
 
}
/*

@FunctionalInterface
interface NIT2{
 int square(int x);
 static int add(int a, int b){
     return a+b;
 }
 static int sub(int a, int b){
     return a-b;
 }
 static int multiply(int a, int b){
     return a*b;
 }
 static int divide(int a, int b){
     return a/b;
 }
}
public class lambadaDemo2{
	 public static void main(String[] args){
	     int a = 25;
	     int b = 5;  
	     int add = NIT2.add(a,b);
	     int sub = NIT2.sub(a,b);
	     int mul = NIT2.multiply(a,b);
	     int div = NIT2.divide(a,b);
	     System.out.print(add+" "+sub+" "+mul+" "+div+" ");
	      
	     NIT2 sq = (x) -> 
	     {
	    	 return x*x;
	     };
	     System.out.print(sq.square(6));
	 }
	}
*/

/*
public class lambadaDemo2{
	public static void main(String[] args) {
		Function<String, String> fun = str -> str.substring(2,5);
		System.out.println(fun.apply("Hyderabad"));
	}
}

*/
/*
@FunctionalInterface
interface NIT4
{
	String myInterface(String a);
	default void nit() 
	{
		
	}
	default int newInterface(int a) 
	{
		return a;
	}
}
*/
/*
@FunctionalInterface
interface NIT5
{
	String myInterface(String a); //abstract method 
	int hashCode(); //Object class methods
	String toString();	
}
*/

/*
public class lambadaDemo2 {

	public static void main(String[] args) {
	}
}
@FunctionalInterface
interface NIT6
{
	String myInterface(String a); //abstract method
	String toString(); //Object class method
	void wait();
	void notify();
	
}
*/
/*
public class lambadaDemo2{
	public static void main(String[] args) {
		Predicate<Integer> grater = a -> a >15;
		
		Predicate<Integer> less = a -> a <10;
		
		boolean bool = grater.test(20);
		boolean bool1 = less.test(5);
		System.out.println(bool);
		System.out.println(bool1);		
		
	}
}
*/

/*
public class lambadaDemo2{
	public static void main(String[] args) 
	{
		String str[]= {"Java","Python","Naresh","IT"};
		
		Predicate<String> prediacte = p -> p.endsWith("va");
		for(String s: str) 
		{
			if(prediacte.test(s))
				System.out.println(s);
		}
	}
}

*/
/*
interface NIT7
{
	public int myInterface(int a);
}

public class lambadaDemo2 {
	public static void main(String[] args) {
		NIT7 nit = (a) -> a+1;
		int i = nit.myInterface(6);
		System.out.println(i);
	}
}
*/
/*
@FunctionalInterface
interface NIT8
{	
	int myInterface(int a);
}

@FunctionalInterface
interface NewInterface
{
	void alpha(String a);
}

public class lambadaDemo2 {
	public static void main(String[] args) {
		NIT8 nit = (a) -> a*a*a;
		System.out.println(nit.myInterface(5));
		NewInterface result = (a) -> System.out.println("Welcome to NareshIT");
		result.alpha("");
	}
}

*/
/*

public class lambadaDemo2 {
	public static void main(String[] args) {
		Consumer<Integer> value = (a) -> System.out.println(a*3);
		value.accept(5);
	}
}

*/

public class lambadaDemo2 {
	public static void main(String[] args) {
		Consumer<String> value = (a) -> System.out.println(a.toLowerCase());
		value.accept("NareshIT");
	}
}


