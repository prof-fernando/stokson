package br.edu.iffar.stokson.controle;

import br.edu.iffar.stokson.modelo.UnidadeMedida;
import br.edu.iffar.stokson.modelo.dao.IUnidadeMedidaDAO;

/**
 * <p>
 * Classe com a regras de negócio para unidades de medida
 * </p>
 * 
 * @author Fernando Luis
 * @since 4 de set de 2018 19:48:35
 */
public class UnidadeMedidaLogic extends ALogic {
	private IUnidadeMedidaDAO dao;

	public UnidadeMedidaLogic() {
		super(UnidadeMedida.class);
		this.dao = getDAO();
	}
  
	
}
