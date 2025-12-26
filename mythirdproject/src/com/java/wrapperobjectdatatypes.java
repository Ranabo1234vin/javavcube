package com.java;
import java.math.*;
public class wrapperobjectdatatypes {
          //Byte ob2=new Byte();
          //Integer obj77=new Integer();
          String obj=new String();
            obj=null;
          //BigInteger obj99=new BigInteger("100");
          //BigDecimal obj00=new BigDecimal();
          //Short obj111=new Short();
          //Long
	public static void main(String[] args) {
		String s1="123";
		String s2="7";
		wrapperobjectdatatypes objyu=new wrapperobjectdatatypes();
		//System.out.println(objyu.obj);
		//System.out.println(s1+s2);
		//output is---->1237
		/*to get above numbers addition we need to convert 
		in to numbers by using wrapper object data types */
		int i1=Integer.parseInt(s1);// string to -->int
		int i2=Integer.parseInt(s2);
		//System.out.println(i1+i2);
		Integer x=100; //it takes only integer values
		//System.out.println("Integer ===="+x);
		Character y=100; 
		//System.out.println(y);
		/* it takes integer and convert in to character*/
		Character c_char='c';
		/* it takes character and prints*/
		Character num='0';
		//System.out.println(num);
		/*it takes single digit as character 
		 * and convert it into number range is 0 to 9 0=0,1=1,2=2
		 */
		Byte b1=(byte) 150;
		//System.out.println(b1);//primitive to wrapper

	}

}
