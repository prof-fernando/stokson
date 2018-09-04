package br.edu.iffar.stokson.modelo;

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
public class CategoriaProduto extends Entidade {
	private long idCategoriaProduto;
	private String descricao;
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
