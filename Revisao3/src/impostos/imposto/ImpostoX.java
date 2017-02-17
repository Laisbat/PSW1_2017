package impostos.imposto;

import impostos.produto.Produto;
import impostos.produto.Servico;

/**
 *
 * @author RA21606437
 */
public class ImpostoX extends Imposto {

    public String nome;

    public ImpostoX(String n) {
        super(n);
    }

    @Override
    public float calcularValor(Produto p) {
        if (p.getNome()
                .toUpperCase()
                .startsWith("C")) {
            return p.getPreco() * 0.3F;
        }
        return 0;
    }

}
