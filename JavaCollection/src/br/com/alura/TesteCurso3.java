package br.com.alura;

public class TesteCurso3 {

	public static void main(String[] args) {

		Curso novoCurso = new Curso("JavaCollection", "Paulo Alura");

		novoCurso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		novoCurso.adiciona(new Aula("Trabalhando com LinkedList", 20));
		novoCurso.adiciona(new Aula("Trabalhando com ordenamento de Lists", 19));
		
		novoCurso.matricula(new Aluno("Jossany Moura", 111));
		novoCurso.matricula(new Aluno("Andréia Moura", 112));
		novoCurso.matricula(new Aluno("Baruch Moura", 113));
		
		novoCurso.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
	}
}
