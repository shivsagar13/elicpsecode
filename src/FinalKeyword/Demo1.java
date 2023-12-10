package FinalKeyword;

public  class Demo1 {

	
	final int a=22;
	final void m1()
	 {
	// a=22  --------->final keyword is constant we cannot change
     System.out.println(a);
	 } 
	class Demo2 extends Demo1  //class cannot be extends
	  {
	//	final void m1()//methods cannot be override in subclass
	  {
		// a=22  --------->final keyword is constant we cannot change
		System.out.println(a);	
	  }
	public static void main(String[] args) {
		 Demo1 obj =new Demo1();
		 obj.m1();
	}
}
}