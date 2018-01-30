package estudo.java.detran.loiane67;

public class MinhaTread extends Thread{

	private String nome;
	private int tempo;

	public MinhaTread(String nome, int tempo){
		this.nome = nome;
		this.tempo = tempo;
		start(); // Estartando a thread dento do construtor
	}

	public void run(){

		//		System.out.println("Executando a tread");
		try {
			for(int i = 0; i < 6; i++){
				System.out.println(nome + " contador " + i);

				Thread.sleep(tempo);
				
			}
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(nome + " terminou a execução");
	}
}

