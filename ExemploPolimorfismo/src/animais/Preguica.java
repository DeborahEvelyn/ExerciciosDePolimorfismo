package animais;

public class Preguica extends Animal {

	private String sobeEmArvores;

	public Preguica(String nome) {
		super(nome);
	}

	public Preguica(String nome, int idade, String emitirSom, String sobeEmArvores) {
		super(nome, idade, emitirSom);
		this.sobeEmArvores = sobeEmArvores;
	}

	public String getSobeEmArvores() {
		return sobeEmArvores;
	}

	public void setSobeEmArvores(String sobeEmArvores) {
		this.sobeEmArvores = sobeEmArvores;
	}
	
	public String ObterComportamento()
	{  
		String acao = "A preguiça dorme e ";
		acao += super.getEmitirSom();
		return acao;
	}

	
}

	