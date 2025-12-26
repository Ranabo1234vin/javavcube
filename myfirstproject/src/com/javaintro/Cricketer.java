package com.javaintro;

public class Cricketer {

	// Declaration
			// instance variables
			int jno;
			String name;
//			 static variables
			static int countryId;
			static String CountryName;
			public static void main(String[] args) {
				System.out.println("Welcome to Indian Cricket Team info !");
				// Creating an object for a Cricketer class
				System.out.println("Object1 info : ***********");
				Cricketer msd = new Cricketer();
				// Initialization
				countryId = 91;
				CountryName = "India";
				msd.jno = 7;
				msd.name = "Mahendra Singh Dhoni";
				// Accessing static data or Representing the data
				System.out.println("County ID : " + countryId);
				System.out.println("Country Name : " + CountryName);
				// Accessing instance data
				// Cannot make a static reference to the non-static field jno
				System.out.println("Jersey No : " + msd.jno);
				// Cannot make a static reference to the non-static field name
				System.out.println("name of the Cricketer :  " + msd.name);
				System.out.println("Object2 info : ***********");
				Cricketer vk = new Cricketer();
				vk.jno = 18;
				vk.name = "Virat Kohli";
				System.out.println("County ID : " + countryId);// 91
				System.out.println("Country Name : " + CountryName);// India
				System.out.println("Jersey No : " + vk.jno);// 0
				System.out.println("name of the Cricketer :  " + vk.name);// null
				System.out.println("Object3 info : ***********");
				Cricketer kl = new Cricketer();
				countryId = 92;
				CountryName = "Bharath";
				kl.jno = 1;
				kl.name = "KL Rahul";
				System.out.println("County ID : " + countryId);// 91
				System.out.println("Country Name : " + CountryName);// India
				System.out.println("Jersey No : " + kl.jno);// 0
				System.out.println("name of the Cricketer :  " + kl.name);// null
				System.out.println("Object4 info : ***********");
				Cricketer rs = new Cricketer();
				
				rs.jno = 45;
				rs.name = "Rohith Sharma";
				System.out.println("County ID : " + countryId);// 91
				System.out.println("Country Name : " + CountryName);// India
				System.out.println("Jersey No : " + rs.jno);// 0
				System.out.println("name of the Cricketer :  " + rs.name);// null
			}

}
