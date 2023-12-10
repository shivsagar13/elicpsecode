package Arrays;

import java.util.Arrays;

public class PreDefineMethod {

	void sortMethod()
	{
		int a[]= {1,3,2,5,4};// 1 2 3 4 5
		
		Arrays.sort(a);
		for(int i:a)
		{
			System.out.println(i);
		}
	}
	void sortMethod2()
	{
		String s []= {"Sagar","ram","Shiv","kedar"};
		
		Arrays.sort(s);
		for(String x:s)
		{
			System.out.println(x);
		}
	}
	void equalMethod()
	{
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,5};
		
	System.out.println(Arrays.equals(a1, a2));
		
	}
	void printElementOneLine()
	{
		int x1[]= {1,2,3,4,5};
		String x2[]= {"sagar","shiv","ram"};
		
		//System.out.println(Arrays.toString(x1));
		System.out.println(Arrays.toString(x2));
		
		
	}
		
	public static void main(String[] args) {
		PreDefineMethod obj=new PreDefineMethod();
	//	obj.sortMethod();
	//	obj.sortMethod2();
	//	obj.equalMethod();
		obj.printElementOneLine();
	}
}
