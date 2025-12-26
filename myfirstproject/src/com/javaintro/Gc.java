package com.javaintro;

public class Gc {
	@Override
	public void finalize(){
		System.out.println("finalize called !");
	}
	public static void main(String[] args) {
		System.out.println("main method started !");
		Gc c1 = new Gc();// --> memory
//		com.javaintro.Customer@1dbd16a6 --> 1
		Gc c2 = new Gc();// --> memory
//		com.javaintro.Customer@7ad041f3  --> 1
		Gc c3 = new Gc();// --> memory
//		com.javaintro.Customer@251a69d7  --> 2
		// nullifying the object reference
		Gc c4= new Gc();
		c3=c4;
		System.out.println("c1    "+c1);
		System.out.println("c2    "+c2);
		System.out.println("c3    "+c3);
		System.out.println("*********************************");
		//Gc c4= new Gc();
		System.out.println("c1   "+c1);// -->1
		System.out.println("c2   "+c2);// -->2
		System.out.println("c3   "+c3);// -->3
		System.out.println("     "+c4);
		//System.out.println("c4    "+c4);// -->3
		// Re-assigining the object
		//c1 = c4;
		// Anonymous object
		//new Gc();
		/*System.gc();// --> Runs the garbage collector in the Java Virtual Machine.
		System.out.println(c1);// -->1
		System.out.println(c2);// -->2
		System.out.println(c3);// -->3
		System.out.println(c4);// -->3
		System.out.println("--------------------------------------==============================");
		c1=new Gc();
		System.out.println(c1);// -->1
		System.out.println(c2);// -->2
		System.out.println(c3);// -->3
		System.out.println(c4);*/
		
		
	}


}
