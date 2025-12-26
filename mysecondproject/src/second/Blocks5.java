package second;

public class Blocks5 {
     static Blocks5 obj=new Blocks5();
    int a=5;
	static
	{
		System.out.println("this is static block");
	}
	public static void main(String[] args) {
		System.out.println("main method started");

	}
	{
		System.out.println(a);
		System.out.println("instance block called");
	}

}
