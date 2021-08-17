package com.demo.collections.optional;

import java.util.Optional;

public class Main {
	
	public static void main(String[] args) {
		Optional<Integer> integerValue = Optional.empty();
		integerValue = Optional.of(34);
		
		//integerValue = Optional.ofNullable(null);
		
		
		if(integerValue.isPresent())
			System.out.println(integerValue.get());
		else
			System.out.println("No value");
		
		System.out.println(integerValue.orElse(100));
		
		
		System.out.println(integerValue.orElseGet(() -> 100));
		
		//Pode lançar uma exception
		System.out.println(integerValue.orElseThrow(() -> new IllegalStateException()));
		
		//Lançando uma ArithmeticException
		System.out.println(integerValue.orElseThrow(ArithmeticException::new));
		
		//Aceitando um map
		System.out.println(integerValue.map(i -> i * 10).get());
		
		//Transformando em string
		System.out.println(integerValue.map(i -> i + "lines").get());
		
		//Transformando em string orElse
		System.out.println(integerValue.map(i -> i + "lines").orElse("No line"));
		
		//Optional Filter
		System.out.println(integerValue.filter(i -> i ==2));
		
		
	}

}
