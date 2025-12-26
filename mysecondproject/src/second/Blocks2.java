package second;

public class Blocks2 {
  static Blocks2 obj=new Blocks2();
	public static void main(String[] args) {
		System.out.println("main method started");
		Blocks2 obj1=new Blocks2();
		

	}
	{
		System.out.println("instance block called");
	}
	static
	{
		System.out.println("static block  called");
	}

}
//where ever the object is created instance data is loaded in  heap memory
//by keeping static the static object is loaded in to method area
//and instance block is executed first before static block in above program

