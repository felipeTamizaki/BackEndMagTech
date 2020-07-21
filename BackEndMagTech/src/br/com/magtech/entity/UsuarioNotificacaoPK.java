package br.com.magtech.entity;

import java.io.Serializable;

public class UsuarioNotificacaoPK implements Serializable {
	private int usuario;
	private int notificacao;
	
	public UsuarioNotificacaoPK() {}

	public UsuarioNotificacaoPK(int usuario, int notificacao) {
		this.usuario = usuario;
		this.notificacao = notificacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + notificacao;
		result = prime * result + usuario;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioNotificacaoPK other = (UsuarioNotificacaoPK) obj;
		if (notificacao != other.notificacao)
			return false;
		if (usuario != other.usuario)
			return false;
		return true;
	}

	public int getUsuario() {
		return usuario;
	}

	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}

	public int getNotificacao() {
		return notificacao;
	}

	public void setNotificacao(int notificacao) {
		this.notificacao = notificacao;
	}
	
}
