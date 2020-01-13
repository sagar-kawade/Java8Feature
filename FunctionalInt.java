package com.Feature8.in;

public class FunctionalInt implements Bank,NewBank {

	
	
	
	@Override
	public void mydata() {
		// TODO Auto-generated method stub
		NewBank.super.mydata();
	}

	@Override
	public void m1() {
System.out.println("in the m1()");		
	}
public static void main(String[] args) {
		NewBank ne= new NewBank() {
			
			@Override
			public void m1() {
				System.out.println("in inline imlpmentation");
			}
		};
		ne.new1();
		ne.mydata();
		NewBank.clear();
		ne.m1();
	
	NewBank b=()->System.out.println("in lambda implementation");
	b.m1();
	b.new1();
	b.mydata();
	NewBank.clear();

	
	}

	
}

@FunctionalInterface
interface Bank{
	void m1();
	static void clear(){
		System.out.println("in Bank clear");
	}
	default void mydata(){
		System.out.println("in Bank mydata");
	}
}
@FunctionalInterface
interface NewBank{
	void m1();
	default void new1(){
		System.out.println("in side newbank new1");
	}
	static void clear(){
		System.out.println("in NewBank clear");
	}
	default void mydata(){
		System.out.println("in NewBank mydata");
	}
}
	
	
