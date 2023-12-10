package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Interface {

// List<Full data type name>variable name	=new typeoflist <Full data type name>();
// List <Integer>sk=new ArrayList<Integer>();// LinkedList-----Duplicate allowed
//set<String>bk=new HashSet<String>();//LinkedHashSet------Not Duplicate allowed
	void listMethod()
	{
// List <Integer>variable name=new ArraysList<Integer>();-------syntax 
		
	List<Integer>sk=new LinkedList <Integer>();
    	
	sk.add(10);
	sk.add(30);
	sk.add(20);
	sk.add(40);
	sk.add(10);
	
	for (int i:sk)
	{
		
	System.out.println(i);	
	}
		
   }
	void demomethod()
	{
	Set<Integer>dk=new HashSet<Integer>	();
	dk.add(10);
	dk.add(20);
	dk.add(30);
	dk.add(10);
	
	for(int i:dk)
	{
		System.out.println(i);
	}
		
		
	}
	void skMethod()
	{
		
	Set<String>bk=new LinkedHashSet<String>();
	bk.add("pune");
	bk.add("kolhapur");
	bk.add("mumbai");
	bk.add("pune");
		for(String i:bk)
		{
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		Interface obj=new Interface ();
		obj.listMethod();
	//	obj.demomethod();
	//	obj.skMethod();
	}
	
}
