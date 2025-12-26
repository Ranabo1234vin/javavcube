package com.java;
/* String class is in default package */
import java.math.BigInteger;
import java.math.BigDecimal;

public class Testnormalobjectdatatypes {
    String x="vinay reddy";
    //it stores in string constant pool(scp)
    String y=new String("vcube");
    /*it stores in string constant pool(scp) and 
     * heap in string constant pool without refrence
     * if we remove String obj=new String("vcube"); avallible in scp
     *  without reference*/
    String obj1="vcube";
    /*if  we write above code get reference in scp 
    it gets reference in string constant pool */
   BigInteger bi=new BigInteger("10000000000000000000000000000000000");
   /*BigInteger bi3=new BigInteger("10000000000000000000000000000000000.5");
    * run time error*/
   //run time error number format exception
  /* BigInteger bi4="10000000000000000000000000000000000.5"; compile time error*/
   
   BigInteger bi2=new BigInteger("9");
   
   
   BigDecimal bd1=new BigDecimal("3");
   BigDecimal bd2=new BigDecimal("1000000000000000000.5555555555555555555");
   
    String x1=new String("vcube");
    String y1=new String("vcube");
	public static void main(String[] args) {
		Testnormalobjectdatatypes obj=new Testnormalobjectdatatypes();
		//System.out.println(obj.bi.add(obj.bi2));
		//System.out.println(obj.bd1.add(obj.bd2));
		/*System.out.println(obj.bi2.divide(obj.bd1));
		it throw error biginteger is not divide with bigdecimal */
		//System.out.println(obj.bd1.divide(obj.bd2));
		System.out.println(obj.bi.add(obj.bi2));
		System.out.println(obj.x1==obj.y1); //address compare
		System.out.println(obj.x1.equals(obj.y1));

	}

}
