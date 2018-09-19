package br.edu.iffar.stokson.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * <p>
 * Agrupador de produtos, os produto podem ser segmentados por categorias. Uma
 * categoria pode ser filha de outra, por exemplo, na categoria bebidas podemos
 * encontrar a subcategoria refrigerantes ou sucos, assim como podemos ter
 * multiplos níveis:
 * 
 * <pre>
 *      bebiba -> alcólica -> destilados ou
 *      bebiba -> alcólica -> cervejas
 * </pre>
 * </p>
 * 
 * @author Fernando Luis
 * @since 29 de ago de 2018 21:30:00
 */
@Entity
public class CategoriaProduto extends Entidade {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idCategoriaProduto;
	@Column(nullable=false, length=45)
	private String descricao;
	@ManyToOne
	@JoinColumn(name="idCategoriaSuperior")
	private CategoriaProduto categoriaSuperior;

	public long getIdCategoriaProduto() {
		return idCategoriaProduto;
	}

	public void setIdCategoriaProduto(long idCategoriaProduto) {
		this.idCategoriaProduto = idCategoriaProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public CategoriaProduto getCategoriaSuperior() {
		return categoriaSuperior;
	}

	public void setCategoriaSuperior(CategoriaProduto categoriaSuperior) {
		this.categoriaSuperior = categoriaSuperior;
	}

}
