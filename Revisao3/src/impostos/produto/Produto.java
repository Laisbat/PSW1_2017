package impostos.produto;

import impostos.Estado;

public abstract class Produto {
	private float preco;
	private String nome;
	private Estado origem;
	
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Estado getOrigem() {
		return origem;
	}
	public void setOrigem(Estado origem) {
		this.origem = origem;
	}
	
	
}
