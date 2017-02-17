package impostos.imposto;

import impostos.Estado;
import impostos.produto.Produto;

public class ImpostoICMS extends Imposto{

	public ImpostoICMS(String n) {
		super(n);
	}

	@Override
	public float calcularValor(Produto p) {
		if(p.getOrigem() == Estado.DistritoFederal){
			return 0;
		}
		else if ((p.getOrigem() == Estado.Goias) || (p.getOrigem() == Estado.MatoGrosso) || (p.getOrigem() == Estado.MatoGrossoDoSul)) {
			return p.getPreco() * 0.25F;
		}
			
		return p.getPreco() * 0.40F;
	}

}
