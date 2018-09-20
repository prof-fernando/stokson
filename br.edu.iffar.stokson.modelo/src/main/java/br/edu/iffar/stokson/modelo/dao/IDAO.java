package br.edu.iffar.stokson.modelo.dao;

import java.util.List;

import br.edu.iffar.stokson.modelo.AEntidade;
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
	public void gravar(AEntidade entidade);

	/**
	 * <p>
	 * Remove definitivamente uma entidade no banco de dados
	 * </p>
	 */
	public void deletar(AEntidade entidade);

	/**
	 * <p>
	 * Busca uma entidade a partir de seu campo chave
	 * </p>
	 * 
	 * @param id
	 *            Valor utilizado para buscar a entidade (chave primaria)
	 * @return Entidade carregada a partir do id
	 */
	public AEntidade buscaPorID(long id);

	/**
	 * <p>
	 * Retorna todos as entidade existentes no banco, equivalente ao comando select
	 *  from Entidade. As informações são ordenadas pelo campo descricao
	 * </p>
	 * 
	 * @return Listagem exclusiva contendo todos as entidade 
	 * do banco
	 */
	public List<? extends  AEntidade> buscaTodos();
	/**
	 * <p>
	 * Cria uma instancia de implementação especifica para uma entidade, ou seja,
	 * se invocarmos o método com a entidade {@link Produto} teremos como retornoi
	 * uma classe concreta que implementará a interface {@link IProdutoDAO}. Este método
	 * implementa o padrão de projeto Factory Abstract Method 
	 * </p>
	 * @param classeEntidade classe da entidade que se deseja criar um novo dao
	 * @return Implementação concreta da interface específica da entidade solicitada
	 */
	public <Futuro extends IDAO> Futuro criaDAO(Class<? extends AEntidade> classeEntidade);
}
