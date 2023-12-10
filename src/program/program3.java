package program;

public class program3 {
// create a new class and inside the class,create a new method
//	 printing the even number from 1 to 10,create a new method printing the 
//	odd number from 1 to 10.
// 1 3 5 7 9 10	//2 4 6 8 10
	void oddnumber()
	{
		int i =1;
		
		while (i<=10)
		{
			
			System.out.println(i);
			i++;
			i++;
			
		}
	}	
	void evennumber ()
	{
		int i=2;
		
		while (i<=10)
		{
			System.out.println(i);
			i++;
			i++;
			
			
		}
		
}
	
	
	
	
	
	
	
	
		public static void main(String[] args) {
			
			program3 obj= new program3();
			
			obj.oddnumber();
			obj.evennumber();
			
		}
		
		
		
		
		
	

}
