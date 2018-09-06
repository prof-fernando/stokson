package br.edu.iffar.stokson.modelo.dao;

import java.util.List;

import br.edu.iffar.stokson.modelo.Entidade;
import br.edu.iffar.stokson.modelo.Produto;

/**
 * <p>
 * Especifica todos os comportamentos que são comuns a todas
 * as entidades persistíveis, como por exemplo, gravar, remover, 
 * buscarPorID entre outros.
* </p>
* @author Fernando Luis
* @since  5 de set de 2018 21:45:02
*/
public interface IDAO {
	/**
	 * <p>
	 * Grava ou atualiza uma entidade no banco de dados
	 * </p>
	 */
	public void gravar(Entidade entidade);

	/**
	 * <p>
	 * Remove definitivamente uma entidade no banco de dados
	 * </p>
	 */
	public void deletar(Entidade entidade);

	/**
	 * <p>
	 * Busca uma entidade a partir de seu campo chave
	 * </p>
	 * 
	 * @param id
	 *            Valor utilizado para buscar a entidade (chave primaria)
	 * @return Entidade carregada a partir do id
	 */
	public Entidade buscaPorID(long id);

	/**
	 * <p>
	 * Retorna todos as entidade existentes no banco, equivalente ao comando select
	 *  from Entidade. As informações são ordenadas pelo campo descricao
	 * </p>
	 * 
	 * @return Listagem exclusiva contendo todos as entidade 
	 * do banco
	 */
	public List<? extends  Entidade> buscaTodos();

}
