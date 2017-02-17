package impostos.imposto;

import impostos.produto.Produto;

public abstract class Imposto {
	public String nome;
	
	public abstract float calcularValor(Produto p);
	
	public Imposto(String n){
		nome = n;
	}
}
