package br.com.magtech.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_MAGTECH_USUARIO_NOTIFICACAO")
@IdClass(UsuarioNotificacaoPK.class)
public class UsuarioNotificacao {
	@Id
	@ManyToOne
	@JoinColumn(name="cd_usuario")
	private Usuario usuario;
	
	@Id
	@ManyToOne
	@JoinColumn(name="cd_notificacao")
	private Notificacao notificacao;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_recebimento", nullable = false)
	private Calendar recebimento;

	public UsuarioNotificacao() {
		super();
	}

	public Calendar getRecebimento() {
		return recebimento;
	}

	public void setRecebimento(Calendar recebimento) {
		this.recebimento = recebimento;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Notificacao getNotificacao() {
		return notificacao;
	}

	public void setNotificacao(Notificacao notificacao) {
		this.notificacao = notificacao;
	}
	
}
