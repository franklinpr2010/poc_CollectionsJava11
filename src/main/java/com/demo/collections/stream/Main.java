package com.demo.collections.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.demo.collections.optional.Person;

public class Main {


	public static void main(String[] args) {
		Stream<Integer> numeros = Stream.of(23, 10, 11, 12, 15, 50);
		numeros.filter(i -> i > 30).forEach(i -> System.out.println(i));
		Stream<String> nomes = Stream.of("franklin", "marcos", "suzana", "mario");
		nomes.filter(s -> s.startsWith("f")).forEach(s -> System.out.println(s));
	
		//Transformando para streams
		int[] a = new int[] {1,2,3,4};
		Stream.of(a).forEach(i -> System.out.println(i));
		
		
		//min e max
		List<Integer> listas = new ArrayList<>(Arrays.asList(20,3,11,5,6,10));
		Optional<Integer> valorMinimo = listas.stream().min((c, b) -> Integer.compare(c, b));
		System.out.println(valorMinimo.get());
		//se valor estiver presente
		valorMinimo.ifPresent(i -> System.out.println(i));
		
		//max value
		Optional<Integer> valorMaximo = listas.stream().max((c, b) -> Integer.compare(c, b));
		System.out.println(valorMaximo.get());
		//se valor estiver presente
		valorMaximo.ifPresent(i -> System.out.println(i));
		
		long quantos = listas.stream().filter(i -> i % 2 == 0)
		.filter(i -> i > 5)
		.count();
		
		System.out.println(String.format( "Contem %s números", quantos));
		
		
		//Reduce - reduz uma operação a uma só, somando dois numeros
		//primeiro é o incrementador e depois a soma
		Optional<Integer> reduce = listas.stream().filter(i -> i % 2 == 0)
				.filter(i -> i > 5)
				.reduce((f,j) -> f+j);
		
		System.out.println(reduce.orElse(0));
		
		//Reduce - reduz uma operação a uma só, somando dois numeros começando com 10
				int reduceComIdentity = listas.stream().filter(i -> i % 2 == 0)
						.filter(i -> i > 5)
						.reduce(10, (f,j) -> f+j);
				
		
		
		
		//Reduce para pegar a maior idade		
		List<Person> pessoas =  new ArrayList<Person>(Arrays.asList(new Person("Franklin1", 17), new Person("Franklin2", 18), new Person("Franklin3", 19), new Person("Franklin4", 20)));
		Person maiorIdade = pessoas.stream().reduce((p1, p2) -> {
			if(p1.getIdade() > p2.getIdade()) 
				return p1;
			else return p2;
		}).get();
		
		System.out.println(String.format( "O integrante %s tem %s anos", maiorIdade.getNome(), maiorIdade.getIdade()));
		
	    //Using binaryComparator
		Comparator<Person> comparingDouble = Comparator.<Person>comparingDouble(p -> p.getIdade());
	    BinaryOperator<Person> minBy = BinaryOperator.minBy(comparingDouble);
	   
	    pessoas.stream().reduce(minBy).ifPresent(value -> System.out.println(value.getNome()));
	    
	    //Usa-se map quando quer converter o stream em uma nova lista
	    
	    Stream<Integer> somandoMap = listas.stream().map(i -> i + 10);
	    somandoMap.forEach(somandoPor10 -> System.out.println(somandoPor10));
	    
	    //retornando o maximo
	    Optional<Integer> max = listas.stream().max(Integer::compareTo);
	    System.out.println(max.get());
	    
	    //Gerando a soma, tem que passar para integer
	    IntStream mapToInt = listas.stream().mapToInt(ih -> ih);
	    System.out.println(mapToInt.sum());
	    
	    //Gerando a soma, tem que passar para integer
	    DoubleStream mapToDouble = listas.stream().mapToDouble(ih -> ih + 0.0);
	    System.out.println(mapToDouble.sum());
	    
	  //Map para object, multiplo código
	    List<Integer> listas2 = new ArrayList<>(Arrays.asList(20,3,11,5,6,10));
	    
	    listas2.stream().map(lll -> {
	    	System.out.println("Mapping " + lll);
	    	return lll + 10;
	    }).filter(lll -> {
	    	System.out.println("Filtering " + lll);
	    	return lll > 15;
	    }).forEach(lll -> System.out.println(String.format("item nova lista %s.", lll)));
	    
	    
	    
	    //Flat map é quando quer fazer operações com duas listas
	    int[] listas3 = new int[] {21,33,114,55,66,107};
	    int[] listas4 = new int[] {201,32,112,52,62,120};
	    
	    Stream.of(listas3, listas4).flatMapToInt(IntStream::of)
	    .max().ifPresent(System.out::println);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
