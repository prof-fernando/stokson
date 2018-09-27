package br.edu.iffar.stokson.dao.hibernate;
/**
 * <p>
 * Classe utilitária que configura e instancia uma fabrica de sessões
 *. Implementa o padrão singleton
 *
* </p>
* @author Fernando Luis
* @since  25 de set de 2018 20:00:02
*/

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.edu.iffar.stokson.modelo.CategoriaProduto;
import br.edu.iffar.stokson.modelo.Movimentacao;
import br.edu.iffar.stokson.modelo.Produto;
import br.edu.iffar.stokson.modelo.UnidadeMedida;
import br.edu.iffar.stokson.modelo.Usuario;

public class HibernateHelper {
	private static SessionFactory fabrica;

	public static Session getSession() {
		if (fabrica == null) {
			fabrica = inicializaFabrica();
		}
		return fabrica.openSession();
	}

	private static SessionFactory inicializaFabrica() {
		// instancia um objeto que representa hibernate.properties
		Configuration cfg = new Configuration();
		// informa ao hibernate quais sao as enmtidades anotadas
		cfg.addAnnotatedClass(CategoriaProduto.class);
		cfg.addAnnotatedClass(UnidadeMedida.class);
		cfg.addAnnotatedClass(Produto.class);
		cfg.addAnnotatedClass(Usuario.class);
		cfg.addAnnotatedClass(Movimentacao.class);
		// realiza a leitura do arquivo de configuracao
		cfg.configure();
		// cria uma nova fabrica
		return cfg.buildSessionFactory();
	}
}
