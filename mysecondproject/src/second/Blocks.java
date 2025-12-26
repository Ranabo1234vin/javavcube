package second;

public class Blocks {

	public static void main(String[] args) {
		System.out.println("main method started!!");

	}
	{
		Blocks obj=new Blocks();
		System.out.println("instance block called!!");
	}
	static
	{
		new Blocks();
		System.out.println("static block called!!");
	}
	

}
