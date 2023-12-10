package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DifferentWayToAddDataInCollection {
	void wayOneToAddData()
	{
	ArrayList<Integer>sk=new ArrayList<Integer>();
	sk.add(10);
	sk.add(20);
	Set<String>bk=new HashSet<String>();
	bk.add("sagar");
	bk.add("jay");
	System.out.println(sk);
	System.out.println(bk);
	}
	void wayTwoAddData()
	{
    Set<Integer>sk=new HashSet<Integer>	()	
    		{{
    			add(10);
    			add(20);
    			add(40);
    		}};
	System.out.println(sk);
	}
	void wayThreeAddData()
	{
	ArrayList<String>gk=new ArrayList(Arrays.asList("sagar","ram","jay"));
	System.out.println(gk);
	for(String i:gk)
	{
		System.out.println(i);
	}
		
	}
	public static void main(String[] args) {
		DifferentWayToAddDataInCollection obj=new DifferentWayToAddDataInCollection();
		//obj.wayOneToAddData();
		//obj.wayTwoAddData();
	    obj.wayThreeAddData();
		}
}
