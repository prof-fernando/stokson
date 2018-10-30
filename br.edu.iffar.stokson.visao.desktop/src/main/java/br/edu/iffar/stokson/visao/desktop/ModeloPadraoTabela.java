package br.edu.iffar.stokson.visao.desktop;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import br.edu.iffar.stokson.modelo.AEntidade;

/**
 * <p>
 * Modelo padrao para gerenciar as informações das tabelas com base em entidades
 * </p>
 * 
 * @author Fernando Luis
 * @since Oct 30, 2018 7:40:12 PM
 */
public class ModeloPadraoTabela extends DefaultTableModel {
    private List<AEntidade> dados;
    /**
     * <p>
     * Cria um modelo personalizado a partir de um array com as colunas
     * </p>
     */
    public ModeloPadraoTabela( String[] colunas ) {
    	super(colunas,0);
    }
    
	/**
	 * <p>
	 * Busca o objeto selecionado com base em uma linha, normalmente, trata-se
	 * da linha selecionada
	 * </p>
	 */
    public AEntidade getItemSelecionado( int linha ) {
    	return  dados.get(linha);
    }
    /**
     * <p>
     * Permite definir a lista de valores do modelo
     * </p>
     */
    public void setDados(List<AEntidade> listagem) {
    	this.dados = listagem;
    }
    
    
}
