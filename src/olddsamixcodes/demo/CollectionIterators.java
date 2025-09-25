package olddsamixcodes.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Vishwas Iterator over collections
 *
 */
public class CollectionIterators {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(123);
		al.add(12);
		al.add(21);
		al.add(13);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);

		ArrayList al1 = new ArrayList();
		al1.addAll(al);
		System.out.println("Before:" + al1);
		Iterator itr2 = al1.iterator();
		while (itr2.hasNext()) {
			Integer i = (Integer) itr2.next();
			if (i > 10) {
				itr2.remove();
			}

		}
		System.out.println("After:" + al1);

		ArrayList gfg = new ArrayList<>(Arrays.asList("Geeks", "For", "Geeks"));

		System.out.println(al);
		System.out.println(gfg);

		Iterator itr = al.iterator();
		while (itr.hasNext())
			System.out.print(itr.next() + "\t");
		System.out.println();

		for (Object obj : al) {
			System.out.println("obj " + obj);
		}
		Object[] arr1=al.toArray();
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("For Loop " + arr1[i]);
		}

		LinkedList ll = new LinkedList<>();
		ll.add("Abcdef");
		ll.add(123);
		ll.add(4.35f);
		ll.add(2L);
		ll.add('c');

		System.out.println(ll);
		Iterator itr1 = ll.iterator();
		while (itr1.hasNext())
			System.out.println(itr1.next());
		System.out.println("--------------------------------------------------------------------");
		
		HashSet set=new HashSet<>();
	    set.add("asad");
	    set.add(123);
	    set.add("ksabchsd");
	    set.add(1.23f);
	    set.add(1.23f);
	    set.add("asad");
	    set.add(123);
	    set.add("ksabchsd");
	    set.add(1.23f);
	    set.add(1.23f);
	    System.out.println(set);
	    for(Object obj:set)
	    {
	    	System.out.println(obj);
	    }
	    Object[] array=set.toArray();
	    System.out.println(Arrays.toString(array));
	    for(int i=0; i<array.length; i++) {
	    	System.out.println(array[i]);
	    }
	    
	    Iterator its=set.iterator();
	    while(its.hasNext()) {
	    	System.out.println(its.next());
	    }
	    System.out.println("------------------------------------------");
	    
	    HashMap hm=new HashMap<>();
	    String s1="ABC";
	    String s2="ABC";
	    String s3=new String("ABC");
	    String s4=new String("ABC");
	
	    hm.put(1, s1);
	    hm.put(2, s2);
	    hm.put(3, s3);
	    hm.put(4, s4);
	   System.out.println("Size of hm:"+hm.size());
	   System.out.println("Contains:"+hm);
	   
	   for(Object obj:hm.entrySet())
	   {
		   System.out.println(obj);
	   }
	   
	   Object[] arrMap=hm.entrySet().toArray();
	   for(int i=0; i<arrMap.length; i++)
	   {
		   System.out.println("For Loop:"+arrMap[i]);
	   }
	   
	   Iterator itMap=hm.entrySet().iterator();
	   while(itMap.hasNext())
	   {
		   System.out.println(itMap.next());
	   }
	}
}
