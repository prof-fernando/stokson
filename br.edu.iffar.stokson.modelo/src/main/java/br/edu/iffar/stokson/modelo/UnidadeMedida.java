package br.edu.iffar.stokson.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * <p>
 * Representa as possíveis unidade de medida que um produto pode ter, por
 * exemplo, Kilograma(kg), Litro (l), Mililitro (ml) entre outros
 * </p>
 * 
 * @author Fernando Luis
 * @since 29 de ago de 2018 21:25:01
 */
@Entity
public class UnidadeMedida extends AEntidade {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idUnidadeMedida;
	@Column(nullable = false, length=45)
	private String descricao;
	@Column(nullable = false, length=2)
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

	public long getId() {
		return getIdUnidadeMedida();
	}

	/**
	 * <p>
	 * Sobreescrevendo método para apresentar uma informação amigável ao imprimir
	 * um objeto, como por exemplo e um JcomboBox
	 * </p>
	 */
	public String toString() {
		return  descricao +" ("+sigla+")";
	}
}
