package com.nit.function_functional_interface;

import java.util.function.Function;

public class CalculateProductDiscount {

	public static void main(String[] args) {
		
		Integer id=Integer.parseInt(IO.readln("Enter Product Id : "));
		String name=IO.readln("Enter Product Name : ");
		Double price=Double.parseDouble(IO.readln("Enter Product Price :"));
		Product p=new Product(id,name,price);
		
		Function<Product,Double>calDis=(p1)->{
			Double dis,price1;
			if(price>=5000) {
				
				dis=(0.1)*price;
				price1=price-dis;

			}
			else {
				dis=0.05*price;
				price1=price-dis;
			}
			return price1;
			
		};
		IO.println("Final price of the product is :"+calDis.apply(p));
		

	}

}
class Product{
	protected Integer id;
	protected String name;
	protected Double price;
	
	
	public Product(Integer id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
