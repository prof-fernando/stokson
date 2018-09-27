package br.edu.iffar.stokson.controle;

import br.edu.iffar.stokson.modelo.Usuario;
import br.edu.iffar.stokson.modelo.dao.FabricaDao;
import br.edu.iffar.stokson.modelo.dao.IUsuarioDAO;

/**
 * <p>
 * Classe resposável pelas regras de negócio que envolvem um usuário
 * </p>
 * 
 * @author Fernando Luis
 * @since 26 de set de 2018 21:36:28
 */
public class UsuarioLogic {
	// referencia a especificação de presistencia
	IUsuarioDAO dao;

	public UsuarioLogic() {
		// inicializa a especificacao com o modelo concreto de implementacao
		dao = FabricaDao.getModeloImplementacao().criaDAO(Usuario.class);
	}

	
	public void gravarUsuario(Usuario u){
		// antes de gravar verifica se já não existe um usuario com o email 
		// especificao, caso exista, realiza-se o update ao inves do insert
		Usuario aux = dao.buscaPorEmail(u.getEmail());
		if(aux != null) {
			// existe um usuario com este email
			// neste caso faz-se a atualização
			u.setIdUsuario(aux.getIdUsuario());
		}
		dao.gravar(u);
	}


	public Usuario buscaPorUsuarioId(int i) {
		return (Usuario) dao.buscaPorID(8);
	}
}
