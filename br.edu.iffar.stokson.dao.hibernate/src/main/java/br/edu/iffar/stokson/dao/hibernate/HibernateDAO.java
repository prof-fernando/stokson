package br.edu.iffar.stokson.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.hql.internal.ast.tree.RestrictableStatement;

import br.edu.iffar.stokson.modelo.AEntidade;
import br.edu.iffar.stokson.modelo.dao.IDAO;

/**
 * <p>
 * Implementacao do padrão DAO com base no framework Hibernate
 * </p>
 * 
 * @author Fernando Luis
 * @since 19 de set de 2018 21:30:09
 */
public class HibernateDAO implements IDAO {
	private Class<? extends AEntidade> classeEntidade;
	private Session sessao;

	/**
	 * <p>
	 * Construção padrão para definição de modelo de persistência
	 * </p>
	 */
	public HibernateDAO() {

	}

	/**
	 * <p>
	 * Cria o dao a partir de uma entidade
	 * </p>
	 * 
	 * @param classeEntidade
	 */
	public HibernateDAO(Class<? extends AEntidade> classeEntidade) {
		this.classeEntidade = classeEntidade;
	}

	public void gravar(AEntidade entidade) {
		sessao.beginTransaction();
		sessao.saveOrUpdate(entidade);
		sessao.getTransaction().commit();
	}

	public void deletar(AEntidade entidade) {
		sessao.beginTransaction();
		sessao.delete(entidade);
		sessao.getTransaction().commit();
	}

	public AEntidade buscaPorID(long id) {
		return sessao.get(classeEntidade, id);
	}

	public List<? extends AEntidade> buscaTodos() {
		Criteria c = sessao.createCriteria(classeEntidade);
		return c.list();
	}

	public <Futuro extends IDAO> Futuro criaDAO(Class<? extends AEntidade> classeEntidade) {
		
		return (Futuro) classeEntidade.newInstance();
	}

}
