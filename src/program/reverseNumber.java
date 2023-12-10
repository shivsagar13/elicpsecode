package program;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]={"sagar","raj","shambhu","kedar","Harsh"};
		boolean s=false;
		for(int i=0;i<arr.length;i++)
		{
		for(int j=i+1;j<arr.length;j++)
		{
		if(arr[i]==arr[j])
		{
		System.out.println("find Duplicate:"+arr[i]);
		s=true;
		break;
		}
		}
		}
		if(s==false)
		{
		System.out.println("not find out");
		}
       
     
    	   
       
	}

}
