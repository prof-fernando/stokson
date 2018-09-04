package br.edu.iffar.stokson.modelo;

import java.util.Date;

/**
 * <p>
 * Representa as movimentações realizadas. O saldo disponível de dado produto e
 * dados através da soma de suas movimentações. De modo há: soma-se todas as
 * entradas (tipo 1) e subtrai todas as saídas (tipo 0) obtendo assim o saldo
 * atual.
 * </p>
 * 
 * @author Fernando Luis
 * @since 29 de ago de 2018 21:59:21
 */
public class Movimentacao extends Entidade {

	private long idMovimentacao;
	// tipo refere-se quando 1 entrada, 0 saida
	private int tipo;
	private float quantidade;
	// momento exato transacão
	private Date dataHora;
	private Produto produto;
	// operador que realizou a movimentacao
	private Usuario usuario;

	public long getIdMovimentacao() {
		return idMovimentacao;
	}

	public void setIdMovimentacao(long idMovimentacao) {
		this.idMovimentacao = idMovimentacao;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
