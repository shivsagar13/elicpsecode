package program;

public class ParameterPassing2 {

	void testMethod(String s,int x,float f)
	{
		System.out.println("i am method one");
		
	}
	void testMethod(int a)
	{
		System.out.println("i am method two");
		
	System.out.println(a);
		int i=10+a;
		System.out.println(i);
		
		
	}
	public static void main(String[] args) {
		ParameterPassing2 obj =new ParameterPassing2 ();
		obj.testMethod(5);
		obj.testMethod("sagar",23,35.5f);
	}
}
	

     