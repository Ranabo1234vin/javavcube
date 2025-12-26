package second;

public class Blocks4 {

		 static Blocks4 obj=new Blocks4();
	     static int a=10;
	     static{
	     System.out.println(a);
	    	 System.out.println("static block 1 called");
	     }
		public static void main(String[] args) {
			System.out.println("main method started !");

		}
		{
			System.out.println(a);
			System.out.println("instance block 1 called");
		}


}
