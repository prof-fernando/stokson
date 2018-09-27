package br.edu.iffar.stokson.visao.desktop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.edu.iffar.stokson.controle.UsuarioLogic;
import br.edu.iffar.stokson.dao.hibernate.HibernateDAO;
import br.edu.iffar.stokson.modelo.Usuario;
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
		setVisible(true);
	
	}

	private void desenhaInterface() {
         JButton btnGravar =  new JButton("Gravar");
         getContentPane().add(btnGravar);
         btnGravar.addActionListener(  new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                // cria o objeto de logic
				UsuarioLogic ul = new UsuarioLogic();
				// objeto que sera persistido (temporariamente)
				Usuario usu = new Usuario();

				usu.setNome("'Bastião");
				usu.setEmail("bastiao@gmail.com");
				usu.setSenha("123");
				usu.setSenha("888888");
				// solicita para a logica gravar
				ul.gravarUsuario(usu);
				// confirmação para a gravacao
				
				String msg = "Usuario gravado com sucesso, seu id é "+ usu.getIdUsuario();
				
				JOptionPane.showMessageDialog(null,msg);
				
			}
		});
	}

	public static void main(String[] args) {
		new FrmPrincipal();
		FabricaDao.defineModeloPersistencia(new HibernateDAO());
	}
}
