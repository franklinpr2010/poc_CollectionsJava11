package com.demo.collections.arraytolist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class Main {
	
	public static void main(String[] args) {
		Integer integerArray[] = {1,66,88,100, 201};
		List<Integer> integerList= new ArrayList<>(Arrays.asList(integerArray));
		integerList.add(90);
		
		System.out.println(integerArray);
		
		for (Integer integer : integerList) {
			System.out.println(integer);
		}
		
		//ordem crescente
		java.util.Collections.sort(integerList);
		System.out.println(integerList);
		//inverso
		java.util.Collections.reverse(integerList);
		System.out.println(integerList);
		
	}

}
