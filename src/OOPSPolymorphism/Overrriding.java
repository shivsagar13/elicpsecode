package OOPSPolymorphism;

public class Overrriding extends Overloading {

// in case inheritance place between child and parent class and method name and
//method signature same (child and parent)	 it knows as method overriding.
	void testMethod(int a)
	{
		int s=a;
		System.out.println(s);
		
	}
	public static void main(String[] args) {
		Overrriding obj=new Overrriding();
		obj.testMethod(10);
		obj.testMethod(20);
	
	
		
	}
}
