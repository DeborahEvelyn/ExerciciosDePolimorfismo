package aplicacao;

import animais.Animal;
import animais.Cachorro;
import animais.Cavalo;
import animais.Preguica;

public class Cadastro {

	public static void main(String[] args) {
		
		
		
		Cachorro cachorro = new Cachorro ("BOB");
		Cavalo cavalo = new Cavalo ("TOM");
		Preguica preguicaFloresta = new Preguica ("FOFINHA");
		
		
       
        cachorro.setEmitirSom("late!");
        cavalo.setEmitirSom("relincha!");
        preguicaFloresta.setEmitirSom("não sei o som dela!");
        
        
        System.out.println(cachorro.ObterComportamento());
        System.out.println(cavalo.ObterComportamento());
        System.out.println(preguicaFloresta.ObterComportamento());
	}

}
