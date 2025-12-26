package com.java;




class Student{
	int sid;
	String sname;
}
class Address
{
	String street;
	String city;
}
public class FactoryMethod {
	
	public static void main(String[] args) {
		
	FactoryMethod obj=new FactoryMethod();
	Student s1=obj.getStudent();
	System.out.println(s1.sid);
	Address obj1=obj.getaddress();
	System.out.println(obj1.street);
	}
	Student getStudent()
	{
	  Student s1=new Student();
	  s1.sid=101;
	  s1.sname="vinay";
	  return s1;
	}
	Address getaddress()
	{
		Address a1=new Address();
		a1.street="kphb";
		a1.city="hyd";
		return a1;
	}

}
