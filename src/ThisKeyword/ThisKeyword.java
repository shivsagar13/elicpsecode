package ThisKeyword;

public class ThisKeyword {

	int c=35;//global variable
	int b=40;
	String f="yash";
	
	
	void fkMethod()
	{
		int a=50;
	    int b=40;
	    int add=a+this.b;
	    System.out.println(add);
		
	}
	void skMethod()
	{
		int a=50;
		System.out.println(a);
		System.out.println(this.c);
	}
	void skMethod(int a)
	{
		System.out.println(c);
		System.out.println(this.b);
		
	}
	void skMethod(String s)
	{
		System.out.println(this.f);
	}
	public static void main(String[] args) {
		ThisKeyword obj=new ThisKeyword ();
	//	obj.skMethod();
	//	obj.skMethod(4);
		obj.skMethod("sk");
		obj.fkMethod();
	}
}
