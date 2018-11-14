package br.edu.iffar.stokson.dao.hibernate;

import br.edu.iffar.stokson.modelo.CategoriaProduto;
import br.edu.iffar.stokson.modelo.UnidadeMedida;
import br.edu.iffar.stokson.modelo.dao.ICategoriaProdutoDAO;
import br.edu.iffar.stokson.modelo.dao.IUnidadeMedidaDAO;

/**
 * <p>
 * Implementação concreta para manipulação de dados em banco relacional para a
 * entidade {@link UnidadeMedida}
 * </p>
 * 
 * @author Fernando Luis
 * @since 25 de set de 2018 19:27:04
 */
public class UnidadeMedidaDAO extends HibernateDAO implements IUnidadeMedidaDAO {

	public UnidadeMedidaDAO() {
		super(UnidadeMedida.class);
	}
}
