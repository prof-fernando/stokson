package br.edu.iffar.stokson.modelo;

import java.util.Date;

/**
 * <p>
 * Entidade que representa um produto.
 * </p>
 * 
 * @author Fernando Luis
 * @since 29 de ago de 2018 21:46:21
 */
public class Produto extends Entidade {
	private long idProduto;
	private String codigoBarras;
	private String descricao;
	private float quantidadeMinima;
	private Date dataValidade;
	private CategoriaProduto categoriaProduto;
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
