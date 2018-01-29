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
		
		System.out.println();

		System.out.printf("%,d", valor); // Separando miilhares com virgula
		
		System.err.println();
		
		int valor2 = - 12345678;
		System.out.printf("% d", valor2); // Só imprime o sinal se o númnero for positivo
		System.out.println();
		System.out.printf("% d", valor);
		System.out.println();
		
		System.out.printf("%.3f", pontoFlutuante); // Quantidades dde casas decimais
		System.out.println();
		
		System.out.printf("R$%10.2f", pontoFlutuante); // Saida de número monetário, determinba a quantidade dígito
		System.out.println();
		
		
		testeMaisCompleto();
		
	}
	
		private static void testeMaisCompleto(){
			
			double[] precos = {1000, 123.54, 7843.567, 1, 4.56789};
			
			for(int i = 0; i < precos.length; i++){
				System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i + 1, precos[i]);
			}
			
			//Java.util.Formater classe que formata números, faz a mesma coisa que o printf
			
		}
		
	}


