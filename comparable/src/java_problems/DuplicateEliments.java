package java_problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class DuplicateEliments {
	public static void main(String[] args) {
		
	
 ArrayList<Integer> list = new ArrayList<Integer>();
		 
         list.add(10);
         list.add(0);
		 list.add(5);
		 list.add(10);
		 list.add(5);


       HashSet<Integer> newData = new HashSet<Integer>();
       for (Integer integer : list) {
             newData.add(integer);
       }
       System.out.println(newData);
//--------------------------------binarySearch----------------       
       System.out.println("______________");
       int i = Collections.binarySearch(list,10);
       System.out.println(i);
//------------------------------sort---------------------------
       Collections.sort(list);
}
}
