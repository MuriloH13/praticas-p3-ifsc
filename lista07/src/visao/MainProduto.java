package visao;

import modelo.Produto;
import controle.ProdutoDAO;

public class MainProduto {
	
	public static void main(String[] args) {
	
		Produto produto = new Produto();
		
		produto.setNome("Bola");
		produto.setCodBarras((long)3364);
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.inserir(produto);
		System.out.println(produto.getNome());
		dao.alterar(produto);
		System.out.println(produto.getNome());
		dao.excluir(produto);
		dao.listar();
		
		System.out.println(dao.listar().size());
		
	}
}