package br.edu.iffar.stokson.visao.desktop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import br.edu.iffar.stokson.controle.ProdutoLogic;
import br.edu.iffar.stokson.modelo.Produto;

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
	private JTable tabela;

	public FrmListarProduto(FrmPrincipal telaPrincipal) {
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
		popularTabela();
		// deixa a tela atual visivel
		setVisible(true);
	}

	private void popularTabela() {
		ProdutoLogic logica = new ProdutoLogic();
		// pega todos os produtos do banco
		List produtos = logica.buscaTodosProdutos();

		// verifica se existem itens
		if (produtos != null && produtos.size() > 0) {
			ModeloPadraoTabela modelo = (ModeloPadraoTabela) tabela.getModel();
			for (int i = 0; i < produtos.size(); i++) {
				// pega o item corrente
				Produto p = (Produto) produtos.get(i);
				Object[] linha = new Object[5];
				linha[0] = p.getDescricao();
				linha[1] = p.getCategoriaProduto().getDescricao();
				linha[2] = p.getUnidadeMedida().getDescricao();
				modelo.addRow(linha);
			} 
		}

	}

	private void criaComponentesVisuais() {
		JLabel label = new JLabel("Busca");
		JTextField txtBuscar = new JTextField();
		JButton btnBuscar = new JButton("ok");
		JButton btnAdicionar = new JButton("+ novo");
		JButton btnVoltar = new JButton("<- voltar");

		this.tabela = new JTable();
		String[] colunas = new String[] { "Descrição", "Grupo", "Medida", "--", "--" };
		// cria o modelo personalizado
		ModeloPadraoTabela modelo = new ModeloPadraoTabela(colunas);
		// adiciona a tabela
		tabela.setModel(modelo);

		JScrollPane scrollPanel = new JScrollPane(tabela);

		// primeira linha
		JPanel linha1 = new JPanel();
		// define o layout do painel
		linha1.setLayout(new GridBagLayout());
		// adiciona o label
		linha1.add(label);
		// cria o objeto para configurar a posicao dos componentes
		GridBagConstraints config = new GridBagConstraints();
		config.fill = config.HORIZONTAL;
		config.weightx = 1;
		linha1.add(txtBuscar, config);
		linha1.add(btnBuscar);

		// linha 2
		JPanel linha2 = new JPanel();
		// define o layout de modo aproveitar toda a area disponivel na horizontal
		// e vertical
		linha2.setLayout(new GridLayout(1, 1));
		linha2.add(scrollPanel);
		// linha 3
		JPanel linha3 = new JPanel();
		linha3.setBackground(Color.BLUE);

		// adiciona os paineis a tela
		getContentPane().add(linha1, BorderLayout.NORTH);
		getContentPane().add(linha2, BorderLayout.CENTER);
		getContentPane().add(linha3, BorderLayout.SOUTH);

		// define uma acao ao fechar a janela atual
		addWindowListener(new WindowAdapter() {

			public void windowClosing(java.awt.event.WindowEvent e) {
				// torna a tela inicial/menu visivel
				telaPrincipal.setVisible(true);
			}

		});
	}

}
