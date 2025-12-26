package com.java;

public class ConcationInmethods {
	char add1()
	{
		return 65;
	}
	int add2()
	{
		return 'A'+'B';
	}
	char sum1()
	{
		int x=10+20;
		return (char)x;
	}
	int sum2()
	{
	  	char x='A'+'B';
	  	return x;
	}
    String fname_lname(String s1,String s2)
    {
    	return s1+s2;
    }
    byte addition(byte a,byte b)
    {
    	byte c=(byte)(a+b);
    	return c;
    }
    double subraction(int a,int b)
    {
    	float x=a-b;
    	return x;
    }
    float multiplication(double a,double b)
    {
    	float x=(float)(a*b);
    	return x;
    	
    }
    void main(String[] args) {
		//System.out.println(sum2());
		System.out.println(add1());
		System.out.println(add2());

	}

}
