import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Teste {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		Comparator<String> ordenaPorTamanho = new OrdenaPorTamanho();
		
		palavras.sort(ordenaPorTamanho);
		
		Consumer<String> consumidor = new ImprimeNaLinha();
		
		palavras.forEach(consumidor);
		
		
	}
	
	
	
	
}
