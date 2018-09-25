package br.edu.iffar.stokson.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import br.edu.iffar.stokson.modelo.AEntidade;
import br.edu.iffar.stokson.modelo.CategoriaProduto;
import br.edu.iffar.stokson.modelo.Produto;
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
	protected Session sessao;

	/**
	 * <p>
	 * Construção padrão para definição de modelo de persistência
	 * </p>
	 */
	public HibernateDAO() {
		this(null);
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
		this.sessao = HibernateHelper.getSession();
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
		StringBuffer pacote = new StringBuffer();
		pacote.append("br.edu.iffar.stokson.dao.hibernate.");
		pacote.append(classeEntidade.getSimpleName());
		pacote.append("DAO");
		try {
			Class classeDAO = Class.forName(pacote.toString());
			return (Futuro) classeDAO.getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			throw new RuntimeException("Falha ao gerar dao de " + classeEntidade);
		}
	}
	public static void main(String[] args) {
		CategoriaProduto c = new CategoriaProduto();
		c.setDescricao("Primeiro de tudo");
		
		
		new HibernateDAO().gravar(c);;
	}
}
