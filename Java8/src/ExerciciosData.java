import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ExerciciosData {
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate dataEspecifica = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(dataEspecifica);
		
		Period periodoEntreDatas = Period.between(dataEspecifica, hoje);
		System.out.println(periodoEntreDatas);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(hoje.format(formatador));
	}
}
