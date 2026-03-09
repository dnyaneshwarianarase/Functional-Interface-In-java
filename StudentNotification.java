package com.nit.function_functional_interface;

import java.util.function.Consumer;

public class StudentNotification {

	public static void main(String[] args) {
		int n=Integer.parseInt(IO.readln("Enter number of students: "));
		while(n>=1) {
		Integer id=Integer.parseInt(IO.readln("Enter ID: "));
		String name=IO.readln("Enter Name: "); 
		String course=IO.readln("Enter Course: "); 
		Student s=new Student(id,name,course);
		Consumer<Student>isEligible=(s1)->{
			IO.println("Hello "+name+"! Welcome to the "+course +" course.");
		};
		isEligible.accept(s);
	}
	}

}
class Student{
	protected Integer id;
	protected String name;
	protected String course;
	
	
	public Student(Integer id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	
	
	
	
}