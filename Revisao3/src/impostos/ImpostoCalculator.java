package impostos;

import java.util.List;

import impostos.compra.Compra;
import impostos.imposto.FabricaImposto;
import impostos.imposto.Imposto;
import impostos.produto.Produto;

public class ImpostoCalculator {
/*
 * 1 - Entenda o codigo abaixo
 * 2 - Adicione um novo tipo de Imposto
 * 3 - Perceba que o algoritmo principal nao precisou ser modificado
 */
	
	public static void main(String[] args){

		List<Produto> notaFiscal = Compra.listarProdutos();
		List<Imposto> impostos = FabricaImposto.buscarImpostos();
		
		System.out.println("Nota Fiscal:");
		//Para cada produto, verificar os impostos cabiveis e aplica-los...
		for(int i = 0; i < notaFiscal.size(); i = i+1){
			Produto produtoAtual = notaFiscal.get(i);
			System.out.println("Produto: " + produtoAtual.getNome());
			System.out.println("Preco: " + produtoAtual.getPreco());
			float totalImpostos = 0;
			
			for(int j = 0; j < impostos.size(); j++){
				Imposto impostoAtual = impostos.get(j);
				totalImpostos = totalImpostos + impostoAtual.calcularValor(produtoAtual);
			}
			
			System.out.println("Impostos: " + totalImpostos);
			
			float precoFinal = produtoAtual.getPreco() + totalImpostos;
			System.out.println("Preco Final: " + precoFinal);
			System.out.println("------------------------------------------------------");
			
		}
	}
	
}
