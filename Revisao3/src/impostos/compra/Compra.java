package impostos.compra;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import impostos.Estado;
import impostos.produto.BemDeCapital;
import impostos.produto.BemDeConsumo;
import impostos.produto.BemDuravel;
import impostos.produto.Produto;
import impostos.produto.Servico;
import java.util.HashSet;

public class Compra {

	public static List<Produto> listarProdutos() {

		List<Produto> produtos = new ArrayList<Produto>();
		
		BemDeCapital bemDeCapital = new BemDeCapital();
		bemDeCapital.setAnosGarantia(5);
		bemDeCapital.setNome("Retro-escavadeira");
		bemDeCapital.setOrigem(Estado.Pernambuco);
		bemDeCapital.setPreco(400000);
		
		produtos.add(bemDeCapital);
		
				
		BemDeConsumo bemDeConsumo = new BemDeConsumo();
		bemDeConsumo.setNome("Cafe");
		bemDeConsumo.setOrigem(Estado.SaoPaulo);
		bemDeConsumo.setPreco(1000);
		bemDeConsumo.setVencimento(new Date(2018, 01, 01));
		
		produtos.add(bemDeConsumo);
		
		
		Servico servico = new Servico();
		servico.setDuracao(10);
		servico.setNome("Consultoria");
		servico.setOrigem(Estado.DistritoFederal);
		servico.setPreco(50000);
		
		
		produtos.add(servico);
		
                
                BemDuravel bemDuravel = new BemDuravel();
                bemDuravel.setDurabilidadeMinima(8);
                bemDuravel.setNome("Automovel");
                bemDuravel.setOrigem(Estado.Acre);
                bemDuravel.setPreco(50000);            
                
                produtos.add(bemDuravel);
                		
		// TODO Auto-generated method stub
		return produtos;
	}

}
