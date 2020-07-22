package br.com.magtech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_MAGTECH_PROFISSIONAL_SAUDE")
public class ProfissionalSaude {

	@Column(name = "ds_identificacao_prof", length = 12, nullable = false, unique = true)
	private String identifica��o;
	
	@Column(name = "ds_cargo", length = 100, nullable = false)
	private String cargo;
	
	@Column(name = "nm_instituicao_saude", length = 50, nullable = false)
	private String nomeInstitui��o;
	
	@Column(name = "nr_telefone_instituicao", precision = 11, nullable = true)
	private long telefone;

	@OneToOne
	@JoinColumn(name = "cd_usuario")
	private Usuario usuario;
	
	public ProfissionalSaude(String identifica��o, String cargo, String nomeInstitui��o, long telefone) {
		super();
		this.identifica��o = identifica��o;
		this.cargo = cargo;
		this.nomeInstitui��o = nomeInstitui��o;
		this.telefone = telefone;
	}

	public ProfissionalSaude() {
		super();
	}

	public String getIdentifica��o() {
		return identifica��o;
	}

	public void setIdentifica��o(String identifica��o) {
		this.identifica��o = identifica��o;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNomeInstitui��o() {
		return nomeInstitui��o;
	}

	public void setNomeInstitui��o(String nomeInstitui��o) {
		this.nomeInstitui��o = nomeInstitui��o;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
