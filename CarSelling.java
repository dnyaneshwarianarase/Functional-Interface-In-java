package com.nit.predicate;

import java.util.function.Predicate;

public class CarSelling {

	public static void main(String[] args) {
		String brand=IO.readln("Enter a Car Brand: ");
		Double price=Double.parseDouble(IO.readln("Enter Price"));
		Integer mileage=Integer.parseInt(IO.readln("Enter mileage:"));
		Car car=new Car(brand,price,mileage);
		
		
		Predicate<Car>IsLess=c->c.getPrice()<=500000 && c.getMileage()>=20;
		
		
		boolean IsL=IsLess.test(car);
		if(IsL) {
			IO.println("Car is Eligible for SEll");
		}
		else {
			IO.println("Car is NOt Eligible for SEll");
		}
		
	}

}
class Car{
	protected String brand;
	protected Double price;
	protected Integer mileage;
	
	
	public Car(String brand, Double price, Integer mileage) {
		super();
		this.brand = brand;
		this.price = price;
		this.mileage = mileage;
	}

	

	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public Double getPrice() {
		return price;
	}



	public void setPrice(Double price) {
		this.price = price;
	}



	public Integer getMileage() {
		return mileage;
	}



	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}



	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", mileage=" + mileage + "]";
	}
	
	
	
	
	
}