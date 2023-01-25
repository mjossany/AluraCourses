package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

public static void main(String[] args) {
		
		Curso novoCurso = new Curso("JavaCollection", "Paulo Alura");
		
		novoCurso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		novoCurso.adiciona(new Aula("Trabalhando com LinkedList", 20));
		novoCurso.adiciona(new Aula("Trabalhando com ordenamento de Lists", 19));
		
		System.out.println(novoCurso.getAulas());
		
		List<Aula> aulasImutaveis = novoCurso.getAulas();
		
		List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulasMutaveis);
		
		System.out.println(aulasMutaveis);
		
		System.out.println(novoCurso.getTempoTotal());
		System.out.println(novoCurso);
	}
}
