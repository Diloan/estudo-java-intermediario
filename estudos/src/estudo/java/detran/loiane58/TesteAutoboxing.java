package estudo.java.detran.loiane58;

public class TesteAutoboxing {

	public static void main(String[] args) {
		/*
		Short num7 = new Short((short)1);
		Byte num8 = new Byte((byte) 10);
		Integer num9 = new Integer(100);
		Long num10 = new Long(10000l);
		Float num11 = new Float(3.5f);
		Double num12 = new Double(3.5555);
		Boolean flag2 = new Boolean(true);
		Character b = new  Character('b');
		 */
		
		//Autoboxing: transforma um tipo que é de uma classe num tipo primitivo  
		// Tranforma em um objeto
		Short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 100;
		Long num10 = 10000l;// new Lonng(1000l);
		Float num11 = 3.5f;// new Float(3.5f)
		Double num12 = 3.55555;
		Boolean flag2 = true;
		Character b = 'b';
		
		//Auto un-boxing: transforma um tipo onjeto e transforma em tipo primitivo 
		int num13 = num9; // num9.intValue();
		
		//Autoboxing em expressões
		num9++;
		
		System.out.println(num9);
		
		//Auto unboxing num13>num9 -> num14
		Integer num14 = num13/num9;
		
		//MAU USO
		Double a, c, d;
		a = 10.0;
		c = 12.2;
		d = 4.7;
		
		Double media = (a + b + c) /3;
		System.out.println(media);
	}

}
