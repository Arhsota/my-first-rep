// Andrey, author 4/10/2016 homework for lesson1, Java 1


public class Lesson1 {
	

	public static void main(String[] args) {
		
		
		int   a,b,year;              //Initializing some types of variables
		byte  c=25;                 // homework point 2
		float d=3.14f;
		char  mychar='c';
		boolean e=true;
		a=1;
		b=15;
		year=304;
		System.out.println(a);    //this is only for help
		System.out.println(b);    //to see the correct or not
		System.out.println(c);
		System.out.println(mychar);
		System.out.println(d);
	    System.out.println(test1(a,b,c,d)); // homework point 3
	    System.out.println(testSum(a,b));   // homework point 4
	 // homework point 5
	     if (checkYear(year) == true) {
	    	 System.out.println("Year "+year+" is a Leap Year");
	    	 }  
	     else
	     {
	    	 System.out.println("Year "+year+" is an ordinary Year");
	     }
 }
	 static float test1 (int a,int b,byte c,float d)	// homework point 3
	     {
		 return a*(b+(c/d));
		 }
	 
	 static boolean testSum(int a,int b)                // homework point 4
	     {
		 if ((a+b)>10 && (a+b)<20) 	return true;
		 else return false;
		 }
	
	static boolean checkYear(int year)                  // homework point 5
	{
		   if ((year%4 == 0) && (year%100 != 0) || (year%400==0)) return true;
		   else return false;
	}

}
