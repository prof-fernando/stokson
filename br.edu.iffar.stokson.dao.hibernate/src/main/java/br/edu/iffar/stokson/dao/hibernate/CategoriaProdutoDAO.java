package br.edu.iffar.stokson.dao.hibernate;

import br.edu.iffar.stokson.modelo.CategoriaProduto;
import br.edu.iffar.stokson.modelo.dao.ICategoriaProdutoDAO;

/**
 * <p>
 * Implementação concreta para manipulação de dados em banco relacional para a
 * entidade {@link CategoriaProduto}
 * </p>
 * 
 * @author Fernando Luis
 * @since 25 de set de 2018 19:27:04
 */
public class CategoriaProdutoDAO extends HibernateDAO implements ICategoriaProdutoDAO {

	public CategoriaProdutoDAO() {
		super(CategoriaProduto.class);
	}
}
