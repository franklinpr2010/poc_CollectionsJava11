package com.demo.collections.genericsuperclasses;

public class Main {
	public static void main(String[] args) {
		Box<Integer> box = new Box<Integer>();
		box.value = 7;
		
		int x = box.getValue();
		
		System.out.println(x);
		

	}
}
