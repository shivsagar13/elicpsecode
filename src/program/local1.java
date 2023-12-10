package program;

public class local1 {

	
	void localmethod()
	{
	int i =20;
	String s= "sagar";
	float f=10.20f;
	char c ='s';
	System.out.println(i);
	System.out.println(s);
	System.out.println(f);
	System.out.println(c);
	
	
	}

	void localmethod1()
	{
		int a =20;
		String b="sagar";
		float c =30.23f;
		char d='s';
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
		
	}
	public static void main(String[] args) {
		
		local1 obj= new local1();
		
		obj.localmethod1();
		obj.localmethod();
		

		
		
		
		
		
	}
	
}
