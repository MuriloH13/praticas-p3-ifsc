package ifsc;

import java.util.ArrayList;

public class MainProduto {
	
	public static void main(String[] args) {
		Produto a = new Produto();
		Produto b = new Produto();
		Produto c = new Produto();
		
		a.setNome("Tomate"); 
		a.setFornecedor("Feira do Zéca");
		a.setCodBarras((long) 812998498);
		
		b.setNome("Morango"); 
		b.setFornecedor("Plantação do Marcão");
		b.setCodBarras((long) 1382278668);
		
		c.setNome("Mexirica"); 
		c.setFornecedor("Fazenda do Sérgio");
		c.setCodBarras((long) 123454685);
		
		ArrayList<Produto> fruta = new ArrayList<Produto>();
		fruta.add(a);
		fruta.add(b);
		fruta.add(c);
		int i=fruta.size();
		for (int n = 0; n < i; n++) {
			System.out.println(fruta.get(n).getNome());
			System.out.println(fruta.get(n).getFornecedor());
			System.out.println(fruta.get(n).getCodBarras());
			
		}
	}
}
