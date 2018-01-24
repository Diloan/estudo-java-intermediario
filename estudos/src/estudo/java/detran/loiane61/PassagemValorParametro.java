package estudo.java.detran.loiane61;
import  estudo.java.detran.loiane61.Contato;

public class PassagemValorParametro {

	public static void main(String[] args) {

		Contato contato = new Contato("Contato1", "12325-02534", "fulanodetal@gmail.com");
		int valor = 10;

		System.out.println("********* Valores originais");
		System.out.println(contato);
		System.out.println(valor);

		System.out.println("********* Exemplo1");
		testePassagemValorReferencia(valor, contato);
		
		System.out.println(contato);
		System.out.println(valor);

		System.out.println("********* Exemplo2");
		testepassagemValorReferencia2(valor, contato);
		
		System.out.println(contato);
		System.out.println(valor);
	}
	private static void testePassagemValorReferencia(int valor, Contato contato){
		int novoValor = valor + 10;
		valor = novoValor;

		contato = new Contato("Contato2", "23322332", "seuze@"
				+ "gmail.com");


	}

	private static void testepassagemValorReferencia2 (int valor, Contato contato){
		int novoValor = valor + 10;
		valor = novoValor;

		contato.setNome("Contato" + novoValor);
	}
}
