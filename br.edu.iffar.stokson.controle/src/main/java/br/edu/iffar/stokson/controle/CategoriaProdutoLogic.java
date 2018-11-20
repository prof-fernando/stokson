package br.edu.iffar.stokson.controle;

import java.util.List;

import br.edu.iffar.stokson.modelo.CategoriaProduto;
import br.edu.iffar.stokson.modelo.dao.ICategoriaProdutoDAO;

/**
 * <p>
 * Classe com a regras de negócio para categorias
 * </p>
 * 
 * @author Fernando Luis
 * @since 4 de set de 2018 19:48:35
 */
public class CategoriaProdutoLogic extends ALogic {
	private ICategoriaProdutoDAO dao;

	public CategoriaProdutoLogic() {
		super(CategoriaProduto.class);
		this.dao = getDAO();
	}
  
	
}
