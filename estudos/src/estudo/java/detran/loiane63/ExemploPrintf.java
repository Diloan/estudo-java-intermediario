package estudo.java.detran.loiane63;

public class ExemploPrintf {

	public static void main(String[] args) {

		//		System.out.printf("Hello %s", "Olá, Mundo!");
		System.out.printf("%s", "Olá, Mundo!"); //String
		System.out.println();
		System.out.printf("%S", "Olá Mundo!"); //String
		System.out.println();

		System.out.printf("%c", 'c'); // Caractere
		System.out.println();
		System.out.printf("%C", 'c'); // Caractere
		//		System.out.println();
		System.out.printf("%n"); // Pulando linha com expressôes regulares 

		int valor = 123456789;
		System.out.printf("%d", valor); // Inteiro

		System.out.println(); 

		double pontoFlutuante = 3.123456789;
		System.out.printf("%f", pontoFlutuante); // Numero ponto flutuante 

		System.out.println(); 

		String olaMundo = "olá, Mundo!";
		System.out.printf("%20s", olaMundo); //Espaço de imppressão é de 20 caracteres(alinhados à direita)

		System.out.println();

		System.out.printf("%-20s", olaMundo); //Espaço de imppressão é de 20 caracteres(alinhados à esquerda)

		System.out.println();

		System.out.printf("%+d", valor); // Imprime o sinal do numero

		System.out.println();

		System.out.printf("%015d", valor); // Determinando a quantidade de dígitos, e completando com zero

	}

}
