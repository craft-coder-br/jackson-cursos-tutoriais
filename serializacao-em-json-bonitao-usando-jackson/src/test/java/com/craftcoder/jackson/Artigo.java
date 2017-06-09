package com.craftcoder.jackson;

import java.util.ArrayList;
import java.util.List;

public class Artigo {

	private Long id;
	
	private String assunto;
	
	private String categoria;
	
	private List<Tag> tags;

	public Artigo(Long id, String assunto, String categoria) {
		this.id = id;
		this.assunto = assunto;
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public String getAssunto() {
		return assunto;
	}

	public String getCategoria() {
		return categoria;
	}
	
	public List<Tag> getTags() {
		return tags;
	}
	
	public void adicionaTag(Tag tag) {
		if (tags == null) {
			tags = new ArrayList<>();
		}
		tags.add(tag);
	}
	
}
