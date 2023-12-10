package Interface;

 interface Testinter
  {
	int a=10;//by default variable is static and final
	void testMethod();//abstract method
  }
	
 public class InterfaceDemo implements Testinter
 {
	public void testMethod()
	 { 
	
		 System.out.println(a);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Testinter obj=new InterfaceDemo();
	obj.testMethod();

	}

	}
