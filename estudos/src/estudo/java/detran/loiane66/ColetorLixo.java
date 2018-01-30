package estudo.java.detran.loiane66;

import estudo.java.detran.loiane61.Contato;

public class ColetorLixo {

	
	public static void obterMemoriaUsada(){
		
		final int MB = 1024 * 1024;
		
		Runtime runtime =  Runtime.getRuntime(); // Padr�o Singleton
		
		System.out.println((runtime.totalMemory() - runtime.freeMemory()) / MB);
		
	}
	
	public static void main(String[] args) {
		
		Contato[] contatos = new Contato[1000000];
		Contato contato;
		
		for(int i = 0; i < contatos.length; i++){
			contato = new Contato("Contato" + i, "1234-5678" + i, "contato"+i+"@gmail.com");
			contatos[i] = contato;
		}
		
		System.out.println("Contatos criados");
		obterMemoriaUsada();
		
		contatos = null;
		Runtime.getRuntime().runFinalization();
		Runtime.getRuntime().gc();
		
		System.out.println("Contatos removidos da mem�ria");
		obterMemoriaUsada();
	
	}

}
