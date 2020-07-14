package br.com.magtech.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.magtech.entity.emum.Genero;

@Entity
@Table(name = "T_MAGTECH_USUARIO")
@SequenceGenerator(name = "usuario", sequenceName = "SQ_TB_USUARIO", allocationSize = 1)
public class Usuario {

	@Id
	@Column(name = "cd_usuario", length = 6)
	@GeneratedValue(generator = "usuario", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name = "nm_usuario", length = 120, nullable = false)
	private String nome;
	
	@Column(name = "dt_nascimento", nullable = false)
	private Timestamp dtNacimento;
	
	@Column(name = "fl_foto", length = 200, nullable = false)
	private String foto;
	
	@Column(name = "ds_estado", length = 2, nullable = false)
	private String estado;
	
	@Column(name = "nr_telefone", length = 11, nullable = false)
	private long telefone;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "ds_genero", length = 16, nullable = false)
	private Genero genero;
	
	@Column(name = "ds_bio", length = 100 ,nullable = true)
	private String bio;
	
	public Usuario() {
		super();
	}

	public Usuario(int codigo, String nome, Timestamp dtNacimento, String foto, String estado, long telefone,
			Genero genero, String bio) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dtNacimento = dtNacimento;
		this.foto = foto;
		this.estado = estado;
		this.telefone = telefone;
		this.genero = genero;
		this.bio = bio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Timestamp getDtNacimento() {
		return dtNacimento;
	}

	public void setDtNacimento(Timestamp dtNacimento) {
		this.dtNacimento = dtNacimento;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}
}
