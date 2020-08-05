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
@Table(name="T_MAGTECH_COMENTARIO")
@SequenceGenerator(name="comentario", sequenceName="SQ_T_COMENTARIO", allocationSize=1)
public class Comentario {
	@Id
	@Column(name="cd_comentario", precision=11)
	@GeneratedValue(generator="comentario", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_comentario", nullable=false)
	private Calendar dataComentario;
	
	@Column(name="ds_conteudo", length=4000)
	private String conteudo;
	
	@Column(name="fl_imagem", length=200)
	private String imagem;

	@ManyToOne
	@JoinColumn(name="cd_post")
	private Post post;
	
	public Comentario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comentario(Calendar dataComentario, String conteudo, String imagem) {
		super();
		this.dataComentario = dataComentario;
		this.conteudo = conteudo;
		this.imagem = imagem;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Calendar getDataComentario() {
		return dataComentario;
	}

	public void setDataComentario(Calendar dataComentario) {
		this.dataComentario = dataComentario;
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

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}
	
}
