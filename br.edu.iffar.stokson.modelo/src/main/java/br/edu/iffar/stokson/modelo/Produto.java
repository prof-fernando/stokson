package br.edu.iffar.stokson.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * <p>
 * Entidade que representa um produto.
 * </p>
 * 
 * @author Fernando Luis
 * @since 29 de ago de 2018 21:46:21
 */
@Entity
public class Produto extends AEntidade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProduto;
	@Column(length = 13)
	private String codigoBarras;
	@Column(nullable = false, length = 50)
	private String descricao;
	@Column(nullable = false)
	private float quantidadeMinima;
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dataValidade;
	@ManyToOne
	@JoinColumn(name = "idCategoriaProduto", nullable = false)
	private CategoriaProduto categoriaProduto;
	@ManyToOne
	@JoinColumn(name = "idUnidadeMedida")
	private UnidadeMedida unidadeMedida;

	public long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getQuantidadeMinima() {
		return quantidadeMinima;
	}

	public void setQuantidadeMinima(float quantidadeMinima) {
		this.quantidadeMinima = quantidadeMinima;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	public CategoriaProduto getCategoriaProduto() {
		return categoriaProduto;
	}

	public void setCategoriaProduto(CategoriaProduto categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}

	public UnidadeMedida getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

}
