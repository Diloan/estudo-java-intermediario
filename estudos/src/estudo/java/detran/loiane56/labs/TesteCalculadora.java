package estudo.java.detran.loiane56.labs;

import estudo.java.detran.loiane56.labs.Calculadora.Operacao;

/**
 * @author diloan.silva
 *
 */

public class TesteCalculadora {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	double x = 2;
	double y = 3;
	
	for(Operacao op : Operacao.values() ){
		System.out.print(x + " ");
		System.out.print(op.toString() + " ");
		System.out.print(y + " = ");
		System.out.println(op.executarOperacao(x, y));
	}
	
	 
}
}