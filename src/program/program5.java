package program;



public class program5 {

	void reversemethod()
	{
		// 5 4 3 2 1
	int i = 12345;
	
	int rev=0;

	for (;i==0;)
	{
		int lastdigit =i%10;
		rev =rev *10+ lastdigit;
		i= i/10;
		
		
	}System.out.println(rev);
		
}

	public static void main(String[] args) {
		
		program5 obj= new program5();
		obj. reversemethod();
				
		
		
	}
	
	
}