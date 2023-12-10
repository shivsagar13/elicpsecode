package OOPSPolymorphism;

public class Overloading {

	
// in case method name same but method signature different it knows as method overloading.
	
	void testMethod(int a)
	{
		//int s=a;
		System.out.println(a);
	}
	void testMethod(String s)
	{
		String d=s;
		System.out.println(d);
		
	}
	void testMethod(String d,char c)
	{
		String f=d;
		System.out.println(f);
	}
	public static void main(String[] args) {
		Overloading obj=new Overloading();
		obj.testMethod(10);
		obj.testMethod("sagar");
		obj.testMethod("shiv", 'c');
		
	}
}
