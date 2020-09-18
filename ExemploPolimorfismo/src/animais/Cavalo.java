package animais;

public class Cavalo extends Animal {

	private String corre;
	
	
	

	public Cavalo(String nome) {
		super(nome);
	}



	public Cavalo(String nome, String corre) {
		super(nome);
		this.corre = corre;
	}
	
		

	public Cavalo(String nome, int idade, String emitirSom, String corre) {
		super(nome, idade, emitirSom);
		this.corre = corre;
	}






	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}
	
	public String ObterComportamento()
	{  
		String acao = "O cavalo corre e ";
		acao += super.getEmitirSom();
		return acao;
	}
	
}
