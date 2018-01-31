package estudo.java.detran.loiane69;


public class Teste3 {

	public static void main(String[] args) {

		MinhaThreadRunnable threadRun1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable threadRun2 = new MinhaThreadRunnable("#2", 700);
		MinhaThreadRunnable threadRun3 = new MinhaThreadRunnable("#3", 800);

		Thread t1 = new Thread(threadRun1);
		Thread t2 = new Thread(threadRun2);
		Thread t3 = new Thread(threadRun3);

		t1.start();
		/*try {
			t1.join(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/

		t2.start();
		/*try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/

		t3.start();
		/*try {
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		// Utilizando o método join para esperar a execução de uma thread
		try{
			t1.join();
			t2.join();
			t3.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("programa finalizado");
	}

}


