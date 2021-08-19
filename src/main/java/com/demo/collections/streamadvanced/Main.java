package com.demo.collections.streamadvanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.demo.collections.optional.Person;

public class Main {
	
	public static void main(String[] args) {
		List<Person> pessoas =  new ArrayList<Person>(Arrays.asList(new Person("Franklin1", 9), new Person("Franklin2", 18), new Person("Franklin3", 19), new Person("Franklin4", 20)));
		
		boolean allMatch = pessoas.stream().allMatch(p-> p.getIdade() > 10);
		System.out.println(String.format("existem somente valores maiores que 10?  %s", allMatch ? "sim" : "não"));
		
		boolean anyMatch = pessoas.stream().anyMatch(p-> p.getIdade() < 10);
		System.out.println(String.format("existem algum valor menor que 10?  %s", anyMatch ? "sim" : "não"));
		
		boolean noneMatch = pessoas.stream().noneMatch(p-> p.getIdade() < 10);
		System.out.println(String.format("não existe nenhum valor menor que 8?  %s", noneMatch ? "sim" : "não"));
	}

}
