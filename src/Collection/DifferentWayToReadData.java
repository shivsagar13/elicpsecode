package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DifferentWayToReadData {
	//Iterator sk=sk.iterator();
	// sk.hasNext()//sk.next()
	void wayOneReadData()
	{
	List<String>sk=new ArrayList<String>();
	
	sk.add("sagar");
	sk.add("ram");
	sk.add("sita");
	sk.add("siya");
	
	Iterator sgk=sk.iterator();
	
	while(sgk.hasNext())
	{
		System.out.println(sgk.next());
	}
	}
	void wayTwoReadData()
	{
		ArrayList<String>sk=new ArrayList<String>();
		sk.add("sagar");
		sk.add("ram");
		sk.add("sita");
		sk.add("siya");
		
	//	int i=sk.size();
	//	System.out.println(i);
		for(int i=0;i<sk.size();i++ )
		{
		System.out.println(sk.get(i));
		}
		}
	void wayThreeReadData()
	{
		ArrayList<String>sk=new ArrayList<String>();
		sk.add("sagar");
		sk.add("ram");
		sk.add("sita");
		sk.add("siya");
		int i=0;
		int s=sk.size();
		while(i<sk.size())
		{
			System.out.println(sk.get(i));
			i++;
		}
		}
	void wayFourReadData()
	{
		List<String>sk=new ArrayList<String>();
		
		sk.add("sagar");
		sk.add("ram");
		sk.add("sita");
		sk.add("siya");
		
		for(String i:sk)
		{
			System.out.println(i);
			
		}
		}
	public static void main(String[] args) {
		DifferentWayToReadData obj=new DifferentWayToReadData();
	//	obj.wayTwoReadData();
	//	obj.wayThreeReadData();
	//	obj.wayOneReadData();
		obj.wayFourReadData();
	}
}
