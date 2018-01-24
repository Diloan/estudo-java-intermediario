package estudo.java.detran.loiane54;

public class Teste {

	public static void main(String[] args) {
		
		DiaSemana dia = DiaSemana.SEGUNDA;
		
		System.out.println(dia.toString() + " - " + dia.getvalor());

		
		Data data = new Data(01, 04, 2017, DiaSemana.SEXTA);
	}

}
