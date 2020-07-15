package br.com.magtech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_MAGTECH_LOGIN")
@SequenceGenerator(name = "login", sequenceName = "SQ_TB_LOGIN", allocationSize = 1)
public class Login {
	
	@Id
	@Column(name = "cd_login", nullable = false, length = 6)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "login")
	private int codigo;
	
	@Column(name = "ds_email", nullable = false, length = 50)
	private String email;
	
	@Column(name = "ds_senha", nullable = false, length = 25)
	private String senha;
	
	@Column(name = "DS_REGISTRO", length = 12)
	private String registro;
	
	public Login(int codigo, String email, String senha, String registro) {
		super();
		this.codigo = codigo;
		this.email = email;
		this.senha = senha;
		this.registro = registro;
	}
	
	public Login() {
		super();
	}
	
	// Foreign Key
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
}
