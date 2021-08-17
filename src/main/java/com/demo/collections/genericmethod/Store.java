package com.demo.collections.genericmethod;

public class Store<T extends Number> {
	T[] list;
	
	public Store(T[] list) {
		this.list = list;
	}
	
	/**
	 * Usa-se o curinga caso tenha um tipo generico e quiser usar tipos de listas diferentes
	 * @param otherStore
	 */
	public Boolean greaterThan(Store<? extends Number> otherStore) {
		if(list.length > otherStore.list.length) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
