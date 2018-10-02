package br.edu.iffar.stokson.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * <p>
 * Entidade (classe persistivel) que representa os dados de um operador do
 * sistema
 * </p>
 * 
 * @author fernando
 * @since 28/08/2018 20:27
 */
@Entity
public class Usuario extends AEntidade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUsuario;
	@Column(nullable = false, length = 45)
	private String nome;
	@Column(nullable = false, length = 200)
	private String email;
	@Column(nullable = false, length = 300)
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

	public long getId() {
		return getIdUsuario();
	}

}
