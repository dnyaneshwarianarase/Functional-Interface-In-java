package com.nit.predicate;

public class TypeParameterDemo {

	public static void main(String[] args) {
		Box<Integer>intType=new Box<Integer>(12);
		IO.println(intType.getData());

	}

}
class Box<T>{
	private T data;
	
	public Box(T data) {
		super();
		this.data=data;
	}
	public T getData() {
		return this.data;
		
	}
}
