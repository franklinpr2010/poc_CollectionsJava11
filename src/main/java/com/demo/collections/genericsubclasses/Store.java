package com.demo.collections.genericsubclasses;

public class Store<T> extends Box {
	public T value;
	
	public Store(T value) {
		this.value = value;
	}
	
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	
}
