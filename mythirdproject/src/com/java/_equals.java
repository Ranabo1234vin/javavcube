package com.java;
 class student
 {
	 
 }
public class _equals {

	public static void main(String[] args) {
		student obj1=new student();
		student obj2=new student();
		obj1=obj2;
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj2==obj1);// compare the address
		System.out.println(obj1.equals(obj2));// compare address
		String obj3=new String("vcube");
		String obj4=new String("vcube");
		System.out.println(obj3==obj4);// compare address
		System.out.println(obj3.equals(obj4));//compare the values
		

	}

}
