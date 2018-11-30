import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetandListasReturntypeQ4 {

	public static void main(String[] args) {
		example();
		ArrayList<Integer> list1=listAsReturnType();
		for(int s:list1)
		{
			System.out.print(s+" ");
		}
		
		System.out.println();
		
		//Calling the method for set
		Set<String> set2= setAsReturnType();
		for(String s:set2)
		{
			System.out.print(s+" ");
		}
		
		System.out.println();
		comparingLists();
		
		basicSet();		
		
	}
	
	public static void example()
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Obj1");
		list.add("Obj2");
		list.add("Obj3");
		
		for(String s:list)
		{
			System.out.println(s);
		}
	}
	
	public static ArrayList<Integer> listAsReturnType()
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(25);
		list.add(21);
		
		return list;
		//returning the list
	}
	
	public static Set<String> setAsReturnType()
	{
		Set<String> set=new HashSet<String>();
		set.add("SDET");
		set.add("Final");
		set.add("Assesment");
		set.add("session");
		return set;
		//returning the set values
	}

	public static void comparingLists() {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(5);
		list1.add(25);
		list1.add(21);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(5);
		list2.add(25);
		list2.add(21);
	
		if(list1.equals(list2))
		{
			System.out.println("Matching");
		}
		else {
			System.out.println("Not Matching");
		}
		
	}
	
	public static void basicSet()
	{
		Set<String> set=new HashSet<String>();
		set.add("SDET");
		set.add("Final");
		set.add("Assessment");
		set.add("session");

		System.out.println("Printing Set values by using Iterator");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("--- Printing Set values by using for loop--");
		for(String s:set)
		{
			System.out.println(s);
		}
		
		System.out.println("--Printing Set values by using for each loop--");
	
		
		System.out.println("--Finding a Set value --");
		if(set.contains("SDET"))
		{
			System.out.println("Match found");
		}
		else
		{
			System.out.println("Match not found");
		}
	}
}


