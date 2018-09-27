package br.edu.iffar.stokson.dao.hibernate;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import br.edu.iffar.stokson.modelo.AEntidade;
import br.edu.iffar.stokson.modelo.Usuario;
import br.edu.iffar.stokson.modelo.dao.IUsuarioDAO;

/**
 * <p>
 *  Implementação concreta para manipulação de dados
 * em banco relacional para a entidade {@link Usuario}
* </p>
* @author Fernando Luis
* @since  26 de set de 2018 21:54:11
*/
public class UsuarioDAO extends HibernateDAO implements IUsuarioDAO{

	public UsuarioDAO() {
		super(Usuario.class);
	}
	
	public Usuario buscaPorEmail(String email) {
		Criteria c = sessao.createCriteria(Usuario.class);
		c.add(Restrictions.eq("email", email));
		
		Usuario u =  (Usuario) c.uniqueResult();
		return u;
	}

}
