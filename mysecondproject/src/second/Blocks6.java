package second;

public class Blocks6 {
     static int x=10;
	void main(String[] args) {
		System.out.println("main method executed!");

	}
	static 
	{    
		System.out.println(x);
		System.out.println("this is static block");
	}
	
	{
		System.out.println(x);
		System.out.println("this is instance block!");
		
	}
	

}
