package com.nit.lambda_functional_programming;

import java.util.Random;
import java.util.function.Supplier;

public class PasswordGeneratorclass {

	public static void main(String[] args) 
	{
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String digits = "0123456789";
		String special = "@#$%!&*";

		String combinePass=upper+lower+digits+special;
		
		Supplier<String>passwordSupplier=()->
		{
			Random random=new Random();
			String password="";
			for(int i=1;i<=8;i++) {
				int randomNum=random.nextInt(combinePass.length());
				
				char randomChar=combinePass.charAt(randomNum);
				password+= randomChar;
				

			}
			return password;
			
			
		};
		String password=passwordSupplier.get();
		IO.println("Your Password is: "+password);
		
	}

}
