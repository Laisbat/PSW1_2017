package impostos.imposto;

import java.util.ArrayList;
import java.util.List;

import impostos.produto.Produto;

public class FabricaImposto {

	public static List<Imposto> buscarImpostos() {
		
		List<Imposto> impostos = new ArrayList<Imposto>();
		
		impostos.add(new ImpostoICMS("ICMS"));
		impostos.add(new ImpostoISS("ISS"));
		impostos.add(new ImpostoX("ICL"));

		return impostos;
	}

}
