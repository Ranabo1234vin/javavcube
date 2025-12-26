package Cricketer;
// for every object new instance copy will create;
//static data is same for all object;
//instace data is diffrent for object to object;
//jvm will give default value for string is null for int is zero(0)
public class Cricketer123 {
	//static data
     static int countryid=21;
 // first it will check intiniliaze inside main method if it is not present inside main method it will go for instance initinalize
     static  String Countryname="nepal";
     //instance data
     int jno;
     String name;
	 public static void main(String[] args) {
		Cricketer123 msd=new Cricketer123();
		countryid=91;
		Countryname="india";
		System.out.println("*************object 1 data***************");
		msd.jno=7;
		msd.name="mahendra singh dhoni";
		System.out.println("country id:"+countryid);
		System.out.println("country name:"+Countryname);
		System.out.println("jersy no:"+msd.jno);
		System.out.println("name of the cricketer:"+msd.name);
		Cricketer123 kl=new Cricketer123();
 //cricketer123 left side is cricteter class //kl is object reference variable  //object is cricketer123 right side
		System.out.println("*************object 2 data***************");
		kl.jno=1;
		kl.name="kl rahul";
		System.out.println("country id:"+countryid);
		System.out.println("country name:"+Countryname);
		System.out.println("jersy no:"+kl.jno);
		System.out.println("name of the cricketer:"+kl.name);
		countryid=92;
		Countryname="Bharath";
		Cricketer123 rh=new Cricketer123();
		System.out.println("*************object 3 data***************");
		rh.jno=45;
		rh.name="Rohith sharma";
		System.out.println("country id:"+countryid);
		System.out.println("country name:"+Countryname);
		System.out.println("jersy no:"+rh.jno);
		System.out.println("name of the cricketer:"+rh.name);
		Cricketer123 siri=null;
		System.out.println(siri.Countryname);
		siri.name="m.siraj";
		System.out.println(siri.name);
		
		}

}
