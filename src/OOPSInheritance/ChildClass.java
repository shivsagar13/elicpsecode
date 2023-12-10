package OOPSInheritance;

public class ChildClass extends ParentClass {

	void childClassMethod()
	{
		System.out.println("i am chlid clas Method");
		
	}
	int a=20;
	static int d=30;
	static void staticMethod()
	{
		System.out.println("i am static method");
	}
	int  returnMethod()
	{
		System.out.println("i am return method");
		return 100;
	}
	
	public static void main(String[] args) {
	ChildClass objA=new ChildClass ();
	objA.childClassMethod();
	staticMethod();
	objA. returnMethod();
	objA.parentClassMethod();
	objA.parentClassParametizeMethod(10);
	
	 ParentClass objB=new  ParentClass ();
//	 ChildClass objc=new ParentClass();//this combination is not allowed
	 
	// ParentClass objD=new ChildClass();
	}
}
