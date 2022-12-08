package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new File("contas.csv"));

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
//			System.out.println(linha);

			Scanner scannerLinha = new Scanner(linha);
			scannerLinha.useLocale(Locale.US);
			scannerLinha.useDelimiter(",");

			String tipoConta = scannerLinha.next();
			Integer agencia = scannerLinha.nextInt();
			Integer numero = scannerLinha.nextInt();
			String titular = scannerLinha.next();
			Double saldo = scannerLinha.nextDouble();

//			System.out.println(tipoConta + agencia + numero + titular + saldo);

			System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d, %20s: %08.2f %n", tipoConta, agencia,
					numero, titular, saldo);

			scannerLinha.close();
		}

		scanner.close();

	}

}
