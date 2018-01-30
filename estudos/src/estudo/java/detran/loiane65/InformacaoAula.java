package estudo.java.detran.loiane65;

public @interface InformacaoAula {

	String autor();
	
	int aulaNumero();
	
	String blog() default "http://loiane.com";
	
	
}
