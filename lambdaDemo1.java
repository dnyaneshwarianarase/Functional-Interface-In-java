package com.nit.lamdaMcq;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/*
interface Drawable{
	void draw();
}

public class lambdaDemo1 {

	public static void main(String[] args) {
		{
			
			Drawable draw1=()-> IO.println("Drawable..");
			draw1.draw();

			}
		//error we need assignment operator
	};
}
*/
/*
interface Runnable{
	void run();
}
public class lambdaDemo1{
	public static void main(String[] args) {
		Runnable nit=()->System.out.println("Thread Started");
		nit.run();
	}
}
*/
/*
interface Course{
	String courseName();
	String facultyName();
	String duration();
}

interface NIT extends Course
{
	String nit(String courseName);
}
public class lambdaDemo1{
	public static void main(String[] args) {
		NIT nit = (String course) -> course;
		System.out.println(nit.nit("Java"));

	}
}
*/



/*
@FunctionalInterface
interface NIT 
{
	String nit(String courseName);
}

interface Course extends NIT
{
	String courseName();
	String facultyName();
	String duration();
}
public class lambdaDemo1
{
	public static void main(String[] args) {
		NIT nit = (String course) -> course;
		System.out.println(nit.nit("Java"));
	}
}
*/
/*
public class lambdaDemo1
{
  public static void main(String[] args)
  {
    Function<String, Boolean> fun = str -> str.startsWith("A");	
		
		System.out.println(fun.apply("Ankit"));
	}
}
*/
/*
public class lambdaDemo1 
{
	public static void main(String[] args) 
	{
		Function<String,Boolean>fn2=str->str.equals("google");
		String str=IO.readln("enter name");
		IO.println("is equals:"+fn2.apply(str));
		
	}
}
*/

/*
@FunctionalInterface 
interface Str
{
	String str(String str);
}

public class lambdaDemo1 {
	public static void main(String[] args) {
		Str nit = s -> "Naresh"+s;
		System.out.println(nit.str("IT"));	
	}
}
*/

/*
interface NIT
{
	public void nit();
}

public class lambdaDemo1  
{
	public static void main(String[] args) 
	{
		String str = "IT";

		NIT n = () -> 
		{
			System.out.println("Naresh" +str);
		};
	}
}

*/
/*
public class lambdaDemo1 
{
	public static void main(String[] args) 
	{
		() -> System.out.println("NareshIT");
	}
}
*/
/*

interface NIT
{
	public void myInterface(int a);
}

public class  lambdaDemo1 {
	public static void main(String[] args) {
		NIT nit = (a) -> a+1;
	}
}
*/
/*
public class lambdaDemo1{
	public static void main(String args[])
	{
		Function<Integer, Double> div = a -> a / 2.0;
		System.out.println(div.apply(15));
	}
}
*/
/*
class Student
{ 
    private int id;
    private String name;
    private String gender;
    private int age;
 
    public Student(int id, String name, String gender, int age) 
	{
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
 
    @Override
    public String toString() 
		{
        return "[id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
        }
}
		
public class lambdaDemo1 
{
	public static void main(String[] args) 
	{
      Supplier<Student> stdSupplier = () -> new Student(1, "Virat", "Male", 24);
		
        Student std =  stdSupplier.get();
        System.out.println(std);       
	}
}
*/
/*
interface NIT
{
	public int myInterface(int a);
}

public class lambdaDemo1 {
	public static void main(String[] args) {
		NIT nit = (a) -> a+1;
	}
}

*/
/*
@FunctionalInterface
interface NIT
{
	int cal(int value);
}
public class lambdaDemo1
{
	public static void main(String[] args) {
		NIT nit = (int value) -> value+25;		
		System.out.println("Result: "+nit.cal(20));
	}
}
*/
/*
@FunctionalInterface
interface NIT
{
	String nit(String name);
}
public class  lambdaDemo1 
{
	public static void main(String[] args) {
		NIT nit = (String name) -> "";
		System.out.println(nit.nit("NARESHIT"));
		
	}
}
*/
/*
@FunctionalInterface
interface NIT
{
	String nit(String name);
}
public class lambdaDemo1
{
	public static void main(String[] args) {
		NIT nit = (String name) -> "Welcome to ";
		System.out.println(nit.nit("NARESHIT"));		
	}
}
*/
/*
@FunctionalInterface
interface NIT
{
	String str(String nit);
}
public class lambdaDemo1
{
	public static void main(String[] args) {
	NIT nit = (String nit) -> nit +"";
	}
}
*/
/*
interface NIT
{
	String nit(String name);
}
public class lambdaDemo1
{
	public static void main(String[] args) {
		NIT nit = (String name) -> "Welcome to " + name;
		System.out.println(nit.nit("NARESHIT"));		
	}
}
*/
/*
@FunctionalInterface
interface NIT
{
	String nit(String name);
}
public class lambdaDemo1 implements NIT
{
	public static void main(String[] args) {
		lambdaDemo1 nit = new lambdaDemo1();
		System.out.println(nit.nit("Welcome to "));
	}	
	@Override
	public String nit(String name) {
		return name+"NARESHIT";
	}
}
*/
@FunctionalInterface
interface NIT
{
	String nit(String name);
}
public class lambdaDemo1 
{
	public static void main(String[] args) {
		NIT nit = (String name) -> {
			return name;
		};
		
		NIT nit1 = (String name) -> name;
		
		System.out.println(nit.nit("Welcome to ")+nit1.nit("NARESHIT"));
	}
}
