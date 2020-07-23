package br.com.magtech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_MAGTECH_CONFIGURACAO_GERAL")
@SequenceGenerator(name="config", sequenceName="SQ_T_CONFIGURACAO_GERAL", allocationSize=1)
public class ConfiguracaoGeral {
	@Id
	@Column(name="cd_configuracao", precision=2)
	private int codigo;
	
	@Column(name="st_visibilidade", nullable=false, precision=1)
	private int visibilidade;
	
	@Column(name="st_verificacao_duas_etapas", precision=1)
	private int verificacaoDuasEtapas;

	
	// Relacionamentos 
	 
	@OneToOne
	@JoinColumn(name = "cd_post")
	private Post post;
	
	@OneToOne
	@JoinColumn(name = "cd_mensagem")
	private Mensagem mensagem;

	public ConfiguracaoGeral() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConfiguracaoGeral(int visibilidade, int verificacaoDuasEtapas) {
		super();
		this.visibilidade = visibilidade;
		this.verificacaoDuasEtapas = verificacaoDuasEtapas;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getVisibilidade() {
		return visibilidade;
	}

	public void setVisibilidade(int visibilidade) {
		this.visibilidade = visibilidade;
	}

	public int getVerificacaoDuasEtapas() {
		return verificacaoDuasEtapas;
	}

	public void setVerificacaoDuasEtapas(int verificacaoDuasEtapas) {
		this.verificacaoDuasEtapas = verificacaoDuasEtapas;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public Mensagem getMensagem() {
		return mensagem;
	}

	public void setMensagem(Mensagem mensagem) {
		this.mensagem = mensagem;
	}
	 
}
