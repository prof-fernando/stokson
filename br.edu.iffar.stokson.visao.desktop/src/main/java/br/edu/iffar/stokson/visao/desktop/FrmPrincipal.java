package br.edu.iffar.stokson.visao.desktop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import br.edu.iffar.stokson.dao.hibernate.HibernateDAO;
import br.edu.iffar.stokson.modelo.dao.FabricaDao;

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
		desenhaInterface();
		
		try {
			UIManager.setLookAndFeel(    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"     );
		} catch (Exception e) {
		// fukll ignoire
		}
		
		setVisible(true);
	
	}

	private void desenhaInterface() {
         JButton btnGravar =  new JButton("Gravar");
         getContentPane().add(btnGravar);
         btnGravar.addActionListener(  new ActionListener() {
			public void actionPerformed(ActionEvent e) {
              new FrmListarProduto(   FrmPrincipal.this );
			}
		});
	}

	public static void main(String[] args) {
		new FrmPrincipal();
	
		FabricaDao.defineModeloPersistencia(new HibernateDAO());
	}
}
