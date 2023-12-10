package program;

public class program6 {
//create a new class and inside the class,create a new method for following operators
	// arithmetic operation ,comparision operator ,logical operator
	
	
	void addition()
	{
	int a =20;
	int b=30;
	int sum =a+b;
	
	System.out.println(sum);
	}
	
	void substraction()
	{
		int a =30;
		int b=30;
		int sub =a-b;
		
	System.out.println(sub);	
		
	}
	
	void comparision ()
	{
		int a =25;
		int b=30;
		if(a<b)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("flase");
		}
		
	}
	void logical()
	{
		
		int a=20;
		int b=30;
		int c=20;
		
		if (a<=b && b>=c)
		{
			System.out.println("true");
		}
		else 
		
		{
			System.out.println("flase");
		}
		
		
		
		}
	
	public static void main(String[] args) {
		program6 obj =new program6();
		
		obj.addition();
		obj.substraction();
		obj.comparision();
		obj.logical();
		
		
		
		
	}
	
}





