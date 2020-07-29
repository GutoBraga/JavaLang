package br.com.rd.rdevs.javalang;

public class Exercicio1 {
	public void verificandoString(String texto, String texto2){
		
        if (texto.toLowerCase().contains(texto2.toLowerCase()) == true) {
            System.out.println("A Palavra: "  + texto2 + " existe no texto!");
        } else {
            System.out.println("Palavra nao encontrada!");
        }
    }

    public void retirarEspacoBranco(String texto, String novoCaratere){
        System.out.println("Resultado: " + texto.replace("",  novoCaratere));

    }

    public void stringVazia(String valor) {
        if (valor.isEmpty()) {
            System.out.println("Vazia!");
        } else {
            System.out.println("Há caracteres");
        }
    }

    public void qtdCaractere(String valor) {
        System.out.println("Tamanho: " + valor.length());
    }
}
