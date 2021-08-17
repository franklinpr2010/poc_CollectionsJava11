package com.demo.collections.genericsuperclasses;

public class Store<T> {
	public T value;
	
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	
}
