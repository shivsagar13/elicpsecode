package ExceptionHandling;

public class CoreJava {

	 static  void testMethod()
	   {
		 try
		 {
			 int a=10/0;
			 System.out.println(a);
		 }
		 
		 catch (Exception e)
		 {
			 System.out.println(e);
		 }
		 finally
		 {
			 System.out.println("finally block excuted");
		 }
	   }
	
	   
	
	public static void main(String[] args) {
		System.out.println("execution start");
		testMethod();
		 System.out.println("execution end");
		 
	}   
	   
}
