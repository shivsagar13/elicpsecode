package program;

public class ParameterPassing {

	void testMethod( int i,String s,int x,char c)
	{
		System.out.println("i am method one");
		
	}
	void testMethod(int a)
	{
		System.out.println("i am method two");
		
	//System.out.println(a);
		int i=10+a;
		System.out.println(i);
	}	
    int testMethod(String h,int j,float d)
    {
    	String s="sagar";
    	int g=23;
    	float f =34.23f;
    return 16;
    }
	
	
	

	public static void main(String[] args) {
		ParameterPassing obj =new ParameterPassing ();
		obj.testMethod(5);
		obj.testMethod(24,"sagar",23,'c');
	}
}
	

     