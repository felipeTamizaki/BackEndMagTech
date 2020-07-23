package br.com.magtech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_MAGTECH_USUARIO_COMUM")
public class UsuarioComum {
	
	@Column(name = "ds_tipo_sanguineo", nullable = false, length = 3)
	private String tpSangue;
	@Column(name = "st_fumante", nullable = false)
	private boolean fumante;
	@Column(name = "st_abstemia", nullable = false)
	private boolean abstemia;
	@Column(name = "st_doador", nullable = false)
	private boolean doador;
	
	@Column(name = "fl_exames", length = 200)
	private String exames;
	@Column(name = "fl_historico_consulta", length = 200)
	private String historico;
	@Column(name = "st_categoria", precision = 1)
	private int categoria;
	@Column(name = "ds_alergia", length = 70)
	private String alergia;
	@Column(name = "ds_doenca", length = 70)
	private String doenca;
	@Column(name = "ds_remedio_controlado", length = 70)
	private String remedioCtrl;
	
	@OneToOne
	@JoinColumn(name = "cd_usuario")
	private Usuario usuario;
	
	public UsuarioComum(String tpSangue, boolean fumante, boolean abstemia, boolean doador, String exames,
			String historico, int categoria, String alergia, String doenca, String remedioCtrl) {
		super();
		this.tpSangue = tpSangue;
		this.fumante = fumante;
		this.abstemia = abstemia;
		this.doador = doador;
		this.exames = exames;
		this.historico = historico;
		this.categoria = categoria;
		this.alergia = alergia;
		this.doenca = doenca;
		this.remedioCtrl = remedioCtrl;
	}

	public UsuarioComum() {
		super();
	}

	public String getTpSangue() {
		return tpSangue;
	}

	public void setTpSangue(String tpSangue) {
		this.tpSangue = tpSangue;
	}

	public boolean isFumante() {
		return fumante;
	}

	public void setFumante(boolean fumante) {
		this.fumante = fumante;
	}

	public boolean isAbstemia() {
		return abstemia;
	}

	public void setAbstemia(boolean abstemia) {
		this.abstemia = abstemia;
	}

	public boolean isDoador() {
		return doador;
	}

	public void setDoador(boolean doador) {
		this.doador = doador;
	}

	public String getExames() {
		return exames;
	}

	public void setExames(String exames) {
		this.exames = exames;
	}

	public String getHistorico() {
		return historico;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public String getAlergia() {
		return alergia;
	}

	public void setAlergia(String alergia) {
		this.alergia = alergia;
	}

	public String getDoenca() {
		return doenca;
	}

	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}

	public String getRemedioCtrl() {
		return remedioCtrl;
	}

	public void setRemedioCtrl(String remedioCtrl) {
		this.remedioCtrl = remedioCtrl;
	}
}
