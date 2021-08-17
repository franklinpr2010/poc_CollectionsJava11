package com.demo.collections.rawtypes;

public class Main {
	public static void main(String[] args) {
		Store store = new Store<>("Hello");
		
		String x = (String) store.getValue();
	}
}
