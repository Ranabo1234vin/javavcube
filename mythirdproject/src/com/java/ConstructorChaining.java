package com.java;

public class ConstructorChaining {
	String brand;
	String model;
	double price;
	String color;
	int number;

	ConstructorChaining() {
		brand = "unknow";
		model = "unknown";
		price = 0.00;
		color = "unknow";
		number = 0;
	}

	ConstructorChaining(String brand) {
		this();
		this.brand = brand;
	}

	ConstructorChaining(String model, double price) {
		//this("cytrogen");
		this.model = model;
		this.price = price;
	

	}

	ConstructorChaining(String color, int number) {
		this("hyndaia", 12000.0);
		this.color = color;
		this.number = number;
		

	}

	public static void main(String[] args) {
		ConstructorChaining obj = new ConstructorChaining();
		obj.display();
		System.out.println("==============================================");
		ConstructorChaining obj1 = new ConstructorChaining("kia");
		obj1.display();
		System.out.println("=================================================");
		ConstructorChaining obj3 = new ConstructorChaining("sonet", 140000.00);
		obj3.display();
		System.out.println("=================================================");
		ConstructorChaining obj4 = new ConstructorChaining("red", 1234);
		obj4.display();
	}

	void display() {
		System.out.println("brand is :" + brand);
		System.out.println("model is :" + model);
		System.out.println("price is :" + price);
		System.out.println("color is :" + color);
		System.out.println("number is :" + number);
	}

}
