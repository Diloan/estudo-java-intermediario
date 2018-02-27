package estudo.java.detran.loiane71;

public class MinhaThreadSoma implements Runnable{
	
	private String nome;
	private int[] nums;
	private static Calculadora calc = new Calculadora();
		
	public MinhaThreadSoma(String mome, int[] nums){
		this.nome = mome;
		this.nums = nums;
		new Thread(this, nome).start();
//		Thread t = new Thread(this, nome);
//		t.start();
	}

	@Override
	public void run() {
		
		System.out.println(this.nome + " iniciada");
		
		int soma = calc.somaArray(this.nums);
		
		System.out.println("Resultado da soma para thread " + this.nome + " �: " + soma);
		
		System.out.println(this.nome + " terminada");
	}
}
