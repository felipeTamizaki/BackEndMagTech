package br.com.magtech.entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.magtech.entity.emum.Genero;

@Entity
@Table(name = "T_MAGTECH_USUARIO")
@SequenceGenerator(name = "usuario", sequenceName = "SQ_TB_USUARIO", allocationSize = 1)
public class Usuario {

	@Id
	@Column(name = "cd_usuario", nullable = false, precision = 6)
	@GeneratedValue(generator = "usuario", strategy = GenerationType.SEQUENCE)
	private int codigo;

	@Column(name = "nm_usuario", length = 120, nullable = false)
	private String nome;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_nascimento", nullable = false)
	private Calendar dtNascimento;

	@Column(name = "fl_foto", length = 200, nullable = false)
	private String foto;

	@Column(name = "ds_estado", length = 2, nullable = false)
	private String estado;

	@Column(name = "nr_telefone", precision = 11, nullable = false)
	private long telefone;

	@Enumerated(EnumType.STRING)
	@Column(name = "ds_genero", length = 16, nullable = false)
	private Genero genero;

	@Column(name = "ds_bio", length = 100, nullable = true)
	private String bio;

	// RELACIONAMENTO
	
	@OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private ProfissionalSaude profSaude;
	
	@OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private UsuarioComum usuarioComum;  
	
	@OneToOne(mappedBy = "usuario")
	private Login login;
	
	@OneToMany(mappedBy = "usuario")
	private List<Post> posts = new ArrayList<Post>();
	
	public Usuario() {
		super();
	}

	public Usuario(String nome, Calendar dtNascimento, String foto, String estado, long telefone,
			Genero genero, String bio) {
		super();
		this.nome = nome;
		this.dtNascimento = dtNascimento;
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

	public Calendar getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Calendar dtNascimento) {
		this.dtNascimento = dtNascimento;
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

	public Login getLogin() {
		return login;
	}
	
	public void setLogin(Login login) {
		this.login = login;
	}
	
	public List<Post> getPosts() {
		return posts;
	}
	
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	
	public ProfissionalSaude getProfSaude() {
		return profSaude;
	}

	public void setProfSaude(ProfissionalSaude profSaude) {
		this.profSaude = profSaude;
	}

	// Metodo para adicionar um post à lista do usuário
	public void addPost(Post post) {
		post.setUsuario(this);
		posts.add(post);
	}
}
