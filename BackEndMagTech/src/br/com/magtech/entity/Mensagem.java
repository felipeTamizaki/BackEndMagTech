package br.com.magtech.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_MAGTECH_MENSAGEM")
@SequenceGenerator(name = "mensagem", sequenceName = "SQ_T_MENSAGEM", allocationSize = 1)
public class Mensagem {

	@Id
	@Column(name = "cd_mensagem", nullable = false, precision = 9)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mensagem")
	private int codigo;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_postagem", nullable = false)
	private Calendar dtPostagem;
	
	@Column(name = "ds_conteudo", length = 400)
	private String conteudo;
	
	@Column(name = "fl_imagem", length = 200)
	private String imagem;
	
	@ManyToOne
	@JoinColumn(name="cd_usuario")
	private Usuario usuario;
	
	public Mensagem(Calendar dtPostagem, String conteudo, String imagem) {
		super();
		this.dtPostagem = dtPostagem;
		this.conteudo = conteudo;
		this.imagem = imagem;
	}
	
	public Mensagem() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Calendar getDtPostagem() {
		return dtPostagem;
	}

	public void setDtPostagem(Calendar dtPostagem) {
		this.dtPostagem = dtPostagem;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}	
	
}
