package br.com.magtech.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_MAGTECH_NOTIFICACAO")
@SequenceGenerator(name="notif", sequenceName="SQ_T_NOTIFICACAO", allocationSize=1)
public class Notificacao {
	@Id
	@Column(name="cd_notificacao", precision=10)
	@GeneratedValue(generator="notif", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="ds_notificacao", nullable=false, length=100)
	private String descricao;
	
	@Column(name="fl_icone", nullable=false, length=200)
	private String icone;

	@OneToMany/*(mappedBy = "notificacao")*/
	private List<UsuarioNotificacao> notificacoes;
	
	public Notificacao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Notificacao(String descricao, String icone) {
		super();
		this.descricao = descricao;
		this.icone = icone;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIcone() {
		return icone;
	}

	public void setIcone(String icone) {
		this.icone = icone;
	}

}
