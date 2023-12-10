package program;

public class StringLiteral {

	void stringLiteral()
	{
		String s1="hello";
		String s2="hello";
		
		String s3=s1.concat(s2);
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
	
	
	public static void main(String[] args) {
		
		StringLiteral obj=new StringLiteral();
		obj.stringLiteral();


		
	}
}
