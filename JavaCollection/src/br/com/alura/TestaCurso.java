package br.com.alura;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso novoCurso = new Curso("JavaCollection", "Paulo Alura");
		
		System.out.println(novoCurso.getAulas());
		
		novoCurso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		novoCurso.adiciona(new Aula("Trabalhando com LinkedList", 20));
		novoCurso.adiciona(new Aula("Trabalhando com ordenamento de Lists", 19));
		
		System.out.println(novoCurso.getAulas());
	}
	
}
