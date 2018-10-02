package br.edu.iffar.stokson.controle;

import java.util.Date;

import br.edu.iffar.stokson.modelo.AEntidade;
import br.edu.iffar.stokson.modelo.dao.FabricaDao;
import br.edu.iffar.stokson.modelo.dao.IDAO;

/**
 * <p>
 * Classe de lógica genérica que serve para todas as entidades
 * </p>
 * 
 * @author Fernando Luis
 * @since Oct 2, 2018 7:44:22 PM
 */
public class ALogic {

	private IDAO dao;

	public ALogic(Class<? extends AEntidade> classe) {
		dao = FabricaDao.getModeloImplementacao().criaDAO(classe);
	}

	/**
	 * <p>
	 * Retorna o dao criado especificamente para entidade passada no construtor
	 * </p>
	 * 
	 * @return instancia personalizada para entidade do dao
	 */
	public <FUTURO extends IDAO> FUTURO getDAO() {
		return (FUTURO) this.dao;
	}

	/**
	 * <p>
	 * Antes de gravar verifica se o registro é novo, caso seja, alimenta a atributo
	 * data de cadastro, do contrário alimenta o atributo data atualizacao
	 * </p>
	 */
	public void gravar(AEntidade entidade) {

		if (entidade.getId() == 0) {
			// rewgistro novo
			entidade.setDataCadastro(new Date());
		} else {
			entidade.setDataAtualizacao(new Date());
		}
		// 'grava o registro
		this.dao.gravar(entidade);
	}

}
