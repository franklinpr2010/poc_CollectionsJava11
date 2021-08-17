package com.demo.collections.queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Integer integerArray[] = {1,66,88,100, 201};
		List<Integer> integerList= new ArrayList<>(Arrays.asList(integerArray));
		integerList.add(90);
		
		System.out.println(integerArray);
		
		for (Integer integer : integerList) {
			System.out.println(integer);
		}
		
		
	}

}
