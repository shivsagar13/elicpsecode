package Arrays;

public class Corejava {
//Arrays means store multiple and random data store in one variable.
//syntax:data type variable name[]={ value1,value2,.......};	
	void testMethod()
	{
		int a[]= {1,4,5,6};
		
		for(int i:a)
		{
			System.out.println(i);
		}
		
	}
	void demoMethod()
	{
		String s [] = {"sagar","shiv","ram "};
		
		for (String i:s)
		{
		System.out.println(i);	
		}
		
	}
	void charMethod()
	{
		char [] d= {'s','a','g'};
		for (char i:d)
		{
			System.out.println(i);
		}
	}
	void floatMetyhod()
	{
		float [] f= {2.3f,2.1f,5.1f};
		for(float h:f)
		{
			System.out.println(h);
		}
		
		
	}
	public static void main(String[] args) {
		Corejava obj=new Corejava();
		obj.testMethod();
		obj.demoMethod();
		obj.charMethod();
		obj.floatMetyhod();
	}
}
