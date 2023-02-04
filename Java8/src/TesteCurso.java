import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TesteCurso {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
//		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
//		cursos.forEach(curso -> System.out.println(curso.getNome()));
		
		cursos.stream()
			.filter(curso -> curso.getAlunos() > 50)
			.map(curso -> curso.getNome())
			.forEach(System.out::println);
	}

}
