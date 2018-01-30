package estudo.java.detran.loiane69;

import estudo.java.detran.loiane68.MinhaThreadRunnable;

public class Teste {

	public static void main(String[] args) {
		MinhaThreadRunnable threadRun1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable threadRun2 = new MinhaThreadRunnable("#2", 500);
		MinhaThreadRunnable threadRun3 = new MinhaThreadRunnable("#3", 500);
		
		Thread t1 = new Thread(threadRun1);
		Thread t2 = new Thread(threadRun2);
		Thread t3 = new Thread(threadRun3);
		
		t1.start();
		t2.start();
		t3.start();
		
		for(int i = 0; i < 15; i++){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		System.out.println("programa finalizado");
	}

}
