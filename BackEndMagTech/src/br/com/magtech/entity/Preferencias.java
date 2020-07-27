package br.com.magtech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_MAGTECH_PREFERENCIAS")
@SequenceGenerator(name="preferencias", sequenceName="SQ_T_PREFERENCIAS", allocationSize=1)
@IdClass(PreferenciasPK.class)
public class Preferencias {
	@Id
	@Column(name="cd_preferencias", precision=1)
	@GeneratedValue(generator="preferencias", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_preferencias", nullable=false, length=30)
	private String preferencias;
	
	@Column(name="fl_icone", nullable=false, length=200)
	private String icone;
	
	@Column(name="st_preferencias", nullable=false, length=150)
	private String status;

	@Id
	@OneToOne
	@JoinColumn(name="cd_configuracao")
	private ConfiguracaoGeral configGeral;
	
	public Preferencias() {
		super();
	}

	public Preferencias(String preferencias, String icone, String status) {
		super();
		this.preferencias = preferencias;
		this.icone = icone;
		this.status = status;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPreferencias() {
		return preferencias;
	}

	public void setPreferencias(String preferencias) {
		this.preferencias = preferencias;
	}

	public String getIcone() {
		return icone;
	}

	public void setIcone(String icone) {
		this.icone = icone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
