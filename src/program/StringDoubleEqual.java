package program;

public class StringDoubleEqual {

	void stringDoubleEqual ()
	{
		String s1="hello";
		
		String s2="hello";
		
		String x1=new String ("hello");
		String x2=new String ("hello");
	//check value as well as memory location
		
		
		if(x1==x2)
		{
			System.out.println("value are same");
		}
		else
		{
			System.out.println("value are not same");
			
		}
		
	}
		
		public static void main(String[] args) {
			
			StringDoubleEqual obj =new StringDoubleEqual ();
			
			obj.stringDoubleEqual();
			
			
		}
		
	
	
	
	
	
}
