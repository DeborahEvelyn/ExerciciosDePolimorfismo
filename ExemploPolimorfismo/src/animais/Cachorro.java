package animais;

public class Cachorro extends Animal {

	private String corre;
	
	
	
	

	public Cachorro(String nome) {
		super(nome);
	}
	
	

	public Cachorro(String nome, String corre) {
		super(nome);
		corre = corre;
	}
	
	



	public Cachorro(String nome, int idade, String emitirSom, String corre) {
		super(nome, idade, emitirSom);
		corre = corre;
	}



	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		corre = corre;
	}
	
	
	public String ObterComportamento()
	{  
		String acao = "O cacharro corre e ";
		acao += super.getEmitirSom();
		return acao;
	}
	
	
	
}
