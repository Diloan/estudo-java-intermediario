package estudo.java.detran.loiane64;

public class Externa2 {
	
	public void metodoQualquer(){
		
		
		class ClasseLocal{
			
			private String texto = "texto classe local";
			public void imprimetexto(){
				System.out.println(texto);
			}
		}
		ClasseLocal local = new ClasseLocal();
		local.imprimetexto();
	}
	
	public static void main(String[] args) {
		Externa externa = new Externa();
		
		Externa2 externa2 = new Externa2();
		externa2.metodoQualquer();
	}
}
