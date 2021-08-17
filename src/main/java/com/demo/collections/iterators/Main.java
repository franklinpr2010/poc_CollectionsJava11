package com.demo.collections.iterators;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List list = Arrays.asList(3,5,10,12,15,16);
		
		list.spliterator();
		
		Iterator iterator = list.iterator();
		
		while (iterator.hasNext()) {
			Integer number = (Integer) iterator.next();
			System.out.println("Has next...." + number);
			
			
			if(number % 2 == 0) {
				//iterator.next().(0);
				iterator.remove();
			}
		}
		
		
	}

}
