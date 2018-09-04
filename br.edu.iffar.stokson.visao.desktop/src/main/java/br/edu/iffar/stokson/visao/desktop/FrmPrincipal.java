package br.edu.iffar.stokson.visao.desktop;

import javax.swing.JFrame;

import br.edu.iffar.stokson.controle.ProdutoLogic;
import br.edu.iffar.stokson.modelo.Produto;

/**
 * <p>
 * Programa java que inicia a aplicaçao. Trata-se de uma janela gráfica.
 * </p>
 * 
 * @author Fernando Luis
 * @since 4 de set de 2018 20:05:46
 */
public class FrmPrincipal extends JFrame {

	public FrmPrincipal() {
		setTitle(":: STOKSON ::");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(320, 240);
		setLocationRelativeTo(null);
		setVisible(true);
		ProdutoLogic pl = new ProdutoLogic();
		pl.criarNovoProduto();
		Produto p = new Produto();
	}

	public static void main(String[] args) {
		new FrmPrincipal();
	}
}
