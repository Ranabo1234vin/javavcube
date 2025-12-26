package com.java;
//this or super both not used in single constructor only one at a time
// all child constructor called parent class default constructor by default
class Vechile
{
	String brand;
	String model;
	Vechile()
	{
		System.out.println("no arg constructor vechile called");
	}
	Vechile(String brand,String model)
	{
	     System.out.println("vechile parameterized constructor called");
		 this.brand=brand;
		 this.model=model;
	}
	public static void main(String args[])
	{
		System.out.println("main method started from vechile");
	}
	
}

public class BikesuperIheritance extends Vechile {
	BikesuperIheritance()
	{   
		super("hyndai","i20");
	  System.out.println("no arg constructor called from bike");
   }
	BikesuperIheritance(String brand,String model)
	{  
   		this.brand=brand;
		this.model=model;
		System.out.println("parameterized constructor callled for bike");
    }
	public static void main(String[] args) {
		System.out.println("main method started from bike");
		BikesuperIheritance obj=new BikesuperIheritance();
		obj.display();
		BikesuperIheritance obj1=new BikesuperIheritance("kia","sonet");
		obj1.display();

	}
	void display()
	{
		System.out.println(brand);
		System.out.println(model);	
	}

}
