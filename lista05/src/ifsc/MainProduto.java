package ifsc;

import java.util.ArrayList;

public class MainProduto {
	
	public static void main(String[] args) {
		Produto a = new Produto();
		Produto b = new Produto();
		Produto c = new Produto();
		
		a.setNome("Tomate(Unidade)"); 
		a.setFornecedor("Feira do Zéca");
		a.setCodBarras((long) 812998498);
		a.setPreco(1.0);
		
		b.setNome("Morango(Unidade)"); 
		b.setFornecedor("Plantação do Marcão");
		b.setCodBarras((long) 1382278668);
		b.setPreco(0.30);
		
		c.setNome("Mexirica(Unidade)"); 
		c.setFornecedor("Fazenda do Sérgio");
		c.setCodBarras((long) 123454685);
		c.setPreco(0.50);
		
		ArrayList<Produto> fruta = new ArrayList<Produto>();
		fruta.add(a);
		fruta.add(b);
		fruta.add(c);
		int i = fruta.size();
		for (int n = 0; n < i; n++) {
			System.out.println(fruta.get(n).getNome());
			System.out.println(fruta.get(n).getFornecedor());
			System.out.println(fruta.get(n).getCodBarras());
			System.out.println(fruta.get(n).getPreco());
		}
	}
}
