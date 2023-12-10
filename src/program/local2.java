package program;

public class local2 {

	int i=20;

	
	
	
	void global()
	{
		int a=45;
		int  f =33;
		
		int sum =a+f;
		System.out.println(sum);
		
		
	}
	void global1()
	{
		float f =20.23f;
		float s=34.33f;
		
		float add=f+s;
		System.out.println(add);
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		local2 obj =new local2();
		
		obj.global();
		
		obj.global1();
	}
}
