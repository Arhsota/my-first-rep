// Andrey, author 4/10/2016 homework for lesson1, Java 1


public class Lesson1 {
	

	public static void main(String[] args) {
		
		
		int   a,b;              //Initializing some types of variables
		byte  c=25;             // homework point 2
		float d=3.14f;
		char  mychar='c';
		boolean e=true;
		a=b=100;
		System.out.println(a);    //this is only for help
		System.out.println(b);    //to see the correct or not
		System.out.println(c);
		System.out.println(mychar);
		System.out.println(d);
	    System.out.println(test1(a,b,c,d)); // homework point 3
	
 }
	 static float test1 (int a,int b,byte c,float d)	{
		 return a*(b+(c/d));
		 }
	
	

}
