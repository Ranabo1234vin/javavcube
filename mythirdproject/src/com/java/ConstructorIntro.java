package com.java;

public class ConstructorIntro {
    int sid;
    String sname;
   ConstructorIntro()
    {
    	System.out.println("no args constructor");
    	sid=100;
    	sname="unknow";
    	
    }
    ConstructorIntro(int sid,String sname)
    {
    	sid=sid;
    	sname=sname;
    }
    
	public static void main(String[] args) {
		ConstructorIntro obj=new ConstructorIntro();
		System.out.println(obj.sid);
		System.out.println(obj.sname);
		ConstructorIntro obj1=new ConstructorIntro(101,"virat");
		System.out.println(obj1.sid);
		System.out.println(obj1.sname);

	}

}
