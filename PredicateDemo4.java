package com.nit.predicate;

import java.util.function.Predicate;

public class PredicateDemo4 {

	public static void main(String[] args) {
		Predicate<Student>p3=student->student.getMarks()>=75;
		
	}

}
class Student{
	private int id;
	private String name;
	private double Marks;
	
	public Student(int id, String name, double Marks) {
		super();
		this.id = id;
		this.name = name;
		this.Marks = Marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return Marks;
	}

	public void setMarks(double price) {
		this.Marks = price;
	}

	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", price=" + Marks + "]";
	}
	
	
	
}
