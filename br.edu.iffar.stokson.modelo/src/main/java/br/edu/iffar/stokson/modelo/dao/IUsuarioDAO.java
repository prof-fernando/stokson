package br.edu.iffar.stokson.modelo.dao;
/**
 * <p>
 * Define os comportamentos comuns aos usuarios
* </p>
* @author Fernando Luis
* @since  5 de set de 2018 21:42:21
*/

import br.edu.iffar.stokson.modelo.Usuario;

public interface IUsuarioDAO extends IDAO {
	/**
	 * <p>
	 * Busc aum usuario a apartir de um endereco de email, caso nao exista nenhumja
	 * ocorrencia retorna-se null
	 * 
	 * @param email
	 *            endereço utilizado na busca
	 * @return usuario associado ao email
	 */
	public Usuario buscaPorEmail(String email);

}
