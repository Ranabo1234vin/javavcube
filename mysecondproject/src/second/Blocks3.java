package second;

public class Blocks3 {
     static Blocks3 obj=new Blocks3();
     int a=10;
     static{
    	 //System.out.println(a);
    	 System.out.println("static block 1 called");
     }
	public static void main(String[] args) {
		System.out.println("main method started!!");

	}
	{
		System.out.println(a);
		System.out.println("instance block 1 called");
	}

}
