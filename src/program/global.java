package program;

public class global {

	int a =30;
	int b =40;
	
	void addition()
	{
		int a=40;
		int b=50;
		
		int sum =a+b;
		System.out.println(sum);
		
	}
	
	void substraction()
	{
		int a =45;
		int b=30;
		int sub= a-b;
		
		System.out.println(sub);
	}
	
	void division()
	{
		int a =45;
		int b=30;
		int div= a/b;
		
		System.out.println(div);
	}
	
	void multiplication()
	{

		int a =45;
		int b=30;
		int mul= a*b;
		
		System.out.println(mul);
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		global obj =new global();
		
		obj.addition();
		obj.substraction();
		obj.division();
		obj.multiplication();
		
		
		
	}
	
}
