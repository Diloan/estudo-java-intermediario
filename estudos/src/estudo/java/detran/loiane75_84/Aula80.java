package estudo.java.detran.loiane75_84;

public class Aula80 {

	public static void main(String[] args) {
		String teste = "Isso � um teste.";
		
		System.out.println(teste);
		System.out.println(teste.substring(10));
		System.out.println(teste.substring(10, 15)); // O index final n�o � inclusivo, incluso.
		
		String ola = "ol�";
		String mundo = " mundo";
		String olaMundo = ola.concat(mundo); // ola + mundo, � o mesmo.	
		System.out.println(olaMundo);
		
		String espacos = "i s p a � o";
		String semEspacos = espacos.replace("i", "e");
		System.out.println(semEspacos);
		
		semEspacos = semEspacos.replaceAll(" ", "");
		System.out.println(semEspacos);
		
		String nome = " meu nome �: ";
		System.out.println(nome);
		
		System.out.println(nome.trim());
	}

}
