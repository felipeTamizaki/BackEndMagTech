package br.com.magtech.entity;

import java.io.Serializable;

public class PreferenciasPK implements Serializable {
	private int codigo;
	private int configGeral;
	
	public PreferenciasPK() {}

	public PreferenciasPK(int codigo, int configGeral) {
		super();
		this.codigo = codigo;
		this.configGeral = configGeral;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + configGeral;
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
		PreferenciasPK other = (PreferenciasPK) obj;
		if (codigo != other.codigo)
			return false;
		if (configGeral != other.configGeral)
			return false;
		return true;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getConfigGeral() {
		return configGeral;
	}

	public void setConfigGeral(int configGeral) {
		this.configGeral = configGeral;
	}
	
}
