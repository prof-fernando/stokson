package br.edu.iffar.stokson.dao.hibernate;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import br.edu.iffar.stokson.modelo.Produto;
import br.edu.iffar.stokson.modelo.dao.IProdutoDAO;

/**
 * <p>
 * Implementação concreta para manipulação de dados
 * em banco relacional para a entidade {@link Produto}
* </p>
* @author Fernando Luis
* @since  25 de set de 2018 19:27:04
*/
public class ProdutoDAO extends HibernateDAO
                                                         implements IProdutoDAO{

	public ProdutoDAO() {
		super(Produto.class);
	}
	
	public Produto buscaPorCodigoBarras(String codigo) {
		Criteria c = sessao.createCriteria(Produto.class);
		// adiciona uma restricao
		c.add( Restrictions.eq("codigoBarras",   codigo)  );
		//realiza a busca e retorna o objeto
		return (Produto) c.uniqueResult();
	}

}
