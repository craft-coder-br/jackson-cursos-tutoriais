package com.craftcoder.jackson;

import java.io.File;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

public class SerializacaoBasicaJavaParaJsonTest {

	@Test
	public void deveriaSerializarUmObjetoJavaEmJsonUsandoJackson() throws Exception {
		Artigo artigo = new Artigo(1L, "Java 8", "Linguagem");
		
		artigo.adicionaTag(new Tag(1L, "java"));
		artigo.adicionaTag(new Tag(2L, "linguagem"));
		artigo.adicionaTag(new Tag(3L, "tutorial"));
		
		ObjectMapper mapper = new ObjectMapper();
		
		String json = mapper.writeValueAsString(artigo);
		
		System.out.println(json);
	}
	
	@Test
	public void deveriaSerializarUmObjetoJavaEmJsonBonitaoUsandoJackson() throws Exception {
		Artigo artigo = new Artigo(1L, "Java 8", "Linguagem");
		
		artigo.adicionaTag(new Tag(1L, "java"));
		artigo.adicionaTag(new Tag(2L, "linguagem"));
		artigo.adicionaTag(new Tag(3L, "tutorial"));
		
		ObjectWriter writer = new ObjectMapper().writerWithDefaultPrettyPrinter();
		
		String json = writer.writeValueAsString(artigo);
		
		System.out.println(json);
	}
	
	@Test
	public void deveriaSerializarUmObjetoJavaEmJsonBonitaoComoOpcaoUsandoJackson() throws Exception {
		Artigo artigo = new Artigo(1L, "Java 8", "Linguagem");
		
		artigo.adicionaTag(new Tag(1L, "java"));
		artigo.adicionaTag(new Tag(2L, "linguagem"));
		artigo.adicionaTag(new Tag(3L, "tutorial"));
		
		boolean queroBonitao = true;
		ObjectMapper mapper = new ObjectMapper();
		if (queroBonitao) {
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
		}
		
		String json = mapper.writeValueAsString(artigo);
		
		System.out.println(json);
	}
	
	@Test
	public void deveriaSerializarEmArquivoUmObjetoJavaEmJsonBonitaoComoOpcaoUsandoJackson() throws Exception {
		Artigo artigo = new Artigo(1L, "Java 8", "Linguagem");
		
		artigo.adicionaTag(new Tag(1L, "java"));
		artigo.adicionaTag(new Tag(2L, "linguagem"));
		artigo.adicionaTag(new Tag(3L, "tutorial"));
		
		boolean queroBonitao = true;
		ObjectMapper mapper = new ObjectMapper();
		if (queroBonitao) {
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
		}
		
		mapper.writeValue(new File("json-bonito.json"), artigo);
	}
	
	
	
}
