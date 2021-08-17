package com.demo.collections.boundedtypes;

public class Main {
	public static void main(String[] args) {
		Store ferrari = new Store<Ferrari>(new Ferrari());
		ferrari.getValue().startEngine();
		Store lambo = new Store<Lambo>(new Lambo());
		lambo.getValue().startEngine();
	}
}
