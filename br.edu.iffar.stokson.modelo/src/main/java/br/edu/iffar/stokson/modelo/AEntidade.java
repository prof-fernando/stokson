package br.edu.iffar.stokson.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * <p>
 * Entidade abstrata que recebe os comportamentos comuns a todas as a entidades.
 * A classe é abastrata pois, não pode existir uma entidade genérica apenas
 * especifica, por tanto, as subclasses (filhas) devem ser concretas
 * </p>
 * 
 * @author Fernando Luis
 * @since 29 de ago de 2018 21:16:59
 */
@MappedSuperclass
public abstract class AEntidade {
   @Column(nullable=false)
   @Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;
   @Column
   @Temporal(TemporalType.TIMESTAMP)
	private Date dataAtualizacao;

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadaastro) {
		this.dataCadastro = dataCadaastro;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	/**
	 * <p>
	 * Retorna o campo chave (id) de cada entidade
	 * </p>
	 * 	 */
	public abstract long getId();
}
