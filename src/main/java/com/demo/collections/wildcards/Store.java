package com.demo.collections.wildcards;

public class Store<T> {
	T[] list;
	
	public Store(T[] list) {
		this.list = list;
	}
	
	/**
	 * Usa-se o curinga caso tenha um tipo generico e quiser usar tipos de listas diferentes
	 * @param otherStore
	 */
	public Boolean greaterThan(Store<?> otherStore) {
		if(list.length > otherStore.list.length) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
