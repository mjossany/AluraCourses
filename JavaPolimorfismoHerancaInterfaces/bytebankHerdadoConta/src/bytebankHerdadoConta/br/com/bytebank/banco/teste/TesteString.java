package bytebankHerdadoConta.br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Jossany";
		String outroNome = new String("Jossany");

		String nomeAlterado = nome.replace('y', 'o');
		String nomeMinusculo = nome.toLowerCase();
		String nomeMaiusculo = nome.toUpperCase();
		char c = nome.charAt(0);
		int indexChar = nome.indexOf('y');
		String substring = nome.substring(3);

		System.out.println(nomeAlterado);
		System.out.println(nomeMinusculo);
		System.out.println(nomeMaiusculo);
		System.out.println(c);
		System.out.println(indexChar);
		System.out.println(substring);
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
	}
}
