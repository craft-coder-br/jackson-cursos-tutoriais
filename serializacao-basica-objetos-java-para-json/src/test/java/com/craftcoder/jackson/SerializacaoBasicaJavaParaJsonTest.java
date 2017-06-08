package com.craftcoder.jackson;

import java.io.File;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializacaoBasicaJavaParaJsonTest {

	@Test
	public void deveriaSerializarUmObjetoJavaEmJson() throws Exception {
		Artigo artigo = new Artigo(1L, "Java 8", "Linguagens");
		
		ObjectMapper mapper = new ObjectMapper();
		
		String json = mapper.writeValueAsString(artigo);
		
		System.out.println(json);
	}

	@Test
	public void deveriaSerializarUmObjetoJavaCompostoDeOutroObjeto() throws Exception {
		Artigo artigo = new Artigo(1L, "Java 8", "Linguagens");
		
		artigo.adicionaTag(new Tag(1L, "java"));
		artigo.adicionaTag(new Tag(2L, "linguagem"));
		artigo.adicionaTag(new Tag(3L, "artigo"));
		
		ObjectMapper mapper = new ObjectMapper();
		
		String json = mapper.writeValueAsString(artigo);
		
		System.out.println(json);
	}
	
	@Test
	public void deveriaSerializarUmObjetoJavaEmUmArquivo() throws Exception {
		Artigo artigo = new Artigo(1L, "Java 8", "Linguagens");
		
		artigo.adicionaTag(new Tag(1L, "java"));
		artigo.adicionaTag(new Tag(2L, "linguagem"));
		artigo.adicionaTag(new Tag(3L, "artigo"));
		
		ObjectMapper mapper = new ObjectMapper();
		
		mapper.writeValue(new File("artigo.json"), artigo);
	}
	
}
