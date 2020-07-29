package br.com.rd.rdevs.javalang;

public class Exercicio2 {
	public void pulandoLinha(String frase) {
		String resultado = "";
		for(int i = 0; i <= (frase.length() - 1); i++ ) {
			System.out.println(resultado += (frase.charAt(i) + "\n")); 
		}
	}
}
