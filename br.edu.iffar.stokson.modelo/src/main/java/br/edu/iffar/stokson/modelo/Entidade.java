package br.edu.iffar.stokson.modelo;

import java.util.Date;

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
public abstract class Entidade {
	private Date dataCadaastro;
	private Date dataAtualizacao;

	public Date getDataCadaastro() {
		return dataCadaastro;
	}

	public void setDataCadaastro(Date dataCadaastro) {
		this.dataCadaastro = dataCadaastro;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

}