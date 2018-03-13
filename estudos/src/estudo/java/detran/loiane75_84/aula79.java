package estudo.java.detran.loiane75_84;

public class aula79 {

	public static void main(String[] args) {
		
		String banana = "banana";
		String ana = "ana";
		// retorna o índice do vetor
		System.out.println(banana.indexOf('x'));
		System.out.println(banana.indexOf('b'));
		System.out.println(banana.indexOf('a'));
		
		System.out.println(banana.indexOf(ana));
		
		System.out.println(banana.lastIndexOf('a'));
		System.out.println(banana.lastIndexOf(ana));
		
		System.out.println(banana.contains(ana)); // true
		System.out.println(banana.contains("céu")); // falso, não contem 
	}

}
