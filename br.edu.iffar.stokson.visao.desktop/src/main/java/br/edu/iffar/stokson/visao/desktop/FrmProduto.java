package br.edu.iffar.stokson.visao.desktop;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.edu.iffar.stokson.modelo.CategoriaProduto;
import br.edu.iffar.stokson.modelo.Produto;
import br.edu.iffar.stokson.modelo.UnidadeMedida;
import br.edu.iffar.stokson.visao.desktop.util.Defs;

/**
 * <p>
 * Classe utilizada para inserir ou editar produtos
 * </p>
 * 
 * @author Fernando Luis
 * @since Nov 7, 2018 9:26:44 PM
 */
public class FrmProduto extends JFrame {

	private FrmListarProduto telaDeOrigem;
	private Produto produto;

	public FrmProduto(FrmListarProduto telaDeOrigem) {
		this(telaDeOrigem, null);
	}

	public FrmProduto(FrmListarProduto telaDeOrigem, Produto itemEditado) {
		this.telaDeOrigem = telaDeOrigem;
		this.produto = itemEditado;
		setTitle(":: Produto ::");
		setSize(320, 240);
		setLocationRelativeTo(null);
		this.telaDeOrigem.setVisible(false);
		criaComponentesVisuais();
		setVisible(true);
	}

	private void criaComponentesVisuais() {
		JPanel linhaForm = new JPanel();
		linhaForm.setLayout(new GridBagLayout());
		JPanel linhaBotoes = new JPanel();
		// c ria os componentes da tela
		JLabel jl1 = new JLabel("ID: ");
		JLabel jlID = new JLabel("0");
		JLabel jl2 = new JLabel("Cod. barras: ");
		JLabel jl3 = new JLabel("Descrição: ");
		JLabel jl4 = new JLabel("Data venc.: ");
		JLabel jl5 = new JLabel("Quant. minima: ");
		JLabel jl6 = new JLabel("Categoria: ");
		JLabel jl7 = new JLabel("Unidade: ");

		JTextField jtfCodigoBarras = new JTextField();
		JTextField jtfDescricao = new JTextField();
		JTextField jtfDataVenc = new JTextField();
		JTextField jtfQuantidade = new JTextField();
		JComboBox<CategoriaProduto> cmbCategoria = new JComboBox<CategoriaProduto>();
		JComboBox<UnidadeMedida> cmbUnidade = new JComboBox<UnidadeMedida>();

		JButton btnVoltar = new JButton("Voltar");
		JButton btnGravar = new JButton("Gravar");

		// linha do formulario
		// objeto de configuracao do layout
		// primeira linha
		linhaForm.add(jl1, new Defs(0, 0));
		linhaForm.add(jlID, new Defs(0, 1, true));
		linhaForm.add(jl2, new Defs(0, 2));
		linhaForm.add(jtfCodigoBarras, new Defs(0, 3, true));
		// segunda linha
		linhaForm.add(jl3, new Defs(1, 0));
		GridBagConstraints cfg = new Defs(1, 1, true);
		cfg.gridwidth = 3;
		linhaForm.add(jtfDescricao, cfg);
		// linha 3
		linhaForm.add(jl4, new Defs(2, 0));
		linhaForm.add(jtfDataVenc, new Defs(2, 1, true));
		linhaForm.add(jl5, new Defs(2, 2));
		linhaForm.add(jtfQuantidade, new Defs(2, 3, true));
		// linha 4
		linhaForm.add(jl6, new Defs(3, 0));
		linhaForm.add(cmbCategoria, new Defs(3, 1, true));
		linhaForm.add(jl7, new Defs(3, 2));
		linhaForm.add(cmbUnidade, new Defs(3, 3, true));

		// adiciona o painel a tela
		getContentPane().add(linhaForm);
	}

	@Deprecated
	private GridBagConstraints getCfg(int linha, int coluna, boolean expande) {
		GridBagConstraints cfg = new GridBagConstraints();
		cfg.gridy = linha;
		cfg.gridx = coluna;
		if (expande) {
			cfg.weightx = 1;
			cfg.fill = cfg.HORIZONTAL;
		}
		return cfg;
	}

}
