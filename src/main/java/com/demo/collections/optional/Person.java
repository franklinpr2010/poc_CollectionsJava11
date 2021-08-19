package com.demo.collections.optional;

public class Person {
	private String nome;
	private int idade;
	private Double score;
	
	public Person(String nome, int idade) {
		super();
		this.setNome(nome);
		this.setIdade(idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
