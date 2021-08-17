package com.demo.collections.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
	
@SuppressWarnings("rawtypes")
public static void main(String[] args) {
	
	
	@SuppressWarnings("unused")
	Comparator compare = new Comparator<Integer>() {

		
		@Override
		public int compare(Integer o1, Integer o2) {
			if(o1<02) {
				return 1;
			} else if(o1==o2) {
				return 0;
			} else {
				return -1;
			}
			
		}
		
	};
	
	
	TreeSet treeSet = new TreeSet<Integer>(compare);
	treeSet.add(45);
	treeSet.add(43);
	treeSet.add(34);
	treeSet.add(33);
	
	System.out.println(treeSet);
}
	

}
