package OOPSInheritance;

public class ChildClassDemo1 extends ParentClassDemo1 {

	    void skMethod()
	    {
	    	int a[]= {22,44,66,77};
	    	int search_ele=100;
	    	boolean s=false;
	    	
	    	for(int i=0;i<a.length;i++)
	    	{
	    		if(search_ele==a[i])
	    		{
	    			System.out.println("Element search at:"+a[i]);
	    			s=true;
	    		     break;	    
	    		}	    		
	    	}
	    	if(s==false)
	    	{
	    		System.out.println("Element not found");
	    	}
	    }
	    public static void main(String[] args) {
		// TODO Auto-generated method stub
	    	 ChildClassDemo1 obj=new ChildClassDemo1();
	    	 obj.skMethod();
	    	 obj.testMethod();
	    	 obj.testDemo();
	    	 obj.testDemo1();
	}
}
