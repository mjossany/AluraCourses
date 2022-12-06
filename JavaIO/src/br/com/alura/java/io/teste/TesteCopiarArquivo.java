package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		
//		InputStream fis = new FileInputStream("lorem.txt");
		InputStream fis = System.in;
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

//		FileOutputStream fos = new FileOutputStream("lorem2.txt");
		OutputStream fos = System.out;
		OutputStreamWriter isw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(isw);
		
		String linha = br.readLine();

		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}

		br.close();
		bw.close();
	}

}
