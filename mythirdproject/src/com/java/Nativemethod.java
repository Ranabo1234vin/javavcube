package com.java;

public class Nativemethod {
    native void man();
    void main(String[] args) {
		System.out.println("main method started !");
	      hello();
		man();
		

	}
	void hello()
	{
		System.out.println("");
	}

}
