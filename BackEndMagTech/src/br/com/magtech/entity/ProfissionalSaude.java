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
	private String identificação;
	
	@Column(name = "ds_cargo", length = 100, nullable = false)
	private String cargo;
	
	@Column(name = "nm_instituicao_saude", length = 50, nullable = false)
	private String nomeInstituição;
	
	@Column(name = "nr_telefone_instituicao", precision = 11, nullable = true)
	private long telefone;

	@OneToOne
	@JoinColumn(name = "cd_usuario")
	private Usuario usuario;
	
	public ProfissionalSaude(String identificação, String cargo, String nomeInstituição, long telefone) {
		super();
		this.identificação = identificação;
		this.cargo = cargo;
		this.nomeInstituição = nomeInstituição;
		this.telefone = telefone;
	}

	public ProfissionalSaude() {
		super();
	}

	public String getIdentificação() {
		return identificação;
	}

	public void setIdentificação(String identificação) {
		this.identificação = identificação;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNomeInstituição() {
		return nomeInstituição;
	}

	public void setNomeInstituição(String nomeInstituição) {
		this.nomeInstituição = nomeInstituição;
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
