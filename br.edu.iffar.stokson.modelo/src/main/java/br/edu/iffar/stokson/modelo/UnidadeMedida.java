package br.edu.iffar.stokson.modelo;

/**
 * <p>
 * Representa as possíveis unidade de medida que um produto pode ter, por
 * exemplo, Kilograma(kg), Litro (l), Mililitro (ml) entre outros
 * </p>
 * 
 * @author Fernando Luis
 * @since 29 de ago de 2018 21:25:01
 */
public class UnidadeMedida extends Entidade {
	private long idUnidadeMedida;
	private String descricao;
	private String sigla;

	public long getIdUnidadeMedida() {
		return idUnidadeMedida;
	}

	public void setIdUnidadeMedida(long idUnidadeMedida) {
		this.idUnidadeMedida = idUnidadeMedida;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

}
