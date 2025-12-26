package com.java;

public class Bunty {
    String name;
    int age;
    Bunty()
    {
    	System.out.println("no arg constructor");
    }
	Bunty(String name,int age)
	{
		this.name=name;
		this.age=age;
		this();
	}
	public static void main(String[] args) {
	Bunty obj=new Bunty("vinay",25);
	obj.display();

	}
	
	void display()
	{
		System.out.println(name);
		System.out.println(age);
	}

}
