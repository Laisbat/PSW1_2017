package impostos.imposto;

import impostos.produto.Produto;
import impostos.produto.Servico;

public class ImpostoISS extends Imposto {

	public ImpostoISS(String n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calcularValor(Produto p) {
		if(p instanceof Servico){
			return p.getPreco() * 0.2F;
		}
		return 0;
	}

}
