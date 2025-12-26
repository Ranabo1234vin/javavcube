package com.java;

public class TypesOFMethods {
	
	//no return no args
	public void display() {
		System.out.println("hello welcome");
	}
	//no return type with args
	public void process(int age,String name){
		System.out.println(age+" "+name);
	}
	
	//datatype--int byte short float double char boolean long
	//return type with no args
	
	public int addition(){
		System.out.println("started addition!!!!!!!!");
		int a=20;
		int b=10;
		int c=a+b;
		return c;
		
	}
	//with return type with args
	
	public int sub(int a,int b) {
		int c=a-b;
		return c;
	}
	
	public void PANCARD(int age) {
		System.out.println("pan !!!!!!");
		if(age<18) {
			return;
		}
		System.out.println("successfull");
	}
	
	public static void main(String[] args) {
		
		TypesOFMethods obj1 = new TypesOFMethods();
		obj1.display();
		obj1.process(23,"subhan");
		int sum=obj1.addition();
		System.out.println(sum);
		
		int sub=obj1.sub(30,10);
		System.out.println(sub);
		
		obj1.PANCARD(17);
	}

	
}
