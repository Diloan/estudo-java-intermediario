package estudo.java.detran.loiane67;

public class Teste {
	
	public static void main(String[] args) {
		
		MinhaTread tread = new MinhaTread("Thread #1", 600);
		//tread.start();
		
		MinhaTread thread2 = new MinhaTread("Thread #2", 900);
		
		MinhaTread thread3 = new MinhaTread("Thread #3", 500);
		
	}
}
