package br.com.rd.rdevs.javalang;

public class Exercicio3 {
public String frase = "Socorram-me, subi no ônibus em Marrocos";

public void inverter(String frase) {
		
		String resultado = "";
		for(int i = (frase.length() - 1); i >= 0; i-- ) {
			System.out.println(resultado += frase.charAt(i));
		}
	}
}
