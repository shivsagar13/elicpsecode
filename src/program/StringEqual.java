package program;

public class StringEqual {

	void stringEqual()
	{
		String s1= "hello";
		String s2="hello";
		
		
		String x1 =new String ("hello");
		
		String x2 =new String ("hello");
	
	// only check value not the memory location	
		
		
		if(s1.equals(x2))
		{
			System.out.println("value are same");
		}
		
		else
		{
			System.out.println("value are not same");
		}
		
	}	
		
	public static void main(String[] args) {
		
		StringEqual obj = new StringEqual();
		
		obj.stringEqual();
		
	}
	
	
	
}
