package estudo.java.detran.loiane64;

public class Anonima {

	public void imprimeTexto(){
		System.out.println("Qualquer texto");
	}

	public static void main(String[] args) {

		Anonima anonima = new Anonima(){
			public void imprimeTexto(){
				System.out.println("Qualquer texto que foi cobrescrito");

			}

		};

		anonima.imprimeTexto();

		// Usando interface
		Texto texto = new Texto(){
			@Override
			public void imprimeTexto(){
				System.out.println("Qualquer texto - interface");
			} 
		};

		texto.imprimeTexto();
	}

}
