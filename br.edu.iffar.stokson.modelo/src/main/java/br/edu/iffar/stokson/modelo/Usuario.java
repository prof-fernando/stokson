package br.edu.iffar.stokson.modelo;

/**
 * <p>
 * Entidade (classe persistivel) que representa os dados de um operador do
 * sistema
 * </p>
 * 
 * @author fernando
 * @since 28/08/2018 20:27
 */
public class Usuario extends Entidade {
	private long idUsuario;
	private String nome;
	private String email;
	private String senha;

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
