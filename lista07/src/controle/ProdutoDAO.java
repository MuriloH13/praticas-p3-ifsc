package controle;

import java.util.ArrayList;

import modelo.Produto;

public class ProdutoDAO {

	private ArrayList<Produto> prods;

	public ProdutoDAO() {
		prods = new ArrayList<>();
	}

	public boolean inserir(Produto p) {
		prods.add(p);
		return true;
	}

	public boolean alterar(Produto p) {
		for(Produto  produto : prods) {
			if(produto.getCodBarras() == p.getCodBarras()) {
				produto.setNome("Telstar");
				return true;
			}
		}
		return false;
	}

	public boolean excluir(Produto p) {
		for (Produto produto : prods) {
			if (produto.getCodBarras() == p.getCodBarras()) {
				prods.remove(produto);
				return true;
			}
		}
		return false;
	}

	public ArrayList<Produto> listar() {
		return this.prods;
	}

}
