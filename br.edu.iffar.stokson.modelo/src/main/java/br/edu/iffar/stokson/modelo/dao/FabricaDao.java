package br.edu.iffar.stokson.modelo.dao;

/**
 * <p>
 * Classe é responsável por definir o modelo de persitência que a aplicação vai
 * utilizar, determina-se um modelo de implementação para o padrão DAO (data
 * access object). A classe implementa o padrao singleton
 * </p>
 * 
 * @author Fernando Luis
 * @since 19 de set de 2018 21:11:13
 */
public class FabricaDao {
	// armazena uma classe concreta que implementa o modelo DAO
	private static IDAO implementacaoDAO;

	/**
	 * <p>
	 * Retorna a instancia que implementa a interface {@link IDAO}
	 * </p>
	 * 
	 * @return Instancia que implementa {@link IDAO}
	 * @exception Lança
	 *                uma exceção caso o modelo de persistencia não tenha sido
	 *                informado
	 */
	public static IDAO getModeloImplementacao() {
		if (implementacaoDAO == null) {
			throw new RuntimeException(
					"Fabrica de DAO não inicializada, chame o metodo FabricaDAO.defineModeloPersistencia");
		}

		return implementacaoDAO;
	}
	/**
	 * <p>
	 * Possibilita definir o modelo de persistencia adotado pela 
	 * aplicação
	 * </p>
	 * @param impl classe contrcreta que impleta {@link IDAO}
	 */
	public static void defineModeloPersistencia(IDAO impl) {
		implementacaoDAO = impl;
	}
}
