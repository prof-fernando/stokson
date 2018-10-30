package br.edu.iffar.stokson.controle;

import java.util.List;

import br.edu.iffar.stokson.modelo.Produto;
import br.edu.iffar.stokson.modelo.dao.IProdutoDAO;

/**
 * <p>
 * Classe com a regras de negócio para produtos
 * </p>
 * 
 * @author Fernando Luis
 * @since 4 de set de 2018 19:48:35
 */
public class ProdutoLogic extends ALogic {
	private IProdutoDAO dao;

	public ProdutoLogic() {
		super(Produto.class);
		this.dao = getDAO();
	}
  //TODO  v externalizar essa acao
	public List buscaTodosProdutos() {
		return dao.buscaTodos();
	}
	
}
