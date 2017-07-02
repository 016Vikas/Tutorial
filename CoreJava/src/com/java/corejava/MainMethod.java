package com.java.corejava;

public class MainMethod {

	MainMethod(){
		System.out.println("constructor");
	}
	static
	{
	System.out.println("Static");
	test1();
	}
	
	{
	System.out.println("Block");
	test();
	}

	public static void main(String args[])
	{
		System.out.println("Main1");
		test1();
		MainMethod obj=new MainMethod();
		obj.test();
		System.out.println("Main2");
	}
	
	public void test(){
		System.out.println("test");
		
	}
	
	public static void test1(){
		System.out.println("test1");
		
	}
	
	}

