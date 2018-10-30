package br.edu.iffar.stokson.visao.desktop;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * <p>
 * Interface qye representa a listagem de produtos, permitindo a busca e
 * apresentação dos produtos cadastrados
 * </p>
 * 
 * @author Fernando Luis
 * @since Oct 24, 2018 9:59:26 PM
 */
public class FrmListarProduto extends JFrame {

	
	private FrmPrincipal telaPrincipal;

	public FrmListarProduto( FrmPrincipal telaPrincipal ) {
		this.telaPrincipal = telaPrincipal;
		// ocultar a tela inicial
		this.telaPrincipal.setVisible(false);
		// define o titulo
		setTitle(" :: Listagem de produto :: ");
		// centraliza tela
		setLocationRelativeTo(null);
		// define um tamanho inicial
		setSize(640, 480);
		criaComponentesVisuais();
		// deixa  a tela atual visivel
		setVisible(true);
	}

	private void criaComponentesVisuais() {
		JLabel label = new JLabel("Busca");
		JTextField txtBuscar  = new  JTextField();
		JButton btnBuscar = new JButton("ok");
		JButton btnAdicionar = new JButton("+ novo");
		JButton btnVoltar = new JButton("<- voltar");
		
		
		JTable tabela = new JTable();
		String[] colunas = new String[]{ "Descrição", "Grupo", "Medida","--","--"  };
		
		DefaultTableModel modelo = new DefaultTableModel(colunas,0);
		tabela.setModel(modelo);
		
		
		JScrollPane scrollPanel = new JScrollPane(tabela);
		
		
		
		// primeira linha
		JPanel linha1 = new JPanel();
		linha1.add(label);
		linha1.add(txtBuscar);
		linha1.add(btnBuscar);
		
		getContentPane().add(linha1);
	}
	
}
