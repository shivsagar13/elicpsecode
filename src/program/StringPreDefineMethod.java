package program;

public class StringPreDefineMethod {

	void charAtMethod()
	{                     //  0 1 2 3 4
		String s ="hello";//  h e l l o
		
		System.out.println(s.charAt(2));
	}
	
	void lenthMethod()
	{
		String s ="hello     ";
		
		System.out.println(s.length());
		
	int i	= s.length();
		
		System.out.println(i);
	}
	
	void equalMethd()
	{
		String s="hello";
		String b="Hello";
		
		if (s.equals(b))
		{
		System.out.println("same");	
		}
		else
		{
			System.out.println("not same");
		}
	}
	void equalIgnoreCaseMethod()
	{
		String s1= "test";
		String s2= "Test";
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("same");
			
		}
		else
		{
			System.out.println(" not same");
			
			
		}
		
	}
	void trimMethod()
	{
		String s="  hello  ";
		 
	String a	= s.trim();
		System.out.println(s.length());
		System.out.println(a.length());
		
	}
		
		
		
	
	
	
	
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringPreDefineMethod  obj =new StringPreDefineMethod ();
		
		obj.charAtMethod();
		obj. lenthMethod();
		obj.equalMethd();
		obj.equalIgnoreCaseMethod();
		obj.trimMethod();
	}

}
