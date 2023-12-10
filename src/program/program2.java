package program;

public class program2 {

	
	void doWhile()
	{
	int i= 10;
		
		do
		{
			System.out.println(i);
			i--;
			
		}while (i>=1);
		
	}
	void reverse()
	{
		int a=1234;
		   int rev=0; 

		     do
		     {
		     int lastdigit=a%10;
		     rev=rev*10+lastdigit;
		     a=a/10;
		     }while(a!=0);
		     System.out.println(rev);
		
		
	}
	void print ()
	{
		// 5 10 15 20 25 30 35 40 45 50
		 //  int i=5;

		for(int i=5;i<=50;i++)
		{
		if(i%5==0)
		{
		System.out.println(i);


		}
}
		}
	void even()
	{
		for(int i=2;i<=10;i++)
		{
		System.out.println(i);
		i++;
		}
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		program2 obj=new program2();
	//	obj.reverse();
	//	obj.print();
		obj.even();
	

	}

}
