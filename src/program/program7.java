package program;

public class program7 {
//create a new class and inside the class,create a new method to reverse the number by 
// using while loop.create another method to reverse the number using for loop.
// 12345 54321

  void reverse()
  {
	 int i=12345;
	 int rev=0;
	while (i!=0)
	 {
		int lastdigit =i%10;
		
		rev=rev*10+lastdigit;
		
		i=i/10;
		 
		 
		 
	 }System.out.println(rev);
	 
  }
 
  
  
 
	
  
	public static void main(String[] args) {
		
		program7 obj=new program7();
		obj.reverse();
		
		
	}

}
