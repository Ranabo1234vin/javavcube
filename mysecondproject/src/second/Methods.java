package second;

public class Methods {
	
	
	void method5()
	{
		method6();
		System.out.println("hello method5");
	}
	void method6()
	{   
		method7();
		
		System.out.println("hello method6");
	}
	 static void method7()
	{ 
		 Methods obj=new Methods();
		obj.method8();
		System.out.println("hello method7");
	}
	void method8()
	{
		System.out.println("hello method8");
	}
    
	public static void main(String[] args) {
		System.out.println("main method started!!");
		method1();
	
	}
	static void method1()
	{
		method2();
		System.out.println("hello method1");
	}
	static void method2()
	{    
		method3();
		System.out.println("hello method2");
	}
	static void method3()
	{
		method4();
		System.out.println("hello method3");
	}
	static void method4()
	{
		Methods obj=new Methods();
		obj.method5();
		System.out.println("hello method4");
	}
	
	

}
