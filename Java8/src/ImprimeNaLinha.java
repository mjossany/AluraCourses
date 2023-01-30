import java.util.function.Consumer;

class ImprimeNaLinha implements Consumer<String> {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
			
		}