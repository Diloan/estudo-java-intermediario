package estudo.java.detran.loiane68;

public class Teste {

	public static void main(String[] args) {
		
		MinhaThreadRunnable threadRun1 = new MinhaThreadRunnable("#1", 900);
//		Thread t1 = new Thread(threadRun1);  Foi colocado no construtor
//		t1.start();
		
		MinhaThreadRunnable threadRun2 = new MinhaThreadRunnable("#2", 650);
		
		MinhaThreadRunnable threadRun3 = new MinhaThreadRunnable("#3", 1100);
	}

}
