package com.demo.collections.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
		
		System.out.println(integerValue.filter(i -> i ==2).orElse(100));
		
		integerValue.ifPresent(i -> System.out.println(i));
		
		Optional<Person> person = number(1);
		
		System.out.println(person.get());
		
		
		Person person2 = person.filter(p -> p.getIdade() > 20)
		.orElse(new Person("Sonia", 20));
		
		System.out.println(person2.getNome());
		
		
	}
	
	@SuppressWarnings("static-access")
	static Optional<Person> number(int position) {
		Optional<Person> person = Optional.empty();
		List<Person> personList = new ArrayList<>(Arrays.asList(new Person("Franklin", 31),new Person("Franklin", 32),new Person("Franklin", 33),new Person("Franklin", 34),new Person("Franklin", 35)));
		if(position >= 0 && position < personList.size()) 
			return person.of(personList.get(position));
		return Optional.empty();
	}

}
