package com.java;
import java.util.Scanner;
public class Inputmethods {
	
	String Name(String FirstName,String LastName) {
		System.out.println("My Full name Is :"+FirstName+" "+LastName);
		return FirstName+" "+LastName;
	}
	char gender(char gender) {
		System.out.println("My Gender is :");
		return gender;
	}
	int age(int age) {
		System.out.println("My age is :");
		return age;
	}
	float height(float height) {
		System.out.println("My height is :");
		return height;
	}
	double weight(double weight) {
		System.out.println("My weight is :");
		return weight;
	}
	String address(String address) {
		System.out.println("My address is :");
		return address;
	}
	long phNo(long PHno) {
		System.out.println("My mobile number is :");
		return PHno;
	}
	String MotherName(String MotherName) {
		System.out.println("Enter mother name :");
		return MotherName;
	}
	String FatherName(String FatherName) {
		System.out.println("Enter the father name :");
		return FatherName;
	}
	String Religion(String Religion) {
		System.out.println("I am a :");
		return Religion;	
	
	}
	
	String CollegeName(String CollegeName) {
		System.out.println("My college name is :");
		return CollegeName;
	}
	String Branch(String Branch) {
		System.out.println("my branch is :");
		return Branch;
	}
	float Cgpa(float CGPA) {
		System.out.println("My cgpa is :");
		return CGPA;
	}
	short passedYear(short YOP) {
		System.out.println("I passed out in :");
		return YOP;
	}
	short favNo(short favNo) {
		System.out.println("my favourate number is :");
		return favNo;
	}
	

	public static void main(String[] args) {
        Scanner D=new Scanner(System.in);
		Inputmethods De=new Inputmethods();
		System.out.println("Enter the first name :");
		String a=D.nextLine();
		System.out.println("Enter the last name");
		String a1=D.nextLine();
		String FullName=De.Name(a, a1);
		System.out.println(FullName);
		
		System.out.println("enter the gender :");
		char g=D.next().charAt(0);
		char Sex=De.gender(g);
		System.out.println(Sex);
		
		System.out.println("enter the age :");
		int b=D.nextInt();
		int Age=De.age(b);
		System.out.println(Age);
		D.nextLine();
		
		System.out.println("Enter the height :");
		float H=D.nextFloat();
		float Height=De.height(H);
		System.out.println(Height);
		D.nextLine();
		
		System.out.println("enter the weight :");
		double w=D.nextDouble();
		double Weight=De.weight(w);
		System.out.println(Weight);
		D.nextLine();
		
		System.out.println("enter the Address :");
		String addrs=D.nextLine();
		String address=De.address(addrs);
		System.out.println(address);
		
		System.out.println("enter the mobile number :");
		long Phno=D.nextLong();
		long PHno=De.phNo(Phno);
		System.out.println(PHno);
		D.nextLine();
		
		System.out.println("Enter the Mother name :");
		String Mname=D.nextLine();
		String MotherName=De.MotherName(Mname);
		System.out.println(MotherName);
		
		System.out.println("Enter the Father name :");
		String Fname=D.nextLine();
		String FatherName=De.FatherName(Fname);
		System.out.println(FatherName);
		
		System.out.println("Enter the religion :");
		String Relig=D.nextLine();
		String Religion=De.Religion(Relig);
		System.out.println(Religion);
		
		System.out.println("Enter the College Name :");
		String CName=D.nextLine();
		String CollegeName=De.CollegeName(CName);
		System.out.println(CollegeName);
		
		System.out.println("Enter the Branch :");
		String Brnch=D.nextLine();
		String Branch=De.Branch(Brnch);
		System.out.println(Branch);
		
		System.out.println("Enter the CGPA :");
		float grade=D.nextFloat();
		float Cgpa=De.Cgpa(grade);
		System.out.println(Cgpa);
		D.nextLine();
		
		System.out.println("Enter the passout year :");
		short P=D.nextShort();
		short PassOut=De.passedYear(P);
		System.out.println(PassOut);
		D.nextLine();
		
		System.out.println("Enter the FavNo :");
		short F=D.nextShort();
		short FavNo=De.favNo(F);
		System.out.println(FavNo);
		
		System.out.println("--------------------DETAILS----------------------");
		System.out.println("Full name        :"+FullName);
		System.out.println("Gender           :"+Sex);
		System.out.println("Age              :"+Age);
		System.out.println("Height           :"+Height);
		System.out.println("Weight           :"+Weight);
		System.out.println("Address          :"+address);
		System.out.println("Mobile Number    :"+PHno);
		System.out.println("Mother name      :"+MotherName);
		System.out.println("Father name      :"+FatherName);
		System.out.println("Religion         :"+Religion);
		System.out.println("College Name     :"+CollegeName);
		System.out.println("Branch           :"+Branch);
		System.out.println("CGPA             :"+Cgpa);
		System.out.println("Passed out year  :"+PassOut);
		System.out.println("Favourite Number :"+FavNo);
		
	}

}