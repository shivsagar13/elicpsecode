package program;

public class Statickeywords {

	static int a=20;// static global variable
           int b=30;
   // without static method we can access the static as well as non static  variables      
	void skMethod()
	{
		System.out.println(a);
		System.out.println(b);
	}
	// static method we can access only static variable
     static	void bkMethod()
    {
	System.out.println(a);
	System.out.println(a);
    }
	
	static void skMethodOne()
	{
		System.out.println("hello");
		
	}
	static int skMethodTwo()
  {
	return 34;  
	
  }
	static String skMethodTwo(char c)
	{
		return "sagar";
	}
	
	 Statickeywords()//we can not use static keyword for constructor
	 {
		 System.out.println("ram");
	 }
	public static void main(String[] args) {
		skMethodOne();
		skMethodTwo();
		skMethodTwo('s');
		
	}
	
}
