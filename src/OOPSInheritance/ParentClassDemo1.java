package OOPSInheritance;

public class ParentClassDemo1 {
	
	void testMethod()
	 {
		String a[]= {"java","selenium","Api"};
		for(String i:a)
		{
			System.out.println(i);
		}
	 }
    void testDemo()
     {
	   int a[] = {10,100,40,20,50};
	   int max=a[0];
	   for(int i=1;i<a.length;i++)
	   {
		  if(a[1]>max) 
		  {
	       max=a[i];
		  }		   
	   }System.out.println("max value:"+max);	   
     }
	void testDemo1()
	   {
		int a[]= {100,20,50,5,60};
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}			
		}System.out.println("min value:"+min);		
	}	
	ParentClassDemo1()
	{
		System.out.println("i am constrctor");
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	}

}
