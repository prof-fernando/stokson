package br.edu.iffar.stokson.dao.hibernate;

import br.edu.iffar.stokson.modelo.Movimentacao;
import br.edu.iffar.stokson.modelo.dao.IMovimentacaoDAO;

/**
 * <p>
 * Implementação concreta para manipulação de dados em banco relacional para a
 * entidade {@link Movimentacao}
 * </p>
 * 
 * @author Fernando Luis
 * @since 25 de set de 2018 19:27:04
 */
public class MovimentacaoDAO extends HibernateDAO implements IMovimentacaoDAO {

	public MovimentacaoDAO() {
		super(Movimentacao.class);
	}
}
