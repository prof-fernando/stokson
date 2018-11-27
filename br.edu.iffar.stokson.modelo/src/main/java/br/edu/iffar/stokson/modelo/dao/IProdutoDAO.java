package br.edu.iffar.stokson.modelo.dao;

import java.util.List;

import br.edu.iffar.stokson.modelo.Produto;

/**
 * <p>
 * Onterface que descreve os comportamentos comuns a produtos
 * </p>
 * 
 * @author Fernando Luis
 * @since 5 de set de 2018 21:27:38
 */
public interface IProdutoDAO extends IDAO {
	/**
	 * <p>
	 * Busca o produto associado ao código de barra informado
	 * </p>
	 * 
	 * @param codigo
	 *            String com contendo o código de barras
	 * @return Produto associado ao código de barras
	 */
	public Produto buscaPorCodigoBarras(String codigo);
	/**
	 * <p>
	 * Busca pelo campo ou coluna descricao e código de barras, de forma a retornar
	 * os produtos que contenham parcialmente ou em sua tolidade o termo digitado.
	 * Equivale a um comomano ilike em banco de dados
	 * </p>
	 */
	public List<Produto> buscaPorSimilaridade(String termo);
	
}
