package com.java;

public class Employee {
	//this ---this()-- this is key word it reffers to Current class instance
	//super--- supe()-- it refer to parent class instance
	int age;
	String name;
	
	public void initialize(int age,String name) {
		System.out.println("initializing!!!!!!");
		this.age=age;
		this.name=name;
	}
	
	public void printEmployee() {
		System.out.println("age: "+this.age+" name:"+this.name );
	}
	public static void main(String[] args) {
		Employee b=new Employee();//0 null
		b.initialize(23, "subhan");
		b.initialize(24, "pavan");
		b.printEmployee();
		
	}

}
