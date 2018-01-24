package estudo.java.detran.loiane53;

public class Teste {

	public static void main(String[] args) {

		usandoConstantes();
		
		System.out.println();
		
		usandoEnum();
	}

	private static void usandoConstantes() {
		int segunda = DiaSemanaConstante.SEGUNDA;
		int terca = DiaSemanaConstante.TERCA;
		int quarta = DiaSemanaConstante.QUARTA;
		int quinta = DiaSemanaConstante.QUINTA;
		int sexta = DiaSemanaConstante.SEXTA;
		int sabado = DiaSemanaConstante.SABADO;
		int domingo = DiaSemanaConstante.DAMINGO;

		System.out.println("Teste utilizando constantes no Java");
		imprimirDiaSemana(segunda);
		imprimirDiaSemana(terca);
		imprimirDiaSemana(quarta);
		imprimirDiaSemana(quinta);
		imprimirDiaSemana(sexta);
		imprimirDiaSemana(sabado);
		imprimirDiaSemana(domingo);
	}

	public static void imprimirDiaSemana(int dia) {
		switch (dia) {
		case 1:
			System.out.println("Segunda-feira");
			break;
		case 2:
			System.out.println("Terça-feira");
			break;
		case 3:
			System.out.println("Quarta-feira");
			break;
		case 4:
			System.out.println("Quinta-feira");
			break;
		case 5:
			System.out.println("Sexta-feira");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			break;
		}
	}

	// UTILIZANDO ENUM
	private static void usandoEnum() {
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		DiaSemana domingo = DiaSemana.DOMINGO;

		System.out.println("Teste utilizando enum no Java");
		imprimirDiaSemana(segunda);
		imprimirDiaSemana(terca);
		imprimirDiaSemana(quarta);
		imprimirDiaSemana(quinta);
		imprimirDiaSemana(sexta);
		imprimirDiaSemana(sabado);
		imprimirDiaSemana(domingo);
	}

	public static void imprimirDiaSemana(DiaSemana dia) {
		switch (dia) {
		case SEGUNDA:
			System.out.println("Segunda-feira");
			break;
		case TERCA:
			System.out.println("Terça-feira");
			break;
		case QUARTA:
			System.out.println("Quarta-feira");
			break;
		case QUINTA:
			System.out.println("Quinta-feira");
			break;
		case SEXTA:
			System.out.println("Sexta-feira");
			break;
		case SABADO:
			System.out.println("Sábado");
			break;
		case DOMINGO:
			System.out.println("Domingo");
			break;
		default:
			break;
		}
	}

}
