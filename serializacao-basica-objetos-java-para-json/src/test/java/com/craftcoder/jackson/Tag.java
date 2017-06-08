package com.craftcoder.jackson;

public class Tag {

	private Long id;
	
	private String nome;

	public Tag(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
}
