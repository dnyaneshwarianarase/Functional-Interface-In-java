package com.nit.predicate;

import java.util.function.Predicate;

public class LoanEligibilityWithPredicate {

	public static void main(String[] args) 
	{
		
		String name=IO.readln("Enter Name: ");
		Double salary=Double.parseDouble(IO.readln("Enter a Salary: "));
		Integer creditScore=Integer.parseInt(IO.readln("Enter a CreditScore"));
		Integer age=Integer.parseInt(IO.readln("Enter a age: "));
		Customer cust=new Customer(name,salary,creditScore,age);
		
        boolean check=cust.checkLoanEligibility();	
        if(check) {
        	IO.println("Customer Is Eligible for Loan");
        }
        else {
        	IO.println("Customer Is NoT Eligible for Loan");
        	
        }
		
		

	}

}
class Customer{
	protected String name;
	protected Double salary;
	protected Integer creditScore;
	protected Integer age;
	public Customer(String name, Double salary, Integer creditScore, Integer age) {
		super();
		this.name = name;
		this.salary = salary;
		this.creditScore = creditScore;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", salary=" + salary + ", creditScore=" + creditScore + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(Integer creditScore) {
		this.creditScore = creditScore;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public boolean checkLoanEligibility() {
		
		Predicate<Customer>isEligible= Customer->this.salary>=25000 && this.creditScore >=700 && this.age>=21;
		
		boolean loanEligible=isEligible.test(this);
		if(loanEligible) {
			return true;
		}
		else {
			return false;
			
		}
	}
	
	
	
	
	
	
}
