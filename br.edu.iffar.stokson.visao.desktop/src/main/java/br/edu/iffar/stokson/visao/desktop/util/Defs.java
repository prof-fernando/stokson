package br.edu.iffar.stokson.visao.desktop.util;

import java.awt.GridBagConstraints;
import java.awt.Insets;

/**
 * <p>
 * Classe utilitária para define o posicionamento dos elementos na tela, deve
 * ser utilizado em conjunto com GridBagLayout
 * </p>
 *
 * @author Fernando L.
 **/
public class Defs extends GridBagConstraints {

	public Defs(int linha, int coluna, boolean hGrab, boolean vGrab, int posicao) {
		gridy = linha; // linha
		gridx = coluna; // coluna

		if (hGrab && vGrab) {
			fill = BOTH;
			weighty = 1.0; // linha
			weightx = 1.0; // coluna
		} else if (hGrab) {
			fill = HORIZONTAL;
			weightx = 1.0; // coluna
		} else if (vGrab) {
			fill = VERTICAL;
			weighty = 1.0; // linha
		}
		anchor = posicao;
		// espacamento
		insets = new Insets(0, 1, 1, 1);
	}

	public Defs(int linha, int coluna, boolean hGrab) {
		this(linha, coluna, hGrab,false);
	}
	public Defs(int linha, int coluna, boolean hGrab, boolean vGrab) {
		this(linha, coluna, hGrab, vGrab, LINE_START);
	}

	public Defs(int linha, int coluna) {
		this(linha, coluna, false, false);
	}

	public Defs(int linha, int coluna, int posicao) {
		this(linha, coluna, false, false, posicao);
	}

	public Defs setPadding(int value) {
		insets = new Insets(value, value, value, value);
		return this;
	}

	public Defs colSpan(int value) {
		gridwidth = value;
		return this;
	}

	public Defs rowSpan(int value) {
		gridheight = value;
		return this;
	}
}