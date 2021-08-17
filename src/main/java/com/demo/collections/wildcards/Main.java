package com.demo.collections.wildcards;

public class Main {
	public static void main(String[] args) {
		String[] countries = new String[] {"Nigeria", "India", "USA"};
		Integer[] scores = new Integer[] {22, 92, 77, 67};
		Integer[] scores2 = new Integer[] {22, 92, 77, 67, 69};
		
		Store storte1 = new Store<>(countries);
		Store storte2 = new Store<>(scores);
		Store storte3 = new Store<>(scores2);
		
		//System.out.println(storte2.list.length);
		//System.out.println(storte1.list.length);
		//System.out.println(storte3.list.length);
		
		System.out.println(storte2.greaterThan(storte1));
	}
}
